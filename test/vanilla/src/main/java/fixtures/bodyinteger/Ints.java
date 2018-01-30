/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyinteger;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.bodyinteger.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import org.joda.time.DateTime;

/**
 * An instance of this class provides access to all the operations defined in
 * Ints.
 */
public interface Ints {
    /**
     * Get null Int value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the int object if successful.
     */
    int getNull();

    /**
     * Get null Int value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Integer&gt;} object.
     */
    ServiceFuture<Integer> getNullAsync(final ServiceCallback<Integer> serviceCallback);

    /**
     * Get null Int value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Integer&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Integer>> getNullWithRestResponseAsync();

    /**
     * Get null Int value.
     *
     * @return the {@link Maybe&lt;Integer&gt;} object if successful.
     */
    Maybe<Integer> getNullAsync();

    /**
     * Get invalid Int value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the int object if successful.
     */
    int getInvalid();

    /**
     * Get invalid Int value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Integer&gt;} object.
     */
    ServiceFuture<Integer> getInvalidAsync(final ServiceCallback<Integer> serviceCallback);

    /**
     * Get invalid Int value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Integer&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Integer>> getInvalidWithRestResponseAsync();

    /**
     * Get invalid Int value.
     *
     * @return the {@link Maybe&lt;Integer&gt;} object if successful.
     */
    Maybe<Integer> getInvalidAsync();

    /**
     * Get overflow Int32 value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the int object if successful.
     */
    int getOverflowInt32();

    /**
     * Get overflow Int32 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Integer&gt;} object.
     */
    ServiceFuture<Integer> getOverflowInt32Async(final ServiceCallback<Integer> serviceCallback);

    /**
     * Get overflow Int32 value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Integer&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Integer>> getOverflowInt32WithRestResponseAsync();

    /**
     * Get overflow Int32 value.
     *
     * @return the {@link Maybe&lt;Integer&gt;} object if successful.
     */
    Maybe<Integer> getOverflowInt32Async();

    /**
     * Get underflow Int32 value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the int object if successful.
     */
    int getUnderflowInt32();

    /**
     * Get underflow Int32 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Integer&gt;} object.
     */
    ServiceFuture<Integer> getUnderflowInt32Async(final ServiceCallback<Integer> serviceCallback);

    /**
     * Get underflow Int32 value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Integer&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Integer>> getUnderflowInt32WithRestResponseAsync();

    /**
     * Get underflow Int32 value.
     *
     * @return the {@link Maybe&lt;Integer&gt;} object if successful.
     */
    Maybe<Integer> getUnderflowInt32Async();

    /**
     * Get overflow Int64 value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the long object if successful.
     */
    long getOverflowInt64();

    /**
     * Get overflow Int64 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Long&gt;} object.
     */
    ServiceFuture<Long> getOverflowInt64Async(final ServiceCallback<Long> serviceCallback);

    /**
     * Get overflow Int64 value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Long&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Long>> getOverflowInt64WithRestResponseAsync();

    /**
     * Get overflow Int64 value.
     *
     * @return the {@link Maybe&lt;Long&gt;} object if successful.
     */
    Maybe<Long> getOverflowInt64Async();

    /**
     * Get underflow Int64 value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the long object if successful.
     */
    long getUnderflowInt64();

    /**
     * Get underflow Int64 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Long&gt;} object.
     */
    ServiceFuture<Long> getUnderflowInt64Async(final ServiceCallback<Long> serviceCallback);

    /**
     * Get underflow Int64 value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Long&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Long>> getUnderflowInt64WithRestResponseAsync();

    /**
     * Get underflow Int64 value.
     *
     * @return the {@link Maybe&lt;Long&gt;} object if successful.
     */
    Maybe<Long> getUnderflowInt64Async();

