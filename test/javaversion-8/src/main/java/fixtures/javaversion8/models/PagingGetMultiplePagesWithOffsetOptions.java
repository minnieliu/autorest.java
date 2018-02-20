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
 * Additional parameters for getMultiplePagesWithOffset operation.
 */
public final class PagingGetMultiplePagesWithOffsetOptions {
    /**
     * Sets the maximum number of items to return in the response.
     */
    @JsonProperty(value = "")
    private Integer maxresults;

    /**
     * Offset of return value.
     */
    @JsonProperty(value = "", required = true)
    private int offset;

    /**
     * Sets the maximum time that the server can spend processing the request,
     * in seconds. The default is 30 seconds.
     */
    @JsonProperty(value = "")
    private Integer timeout;

    /**
     * Get the maxresults value.
     *
     * @return the maxresults value.
     */
    public Integer maxresults() {
        return this.maxresults;
    }

    /**
     * Set the maxresults value.
     *
     * @param maxresults the maxresults value to set.
     * @return the PagingGetMultiplePagesWithOffsetOptions object itself.
     */
    public PagingGetMultiplePagesWithOffsetOptions withMaxresults(Integer maxresults) {
        this.maxresults = maxresults;
        return this;
    }

    /**
     * Get the offset value.
     *
     * @return the offset value.
     */
    public int offset() {
        return this.offset;
    }

    /**
     * Set the offset value.
     *
     * @param offset the offset value to set.
     * @return the PagingGetMultiplePagesWithOffsetOptions object itself.
     */
    public PagingGetMultiplePagesWithOffsetOptions withOffset(int offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get the timeout value.
     *
     * @return the timeout value.
     */
    public Integer timeout() {
        return this.timeout;
    }

    /**
     * Set the timeout value.
     *
     * @param timeout the timeout value to set.
     * @return the PagingGetMultiplePagesWithOffsetOptions object itself.
     */
    public PagingGetMultiplePagesWithOffsetOptions withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
}
