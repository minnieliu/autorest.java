/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyinteger.implementation;

import fixtures.bodyinteger.AutoRestIntegerTestService;
import fixtures.bodyinteger.Ints;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;
import rx.Single;

/**
 * Initializes a new instance of the AutoRestIntegerTestService class.
 */
public class AutoRestIntegerTestServiceImpl extends ServiceClient implements AutoRestIntegerTestService {

    /**
     * The Ints object to access its operations.
     */
    private Ints ints;

    /**
     * Gets the Ints object to access its operations.
     * @return the Ints object.
     */
    public Ints ints() {
        return this.ints;
    }

    /**
     * Initializes an instance of AutoRestIntegerTestService client.
     *
     * @param baseUrl the base URL of the host
     */
    public AutoRestIntegerTestServiceImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestIntegerTestService client.
     *
     */
    public AutoRestIntegerTestServiceImpl() {
        this("http://localhost");
        initialize();
    }

    /**
     * Initializes an instance of AutoRestIntegerTestService client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public AutoRestIntegerTestServiceImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.ints = new IntsImpl(this);
    }
}