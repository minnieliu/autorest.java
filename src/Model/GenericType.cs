﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System.Collections.Generic;
using System.Linq;

namespace AutoRest.Java.Model
{
    /// <summary>
    /// A generic type that is used by the service.
    /// </summary>
    public class GenericType : IType
    {
        /// <summary>
        /// Create a new GenericType from the provided properties.
        /// </summary>
        /// <param name="name">The main non-generic type of this generic type.</param>
        /// <param name="typeArguments">The type arguments of this generic type.</param>
        public GenericType(string package, string name, params IType[] typeArguments)
        {
            Name = name;
            Package = package;
            TypeArguments = typeArguments;
        }

        /// <summary>
        /// The main non-generic type of this generic type.
        /// </summary>
        public string Name { get; }

        /// <summary>
        /// The package that this type belongs to.
        /// </summary>
        public string Package { get; }

        /// <summary>
        /// The type arguments of this generic type.
        /// </summary>
        public IType[] TypeArguments { get; }

        public override string ToString()
        {
            return $"{Name}<{string.Join(", ", TypeArguments.Select((IType typeArgument) => typeArgument.AsNullable().ToString()))}>";
        }

        public override bool Equals(object rhs)
        {
            return rhs is GenericType genericTypeRhs &&
                Package == genericTypeRhs.Package &&
                Name == genericTypeRhs.Name &&
                TypeArguments.SequenceEqual(genericTypeRhs.TypeArguments);
        }

        public override int GetHashCode()
        {
            return Package.GetHashCode() +
                Name.GetHashCode() +
                TypeArguments.Select(typeArgument => typeArgument.GetHashCode()).Sum();
        }

        public IType AsNullable()
        {
            return this;
        }

        public bool Contains(IType type)
        {
            return this == type || TypeArguments.Any((IType typeArgument) => typeArgument.Contains(type));
        }

        public virtual void AddImportsTo(ISet<string> imports, bool includeImplementationImports)
        {
            imports.Add($"{Package}.{Name}");
            foreach (IType typeArgument in TypeArguments)
            {
                typeArgument.AddImportsTo(imports, includeImplementationImports);
            }
        }
    }
}
