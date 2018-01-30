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

import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PathParam;
import com.microsoft.rest.v2.annotations.POST;
import com.microsoft.rest.v2.annotations.QueryParam;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import fixtures.azurespecials.SubscriptionInCredentials;
import fixtures.azurespecials.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;

/**
 * An instance of this class provides access to all the operations defined in
 * SubscriptionInCredentials.
 */
public class SubscriptionInCredentialsImpl implements SubscriptionInCredentials {
    /**
     * The proxy service used to perform REST calls.
     */
    private SubscriptionInCredentialsService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestAzureSpecialParametersTestClientImpl client;

    /**
     * Initializes an instance of SubscriptionInCredentialsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public SubscriptionInCredentialsImpl(AutoRestAzureSpecialParametersTestClientImpl client) {
        this.service = AzureProxy.create(SubscriptionInCredentialsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for SubscriptionInCredentials to
     * be used by the proxy service to perform REST calls.
     */
    @Host("http://localhost:3000")
    interface SubscriptionInCredentialsService {
        @POST("azurespecials/subscriptionId/method/string/none/path/global/1234-5678-9012-3456/{subscriptionId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> postMethodGlobalValid(@PathParam("subscriptionId") String subscriptionId, @HeaderParam("accept-language") String acceptLanguage);

        @POST("azurespecials/subscriptionId/method/string/none/path/global/null/{subscriptionId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> postMethodGlobalNull(@PathParam("subscriptionId") String subscriptionId, @HeaderParam("accept-language") String acceptLanguage);

        @POST("azurespecials/subscriptionId/method/string/none/path/globalNotProvided/1234-5678-9012-3456/{subscriptionId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> postMethodGlobalNotProvidedValid(@PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @POST("azurespecials/subscriptionId/path/string/none/path/global/1234-5678-9012-3456/{subscriptionId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> postPathGlobalValid(@PathParam("subscriptionId") String subscriptionId, @HeaderParam("accept-language") String acceptLanguage);

        @POST("azurespecials/subscriptionId/swagger/string/none/path/global/1234-5678-9012-3456/{subscriptionId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> postSwaggerGlobalValid(@PathParam("subscriptionId") String subscriptionId, @HeaderParam("accept-language") String acceptLanguage);
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void postMethodGlobalValid() {
        postMethodGlobalValidAsync().blockingAwait();
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> postMethodGlobalValidAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postMethodGlobalValidAsync(), serviceCallback);
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> postMethodGlobalValidWithRestResponseAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        return service.postMethodGlobalValid(this.client.subscriptionId(), this.client.acceptLanguage());
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @return the {@link Completable} object if successful.
     */
    public Completable postMethodGlobalValidAsync() {
        return postMethodGlobalValidWithRestResponseAsync()
            .toCompletable();
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to null, and client-side validation should prevent you from making this call.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void postMethodGlobalNull() {
        postMethodGlobalNullAsync().blockingAwait();
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to null, and client-side validation should prevent you from making this call.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> postMethodGlobalNullAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postMethodGlobalNullAsync(), serviceCallback);
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to null, and client-side validation should prevent you from making this call.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> postMethodGlobalNullWithRestResponseAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        return service.postMethodGlobalNull(this.client.subscriptionId(), this.client.acceptLanguage());
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to null, and client-side validation should prevent you from making this call.
     *
     * @return the {@link Completable} object if successful.
     */
    public Completable postMethodGlobalNullAsync() {
        return postMethodGlobalNullWithRestResponseAsync()
            .toCompletable();
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void postMethodGlobalNotProvidedValid() {
        postMethodGlobalNotProvidedValidAsync().blockingAwait();
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> postMethodGlobalNotProvidedValidAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postMethodGlobalNotProvidedValidAsync(), serviceCallback);
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> postMethodGlobalNotProvidedValidWithRestResponseAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.postMethodGlobalNotProvidedValid(this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage());
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @return the {@link Completable} object if successful.
     */
    public Completable postMethodGlobalNotProvidedValidAsync() {
        return postMethodGlobalNotProvidedValidWithRestResponseAsync()
            .toCompletable();
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void postPathGlobalValid() {
        postPathGlobalValidAsync().blockingAwait();
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> postPathGlobalValidAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postPathGlobalValidAsync(), serviceCallback);
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> postPathGlobalValidWithRestResponseAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        return service.postPathGlobalValid(this.client.subscriptionId(), this.client.acceptLanguage());
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @return the {@link Completable} object if successful.
     */
    public Completable postPathGlobalValidAsync() {
        return postPathGlobalValidWithRestResponseAsync()
            .toCompletable();
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void postSwaggerGlobalValid() {
        postSwaggerGlobalValidAsync().blockingAwait();
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> postSwaggerGlobalValidAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postSwaggerGlobalValidAsync(), serviceCallback);
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> postSwaggerGlobalValidWithRestResponseAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        return service.postSwaggerGlobalValid(this.client.subscriptionId(), this.client.acceptLanguage());
    }

    /**
     * POST method with subscriptionId modeled in credentials.  Set the credential subscriptionId to '1234-5678-9012-3456' to succeed.
     *
     * @return the {@link Completable} object if successful.
     */
    public Completable postSwaggerGlobalValidAsync() {
        return postSwaggerGlobalValidWithRestResponseAsync()
            .toCompletable();
    }
}
