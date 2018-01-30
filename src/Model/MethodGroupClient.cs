﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System.Collections.Generic;

namespace AutoRest.Java.Model
{
    /// <summary>
    /// The details of a group of methods within a ServiceClient.
    /// </summary>
    public class MethodGroupClient
    {
        /// <summary>
        /// Create a new MethodGroupClient with the provided properties.
        /// </summary>
        /// <param name="className">The name of the client's class.</param>
        /// <param name="interfaceName">The name of the client's interface.</param>
        /// <param name="implementedInterfaces">The interfaces that the client implements.</param>
        /// <param name="restAPI">The REST API that the client will send requests to.</param>
        /// <param name="imports">The imports for the client.</param>
        /// <param name="serviceClientName">The name of the ServiceClient that contains this MethodGroupClient.</param>
        /// <param name="variableType">The type of this MethodGroupClient when it is used as a variable.</param>
        /// <param name="variableName">The variable name for any instances of this MethodGroupClient.</param>
        public MethodGroupClient(string className, string interfaceName, IEnumerable<string> implementedInterfaces, RestAPI restAPI, IEnumerable<string> imports, string serviceClientName, string variableType, string variableName)
        {
            ClassName = className;
            InterfaceName = interfaceName;
            ImplementedInterfaces = implementedInterfaces;
            RestAPI = restAPI;
            Imports = imports;
            ServiceClientName = serviceClientName;
            VariableType = variableType;
            VariableName = variableName;
        }

        /// <summary>
        /// Get the name of this client's class.
        /// </summary>
        public string ClassName { get; }

        /// <summary>
        /// Get the name of this client's interface.
        /// </summary>
        public string InterfaceName { get; }

        /// <summary>
        /// Get the interfaces that the client implements.
        /// </summary>
        public IEnumerable<string> ImplementedInterfaces { get; }

        /// <summary>
        /// Get the REST API that this client will send requests to.
        /// </summary>
        public RestAPI RestAPI { get; }

        /// <summary>
        /// Get the imports for this client.
        /// </summary>
        public IEnumerable<string> Imports { get; }

        /// <summary>
        /// Get the name of the ServiceClient that contains this MethodGroupClient.
        /// </summary>
        public string ServiceClientName { get; }

        /// <summary>
        /// Get the type of this MethodGroupClient when it is used as a variable.
        /// </summary>
        public string VariableType { get; }

        /// <summary>
        /// Get the variable name for any instances of this MethodGroupClient.
        /// </summary>
        public string VariableName { get; }

        /// <summary>
        /// The client method overloads for this MethodGroupClient.
        /// </summary>
        public IEnumerable<Method> ClientMethods { get; }

        /// <summary>
        /// Add this property's imports to the provided ISet of imports.
        /// </summary>
        /// <param name="imports">The set of imports to add to.</param>
        /// <param name="includeImplementationImports">Whether or not to include imports that are only necessary for method implementations.</param>
        public void AddImportsTo(ISet<string> imports, bool includeImplementationImports, JavaSettings settings)
        {
            if (!settings.IsFluent)
            {
                imports.Add($"{settings.Package}.{InterfaceName}");
            }

            foreach (string import in Imports)
            {
                imports.Add(import);
            }

            RestAPI.AddImportsTo(imports, includeImplementationImports, settings);
        }
    }
}
