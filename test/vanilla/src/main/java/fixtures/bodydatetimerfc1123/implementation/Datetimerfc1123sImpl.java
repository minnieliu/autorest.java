/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydatetimerfc1123.implementation;

import com.microsoft.rest.v2.DateTimeRfc1123;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.ReturnValueWireType;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import fixtures.bodydatetimerfc1123.Datetimerfc1123s;
import fixtures.bodydatetimerfc1123.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import org.joda.time.DateTime;

/**
 * An instance of this class provides access to all the operations defined in
 * Datetimerfc1123s.
 */
public class Datetimerfc1123sImpl implements Datetimerfc1123s {
    /**
     * The proxy service used to perform REST calls.
     */
    private Datetimerfc1123sService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestRFC1123DateTimeTestServiceImpl client;

    /**
     * Initializes an instance of Datetimerfc1123sImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public Datetimerfc1123sImpl(AutoRestRFC1123DateTimeTestServiceImpl client) {
        this.service = RestProxy.create(Datetimerfc1123sService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for Datetimerfc1123s to be used
     * by the proxy service to perform REST calls.
     */
    @Host("http://localhost:3000")
    interface Datetimerfc1123sService {
        @GET("datetimerfc1123/null")
        @ExpectedResponses({200})
        @ReturnValueWireType(DateTimeRfc1123.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, DateTime>> getNull();

        @GET("datetimerfc1123/invalid")
        @ExpectedResponses({200})
        @ReturnValueWireType(DateTimeRfc1123.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, DateTime>> getInvalid();

        @GET("datetimerfc1123/overflow")
        @ExpectedResponses({200})
        @ReturnValueWireType(DateTimeRfc1123.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, DateTime>> getOverflow();

        @GET("datetimerfc1123/underflow")
        @ExpectedResponses({200})
        @ReturnValueWireType(DateTimeRfc1123.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, DateTime>> getUnderflow();

        @PUT("datetimerfc1123/max")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putUtcMaxDateTime(@BodyParam("application/json; charset=utf-8") DateTimeRfc1123 datetimeBody);

        @GET("datetimerfc1123/max/lowercase")
        @ExpectedResponses({200})
        @ReturnValueWireType(DateTimeRfc1123.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, DateTime>> getUtcLowercaseMaxDateTime();

        @GET("datetimerfc1123/max/uppercase")
        @ExpectedResponses({200})
        @ReturnValueWireType(DateTimeRfc1123.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, DateTime>> getUtcUppercaseMaxDateTime();

        @PUT("datetimerfc1123/min")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putUtcMinDateTime(@BodyParam("application/json; charset=utf-8") DateTimeRfc1123 datetimeBody);

        @GET("datetimerfc1123/min")
        @ExpectedResponses({200})
        @ReturnValueWireType(DateTimeRfc1123.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, DateTime>> getUtcMinDateTime();
    }

    /**
     * Get null datetime value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    public DateTime getNull() {
        return getNullAsync().blockingGet();
    }

    /**
     * Get null datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;DateTime&gt;} object.
     */
    public ServiceFuture<DateTime> getNullAsync(final ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromBody(getNullAsync(), serviceCallback);
    }

    /**
     * Get null datetime value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, DateTime&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, DateTime>> getNullWithRestResponseAsync() {
        return service.getNull();
    }

    /**
     * Get null datetime value.
     *
     * @return the {@link Maybe&lt;DateTime&gt;} object if successful.
     */
    public Maybe<DateTime> getNullAsync() {
        return getNullWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, DateTime>, Maybe<DateTime>>() {
                public Maybe<DateTime> apply(RestResponse<Void, DateTime> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Get invalid datetime value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    public DateTime getInvalid() {
        return getInvalidAsync().blockingGet();
    }

    /**
     * Get invalid datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;DateTime&gt;} object.
     */
    public ServiceFuture<DateTime> getInvalidAsync(final ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromBody(getInvalidAsync(), serviceCallback);
    }

    /**
     * Get invalid datetime value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, DateTime&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, DateTime>> getInvalidWithRestResponseAsync() {
        return service.getInvalid();
    }

    /**
     * Get invalid datetime value.
     *
     * @return the {@link Maybe&lt;DateTime&gt;} object if successful.
     */
    public Maybe<DateTime> getInvalidAsync() {
        return getInvalidWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, DateTime>, Maybe<DateTime>>() {
                public Maybe<DateTime> apply(RestResponse<Void, DateTime> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Get overflow datetime value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    public DateTime getOverflow() {
        return getOverflowAsync().blockingGet();
    }

    /**
     * Get overflow datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;DateTime&gt;} object.
     */
    public ServiceFuture<DateTime> getOverflowAsync(final ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromBody(getOverflowAsync(), serviceCallback);
    }

    /**
     * Get overflow datetime value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, DateTime&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, DateTime>> getOverflowWithRestResponseAsync() {
        return service.getOverflow();
    }

    /**
     * Get overflow datetime value.
     *
     * @return the {@link Maybe&lt;DateTime&gt;} object if successful.
     */
    public Maybe<DateTime> getOverflowAsync() {
        return getOverflowWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, DateTime>, Maybe<DateTime>>() {
                public Maybe<DateTime> apply(RestResponse<Void, DateTime> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Get underflow datetime value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    public DateTime getUnderflow() {
        return getUnderflowAsync().blockingGet();
    }

    /**
     * Get underflow datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;DateTime&gt;} object.
     */
    public ServiceFuture<DateTime> getUnderflowAsync(final ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromBody(getUnderflowAsync(), serviceCallback);
    }

    /**
     * Get underflow datetime value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, DateTime&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, DateTime>> getUnderflowWithRestResponseAsync() {
        return service.getUnderflow();
    }

    /**
     * Get underflow datetime value.
     *
     * @return the {@link Maybe&lt;DateTime&gt;} object if successful.
     */
    public Maybe<DateTime> getUnderflowAsync() {
        return getUnderflowWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, DateTime>, Maybe<DateTime>>() {
                public Maybe<DateTime> apply(RestResponse<Void, DateTime> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putUtcMaxDateTime(DateTime datetimeBody) {
        putUtcMaxDateTimeAsync(datetimeBody).blockingAwait();
    }

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> putUtcMaxDateTimeAsync(DateTime datetimeBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putUtcMaxDateTimeAsync(datetimeBody), serviceCallback);
    }

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> putUtcMaxDateTimeWithRestResponseAsync(DateTime datetimeBody) {
        if (datetimeBody == null) {
            throw new IllegalArgumentException("Parameter datetimeBody is required and cannot be null.");
        }
        DateTimeRfc1123 datetimeBodyConverted = new DateTimeRfc1123(datetimeBody);
        return service.putUtcMaxDateTime(datetimeBodyConverted);
    }

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    public Completable putUtcMaxDateTimeAsync(DateTime datetimeBody) {
        return putUtcMaxDateTimeWithRestResponseAsync(datetimeBody)
            .toCompletable();
    }

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    public DateTime getUtcLowercaseMaxDateTime() {
        return getUtcLowercaseMaxDateTimeAsync().blockingGet();
    }

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;DateTime&gt;} object.
     */
    public ServiceFuture<DateTime> getUtcLowercaseMaxDateTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromBody(getUtcLowercaseMaxDateTimeAsync(), serviceCallback);
    }

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, DateTime&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, DateTime>> getUtcLowercaseMaxDateTimeWithRestResponseAsync() {
        return service.getUtcLowercaseMaxDateTime();
    }

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @return the {@link Maybe&lt;DateTime&gt;} object if successful.
     */
    public Maybe<DateTime> getUtcLowercaseMaxDateTimeAsync() {
        return getUtcLowercaseMaxDateTimeWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, DateTime>, Maybe<DateTime>>() {
                public Maybe<DateTime> apply(RestResponse<Void, DateTime> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    public DateTime getUtcUppercaseMaxDateTime() {
        return getUtcUppercaseMaxDateTimeAsync().blockingGet();
    }

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;DateTime&gt;} object.
     */
    public ServiceFuture<DateTime> getUtcUppercaseMaxDateTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromBody(getUtcUppercaseMaxDateTimeAsync(), serviceCallback);
    }

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, DateTime&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, DateTime>> getUtcUppercaseMaxDateTimeWithRestResponseAsync() {
        return service.getUtcUppercaseMaxDateTime();
    }

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @return the {@link Maybe&lt;DateTime&gt;} object if successful.
     */
    public Maybe<DateTime> getUtcUppercaseMaxDateTimeAsync() {
        return getUtcUppercaseMaxDateTimeWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, DateTime>, Maybe<DateTime>>() {
                public Maybe<DateTime> apply(RestResponse<Void, DateTime> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putUtcMinDateTime(DateTime datetimeBody) {
        putUtcMinDateTimeAsync(datetimeBody).blockingAwait();
    }

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> putUtcMinDateTimeAsync(DateTime datetimeBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putUtcMinDateTimeAsync(datetimeBody), serviceCallback);
    }

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> putUtcMinDateTimeWithRestResponseAsync(DateTime datetimeBody) {
        if (datetimeBody == null) {
            throw new IllegalArgumentException("Parameter datetimeBody is required and cannot be null.");
        }
        DateTimeRfc1123 datetimeBodyConverted = new DateTimeRfc1123(datetimeBody);
        return service.putUtcMinDateTime(datetimeBodyConverted);
    }

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    public Completable putUtcMinDateTimeAsync(DateTime datetimeBody) {
        return putUtcMinDateTimeWithRestResponseAsync(datetimeBody)
            .toCompletable();
    }

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    public DateTime getUtcMinDateTime() {
        return getUtcMinDateTimeAsync().blockingGet();
    }

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;DateTime&gt;} object.
     */
    public ServiceFuture<DateTime> getUtcMinDateTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromBody(getUtcMinDateTimeAsync(), serviceCallback);
    }

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, DateTime&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, DateTime>> getUtcMinDateTimeWithRestResponseAsync() {
        return service.getUtcMinDateTime();
    }

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @return the {@link Maybe&lt;DateTime&gt;} object if successful.
     */
    public Maybe<DateTime> getUtcMinDateTimeAsync() {
        return getUtcMinDateTimeWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, DateTime>, Maybe<DateTime>>() {
                public Maybe<DateTime> apply(RestResponse<Void, DateTime> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }
}
