/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.azurespecials.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;

/**
 * An instance of this class provides access to all the operations defined in
 * ApiVersionDefaults.
 */
public interface ApiVersionDefaults {
    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getMethodGlobalValid();

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> getMethodGlobalValidAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> getMethodGlobalValidWithRestResponseAsync();

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return the {@link Completable} object if successful.
     */
    Completable getMethodGlobalValidAsync();

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getMethodGlobalNotProvidedValid();

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> getMethodGlobalNotProvidedValidAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> getMethodGlobalNotProvidedValidWithRestResponseAsync();

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return the {@link Completable} object if successful.
     */
    Completable getMethodGlobalNotProvidedValidAsync();

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getPathGlobalValid();

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> getPathGlobalValidAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> getPathGlobalValidWithRestResponseAsync();

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return the {@link Completable} object if successful.
     */
    Completable getPathGlobalValidAsync();

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getSwaggerGlobalValid();

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> getSwaggerGlobalValidAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> getSwaggerGlobalValidWithRestResponseAsync();

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return the {@link Completable} object if successful.
     */
    Completable getSwaggerGlobalValidAsync();
}
