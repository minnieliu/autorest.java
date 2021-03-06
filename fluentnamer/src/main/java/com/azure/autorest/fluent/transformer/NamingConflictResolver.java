/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.azure.autorest.fluent.transformer;

import com.azure.autorest.extension.base.model.codemodel.CodeModel;
import com.azure.autorest.fluent.util.Utils;
import com.azure.autorest.preprocessor.namer.CodeNamer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;
import java.util.stream.Collectors;

public class NamingConflictResolver {

    private static final Logger logger = LoggerFactory.getLogger(NamingConflictResolver.class);

    public CodeModel process(CodeModel codeModel) {
        Set<String> objectNames = codeModel.getSchemas().getObjects().stream()
                .map(Utils::getDefaultName)
                .collect(Collectors.toSet());
        codeModel.getOperationGroups().forEach(og -> {
            String name = Utils.getDefaultName(og);
            if (objectNames.contains(CodeNamer.getPlural(CodeNamer.getMethodGroupName(name)))) {
                String newName = name + "Operation";
                logger.info("Rename operation group from {} to {}", name, newName);
                og.getLanguage().getDefault().setName(newName);
            }
        });
        return codeModel;
    }
}
