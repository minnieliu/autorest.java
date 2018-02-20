/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.javaversion8.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The OperationResult model.
 */
public final class OperationResult {
    /**
     * The status of the request. Possible values include: 'Succeeded',
     * 'Failed', 'canceled', 'Accepted', 'Creating', 'Created', 'Updating',
     * 'Updated', 'Deleting', 'Deleted', 'OK'.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * Get the status value.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set.
     * @return the OperationResult object itself.
     */
    public OperationResult withStatus(String status) {
        this.status = status;
        return this;
    }
}
