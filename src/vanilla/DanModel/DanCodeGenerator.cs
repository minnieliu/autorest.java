﻿using AutoRest.Core;
using AutoRest.Core.Model;
using AutoRest.Core.Utilities;
using AutoRest.Extensions.Azure;
using AutoRest.Java.Azure;
using AutoRest.Java.Azure.Fluent.Model;
using AutoRest.Java.Azure.Model;
using AutoRest.Java.Model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AutoRest.Java.DanModel
{
    public static class DanCodeGenerator
    {
        public static IEnumerable<JavaFile> GetModelJavaFiles(CodeModel codeModel, Settings settings, Func<string,string> relativePackagePathToFolderPathFunction, Func<string,string> relativePackageToPackageFunction)
        {
            List<JavaFile> exceptionJavaFiles = new List<JavaFile>();
            AddModelJavaFiles(codeModel, settings, exceptionJavaFiles, relativePackagePathToFolderPathFunction, relativePackageToPackageFunction);
            return exceptionJavaFiles;
        }

        public static void AddModelJavaFiles(CodeModel codeModel, Settings settings, IList<JavaFile> javaFiles, Func<string, string> relativePackagePathToFolderPathFunction, Func<string, string> relativePackageToPackageFunction)
        {
            string headerComment = settings.Header;

            string package = GetPackage(codeModel, relativePackageToPackageFunction);
            string folderPath = GetFolderPath(codeModel, relativePackagePathToFolderPathFunction);
            int maximumHeaderCommentWidth = settings.MaximumCommentColumns;

            foreach (CompositeTypeJv modelType in codeModel.ModelTypes.Union(codeModel.HeaderTypes))
            {
                bool shouldGenerate = true;

                if (modelType is CompositeTypeJva modelTypeJva)
                {
                    bool isExternalExtension =
                        modelType.Extensions.ContainsKey(AzureExtensions.ExternalExtension) &&
                        (bool)modelType.Extensions[AzureExtensions.ExternalExtension];

                    shouldGenerate = !isExternalExtension && !modelTypeJva.IsResource;
                }

                if (shouldGenerate)
                {
                    JavaModel javaModel = ParseModel(modelType);
                    JavaFile javaFile = javaModel.GenerateJavaFile(folderPath, headerComment, package, maximumHeaderCommentWidth);
                    javaFiles.Add(javaFile);
                }
            }
        }

        private static JavaModel ParseModel(CompositeTypeJv modelType)
        {
            IEnumerable<string> imports = ParseModelImports(modelType);

            string classComment = ParseModelClassComment(modelType);

            IEnumerable<string> classAnnotations = ParseModelClassAnnotations(modelType);

            string className = modelType.Name;

            string baseTypeName = modelType.BaseModelType?.Name?.Value;

            IEnumerable<JavaMemberVariable> memberVariables = ParseModelMemberVariables(modelType);

            return new JavaModel(imports, classComment, classAnnotations, className, baseTypeName, memberVariables);
        }

        private static IEnumerable<string> ParseModelImports(CompositeTypeJv modelType)
        {
            List<string> imports = new List<string>();
            imports.AddRange(modelType.Properties.SelectMany(pm => (pm as PropertyJv).Imports));

            if (modelType.Properties.Any(p => !p.GetJsonProperty().IsNullOrEmpty()))
            {
                imports.Add("com.fasterxml.jackson.annotation.JsonProperty");
            }

            if (modelType.Properties.Any(p => p.XmlIsAttribute))
            {
                imports.Add("com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty");
            }

            // For polymorphism
            if (modelType.BaseIsPolymorphic)
            {
                imports.Add("com.fasterxml.jackson.annotation.JsonTypeInfo");
                imports.Add("com.fasterxml.jackson.annotation.JsonTypeName");
                if (modelType.SubTypes.Any())
                {
                    imports.Add("com.fasterxml.jackson.annotation.JsonSubTypes");
                }
            }

            // For flattening
            if (modelType.NeedsFlatten)
            {
                imports.Add("com.microsoft.rest.serializer.JsonFlatten");
            }

            if (modelType is CompositeTypeJva azureModelType)
            {
                foreach (Property property in azureModelType.Properties)
                {
                    if (property.ModelType.IsResource())
                    {
                        imports.Add($"com.microsoft.azure.{property.ModelType.Name}");
                    }
                }

                if (azureModelType.BaseModelType != null && (azureModelType.BaseModelType.Name == "Resource" || azureModelType.BaseModelType.Name == "SubResource"))
                {
                    imports.Add("com.microsoft.azure." + azureModelType.BaseModelType.Name);
                }

                if (azureModelType is CompositeTypeJvaf fluentModelType)
                {
                    if (fluentModelType.BaseModelType != null && fluentModelType.BaseModelType.Name.ToString().EndsWith("Inner", StringComparison.Ordinal) ^ fluentModelType.IsInnerModel)
                    {
                        imports.AddRange(fluentModelType.BaseModelType.ImportSafe());
                    }
                }
            }

            return imports;
        }

        private static string ParseModelClassComment(CompositeTypeJv modelType)
        {
            string classComment;
            if (string.IsNullOrEmpty(modelType.Summary) && string.IsNullOrEmpty(modelType.Documentation))
            {
                classComment = $"The {modelType.Name} model.";
            }
            else
            {
                classComment = $"{modelType.Summary.EscapeXmlComment().Period()}{modelType.Documentation.EscapeXmlComment().Period()}";
            }
            return classComment;
        }

        private static IEnumerable<string> ParseModelClassAnnotations(CompositeTypeJv modelType)
        {
            List<string> classAnnotations = new List<string>();
            if (modelType.BaseIsPolymorphic)
            {
                classAnnotations.Add($"JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = \"{modelType.BasePolymorphicDiscriminator}\")");
                classAnnotations.Add($"JsonTypeName(\"{modelType.SerializedName}\")");

                List<CompositeType> types = modelType.SubTypes.ToList();
                if (types.Any())
                {
                    StringBuilder subTypeAnnotationBuilder = new StringBuilder();
                    subTypeAnnotationBuilder.AppendLine("JsonSubTypes({");

                    foreach (CompositeType subType in types.SkipLast(1))
                    {
                        subTypeAnnotationBuilder.AppendLine(GetSubTypeAnnotation(subType));
                    }
                    subTypeAnnotationBuilder.AppendLine(GetSubTypeAnnotation(types.Last(), true));

                    subTypeAnnotationBuilder.Append("})");

                    classAnnotations.Add(subTypeAnnotationBuilder.ToString());
                }
            }

            if (modelType.NeedsFlatten)
            {
                classAnnotations.Add("JsonFlatten");
            }

            return classAnnotations;
        }

        private static IEnumerable<JavaMemberVariable> ParseModelMemberVariables(CompositeTypeJv modelType)
        {
            return modelType.Properties.Select(ParseModelMemberVariable);
        }

        private static JavaMemberVariable ParseModelMemberVariable(Property property)
        {
            string comment;
            if (string.IsNullOrEmpty(property.Summary) && string.IsNullOrEmpty(property.Documentation))
            {
                comment = $"The {property.Name} property.";
            }
            else
            {
                string summary = property.Summary.EscapeXmlComment().Period();
                string documentation = property.Documentation.EscapeXmlComment().Period();

                comment = summary;
                if (!string.IsNullOrEmpty(documentation))
                {
                    if (!string.IsNullOrEmpty(comment))
                    {
                        comment += "\n";
                    }
                    comment += documentation;
                }
            }

            string annotation = null;
            string jsonSetting = property.GetJsonProperty();
            if (!string.IsNullOrEmpty(jsonSetting))
            {
                if (property.XmlIsAttribute)
                {
                    annotation = $"JacksonXmlProperty(localName = \"{property.SerializedName}\", isAttribute = true)";
                }
                else
                {
                    annotation = $"JsonProperty({jsonSetting})";
                }
            }

            bool isConstant = property.IsConstant;
            bool isReadOnly = property.IsReadOnly;

            bool isPrimitive = !(property.ModelType is CompositeType);
            JavaType wireType = new JavaType(property.ModelType.Name, isPrimitive);
            JavaType clientType = new JavaType(((IModelTypeJv)property.ModelType).ResponseVariant.Name, isPrimitive);

            string name = property.Name;

            string defaultValue;
            try
            {
                defaultValue = property.DefaultValue;
            }
            catch (NotSupportedException)
            {
                defaultValue = null;
            }

            return new JavaMemberVariable(comment, annotation, isConstant, isReadOnly, wireType, clientType, name, defaultValue);
        }

        private static string GetSubTypeAnnotation(CompositeType subType, bool isLast = false)
        {
            string subTypeAnnotation = $"@JsonSubTypes.Type(name = \"{subType.SerializedName}\", value = {subType.Name}.class)";
            if (!isLast)
            {
                subTypeAnnotation += ",";
            }
            return subTypeAnnotation;
        }

        public static IEnumerable<JavaFile> GetExceptionJavaFiles(CodeModelJv codeModel, Settings settings, Func<string, string> relativePackagePathToFolderPathFunction, Func<string, string> relativePackageToPackageFunction)
        {
            List<JavaFile> exceptionJavaFiles = new List<JavaFile>();
            AddExceptionJavaFiles(codeModel, settings, exceptionJavaFiles, relativePackagePathToFolderPathFunction, relativePackageToPackageFunction);
            return exceptionJavaFiles;
        }

        public static void AddExceptionJavaFiles(CodeModelJv codeModel, Settings settings, IList<JavaFile> javaFiles, Func<string, string> relativePackagePathToFolderPathFunction, Func<string, string> relativePackageToPackageFunction)
        {
            string headerComment = settings.Header;

            string package = GetPackage(codeModel, relativePackageToPackageFunction);
            string folderPath = GetFolderPath(codeModel, relativePackagePathToFolderPathFunction);
            int maximumHeaderCommentWidth = settings.MaximumCommentColumns;

            foreach (CompositeTypeJv exceptionType in codeModel.ErrorTypes)
            {
                string exceptionBodyTypeName = exceptionType.Name;
                string exceptionName = exceptionType.ExceptionTypeDefinitionName;

                // Skip any exceptions that are named "CloudErrorException" or have a body named
                // "CloudError" because those types already exist in the runtime.
                if (exceptionBodyTypeName != "CloudError" && exceptionName != "CloudErrorException")
                {
                    JavaException javaException = new JavaException(exceptionName, exceptionBodyTypeName);
                    JavaFile javaFile = javaException.GenerateJavaFile(folderPath, headerComment, package, maximumHeaderCommentWidth);
                    javaFiles.Add(javaFile);
                }
            }
        }

        public static IEnumerable<JavaFile> GetEnumJavaFiles(CodeModel codeModel, Settings settings, Func<string, string> relativePackagePathToFolderPathFunction, Func<string, string> relativePackageToPackageFunction)
        {
            List<JavaFile> enumJavaFiles = new List<JavaFile>();
            AddEnumJavaFiles(codeModel, settings, enumJavaFiles, relativePackagePathToFolderPathFunction, relativePackageToPackageFunction);
            return enumJavaFiles;
        }

        public static void AddEnumJavaFiles(CodeModel codeModel, Settings settings, IList<JavaFile> javaFiles, Func<string,string> relativePackagePathToFolderPathFunction, Func<string,string> relativePackageToPackageFunction)
        {
            string headerComment = settings.Header;

            string package = GetPackage(codeModel, relativePackageToPackageFunction);
            string folderPath = GetFolderPath(codeModel, relativePackagePathToFolderPathFunction);

            int maximumHeaderCommentWidth = settings.MaximumCommentColumns;

            foreach (EnumType enumType in codeModel.EnumTypes)
            {
                string enumName = enumType.Name;

                IEnumerable<JavaEnumValue> enumValues = enumType.Values
                    .Select((EnumValue value) => new JavaEnumValue(value.MemberName, value.SerializedName));

                JavaEnum javaEnum = enumType.ModelAsString ?
                    new JavaExpandableStringEnum(enumName, enumValues) :
                    new JavaEnum(enumName, enumValues);

                JavaFile javaFile = javaEnum.GenerateJavaFile(folderPath, headerComment, package, maximumHeaderCommentWidth);
                javaFiles.Add(javaFile);
            }
        }

        private static string GetPackage(CodeModel codeModel, Func<string,string> relativePackageToPackageFunction)
        {
            string package = codeModel.Namespace.ToLowerInvariant();
            if (relativePackageToPackageFunction != null)
            {
                package = relativePackageToPackageFunction.Invoke(package);
            }
            return package;
        }

        private static string GetFolderPath(CodeModel codeModel, Func<string,string> relativePackagePathToFolderPathFunction)
        {
            string folderPath = codeModel.Namespace.ToLowerInvariant().Replace('.', '/');
            if (relativePackagePathToFolderPathFunction != null)
            {
                folderPath = relativePackagePathToFolderPathFunction.Invoke(folderPath);
            }
            return folderPath;
        }
    }
}
