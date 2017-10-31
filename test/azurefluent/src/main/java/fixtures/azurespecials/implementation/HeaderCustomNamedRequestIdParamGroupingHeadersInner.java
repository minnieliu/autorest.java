/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for customNamedRequestIdParamGrouping operation.
 */
public class HeaderCustomNamedRequestIdParamGroupingHeadersInner {
    /**
     * Gets the foo-request-id.
     */
    @JsonProperty(value = "foo-request-id")
    private String fooRequestId;

    /**
     * Get the fooRequestId value.
     *
     * @return the fooRequestId value
     */
    public String fooRequestId() {
        return this.fooRequestId;
    }

    /**
     * Set the fooRequestId value.
     *
     * @param fooRequestId the fooRequestId value to set
     * @return the HeaderCustomNamedRequestIdParamGroupingHeadersInner object
     * itself.
     */
    public HeaderCustomNamedRequestIdParamGroupingHeadersInner withFooRequestId(String fooRequestId) {
        this.fooRequestId = fooRequestId;
        return this;
    }

}