    /**
     * Put max int32 value.
     *
     * @param intBody the int value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putMax32(int intBody);

    /**
     * Put max int32 value.
     *
     * @param intBody the int value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> putMax32Async(int intBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put max int32 value.
     *
     * @param intBody the int value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putMax32WithRestResponseAsync(int intBody);

    /**
     * Put max int32 value.
     *
     * @param intBody the int value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable putMax32Async(int intBody);

    /**
     * Put max int64 value.
     *
     * @param intBody the long value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putMax64(long intBody);

    /**
     * Put max int64 value.
     *
     * @param intBody the long value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> putMax64Async(long intBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put max int64 value.
     *
     * @param intBody the long value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putMax64WithRestResponseAsync(long intBody);

    /**
     * Put max int64 value.
     *
     * @param intBody the long value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable putMax64Async(long intBody);

    /**
     * Put min int32 value.
     *
     * @param intBody the int value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putMin32(int intBody);

    /**
     * Put min int32 value.
     *
     * @param intBody the int value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> putMin32Async(int intBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put min int32 value.
     *
     * @param intBody the int value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putMin32WithRestResponseAsync(int intBody);

    /**
     * Put min int32 value.
     *
     * @param intBody the int value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable putMin32Async(int intBody);

    /**
     * Put min int64 value.
     *
     * @param intBody the long value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putMin64(long intBody);

    /**
     * Put min int64 value.
     *
     * @param intBody the long value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> putMin64Async(long intBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put min int64 value.
     *
     * @param intBody the long value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putMin64WithRestResponseAsync(long intBody);

    /**
     * Put min int64 value.
     *
     * @param intBody the long value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable putMin64Async(long intBody);

    /**
     * Get datetime encoded as Unix time value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    DateTime getUnixTime();

    /**
     * Get datetime encoded as Unix time value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;DateTime&gt;} object.
     */
    ServiceFuture<DateTime> getUnixTimeAsync(final ServiceCallback<DateTime> serviceCallback);

    /**
     * Get datetime encoded as Unix time value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, DateTime&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, DateTime>> getUnixTimeWithRestResponseAsync();

    /**
     * Get datetime encoded as Unix time value.
     *
     * @return the {@link Maybe&lt;DateTime&gt;} object if successful.
     */
    Maybe<DateTime> getUnixTimeAsync();

    /**
     * Put datetime encoded as Unix time.
     *
     * @param intBody the long value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putUnixTimeDate(DateTime intBody);

    /**
     * Put datetime encoded as Unix time.
     *
     * @param intBody the long value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> putUnixTimeDateAsync(DateTime intBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put datetime encoded as Unix time.
     *
     * @param intBody the long value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putUnixTimeDateWithRestResponseAsync(DateTime intBody);

    /**
     * Put datetime encoded as Unix time.
     *
     * @param intBody the long value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable putUnixTimeDateAsync(DateTime intBody);

    /**
     * Get invalid Unix time value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    DateTime getInvalidUnixTime();

    /**
     * Get invalid Unix time value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;DateTime&gt;} object.
     */
    ServiceFuture<DateTime> getInvalidUnixTimeAsync(final ServiceCallback<DateTime> serviceCallback);

    /**
     * Get invalid Unix time value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, DateTime&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, DateTime>> getInvalidUnixTimeWithRestResponseAsync();

    /**
     * Get invalid Unix time value.
     *
     * @return the {@link Maybe&lt;DateTime&gt;} object if successful.
     */
    Maybe<DateTime> getInvalidUnixTimeAsync();

    /**
     * Get null Unix time value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    DateTime getNullUnixTime();

    /**
     * Get null Unix time value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;DateTime&gt;} object.
     */
    ServiceFuture<DateTime> getNullUnixTimeAsync(final ServiceCallback<DateTime> serviceCallback);

    /**
     * Get null Unix time value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, DateTime&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, DateTime>> getNullUnixTimeWithRestResponseAsync();

    /**
     * Get null Unix time value.
     *
     * @return the {@link Maybe&lt;DateTime&gt;} object if successful.
     */
    Maybe<DateTime> getNullUnixTimeAsync();
}
