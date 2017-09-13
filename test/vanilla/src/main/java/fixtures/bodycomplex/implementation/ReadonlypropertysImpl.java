/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.implementation;

import com.microsoft.rest.v2.RestProxy;
import fixtures.bodycomplex.Readonlypropertys;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import com.microsoft.rest.Validator;
import fixtures.bodycomplex.models.ErrorException;
import fixtures.bodycomplex.models.ReadonlyObj;
import java.io.IOException;
import rx.functions.Func1;
import rx.Observable;
import rx.Single;

/**
 * An instance of this class provides access to all the operations defined
 * in Readonlypropertys.
 */
public class ReadonlypropertysImpl implements Readonlypropertys {
    /** The RestProxy service to perform REST calls. */
    private ReadonlypropertysService service;
    /** The service client containing this operation class. */
    private AutoRestComplexTestServiceImpl client;

    /**
     * Initializes an instance of Readonlypropertys.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public ReadonlypropertysImpl(AutoRestComplexTestServiceImpl client) {
        this.service = RestProxy.create(ReadonlypropertysService.class, client.restClient().baseURL(), client.httpClient(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for Readonlypropertys to be
     * used by RestProxy to perform REST calls.
    */
    @Host("http://localhost")
    interface ReadonlypropertysService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodycomplex.Readonlypropertys getValid" })
        @GET("complex/readonlyproperty/valid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<ReadonlyObj> getValid();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodycomplex.Readonlypropertys putValid" })
        @PUT("complex/readonlyproperty/valid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Void> putValid(@BodyParam ReadonlyObj complexBody);

    }

    /**
     * Get complex types that have readonly properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ReadonlyObj object if successful.
     */
    public ReadonlyObj getValid() {
        return getValidAsync().toBlocking().value();
    }

    /**
     * Get complex types that have readonly properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ReadonlyObj> getValidAsync(final ServiceCallback<ReadonlyObj> serviceCallback) {
        return ServiceFuture.fromBody(getValidAsync(), serviceCallback);
    }

    /**
     * Get complex types that have readonly properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ReadonlyObj object
     */
    public Single<ReadonlyObj> getValidAsync() {
        return service.getValid();
    }


    /**
     * Put complex types that have readonly properties.
     *
     * @param complexBody the ReadonlyObj value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void putValid(ReadonlyObj complexBody) {
        putValidAsync(complexBody).toBlocking().value();
    }

    /**
     * Put complex types that have readonly properties.
     *
     * @param complexBody the ReadonlyObj value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putValidAsync(ReadonlyObj complexBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putValidAsync(complexBody), serviceCallback);
    }

    /**
     * Put complex types that have readonly properties.
     *
     * @param complexBody the ReadonlyObj value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> putValidAsync(ReadonlyObj complexBody) {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        return service.putValid(complexBody);
    }


}