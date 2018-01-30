/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyboolean;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.bodyboolean.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;

/**
 * An instance of this class provides access to all the operations defined in
 * Bools.
 */
public interface Bools {
    /**
     * Get true Boolean value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the boolean object if successful.
     */
    boolean getTrue();

    /**
     * Get true Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Boolean&gt;} object.
     */
    ServiceFuture<Boolean> getTrueAsync(final ServiceCallback<Boolean> serviceCallback);

    /**
     * Get true Boolean value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Boolean&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Boolean>> getTrueWithRestResponseAsync();

    /**
     * Get true Boolean value.
     *
     * @return the {@link Maybe&lt;Boolean&gt;} object if successful.
     */
    Maybe<Boolean> getTrueAsync();

    /**
     * Set Boolean value true.
     *
     * @param boolBody the boolean value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putTrue(boolean boolBody);

    /**
     * Set Boolean value true.
     *
     * @param boolBody the boolean value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> putTrueAsync(boolean boolBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Set Boolean value true.
     *
     * @param boolBody the boolean value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putTrueWithRestResponseAsync(boolean boolBody);

    /**
     * Set Boolean value true.
     *
     * @param boolBody the boolean value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable putTrueAsync(boolean boolBody);

    /**
     * Get false Boolean value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the boolean object if successful.
     */
    boolean getFalse();

    /**
     * Get false Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Boolean&gt;} object.
     */
    ServiceFuture<Boolean> getFalseAsync(final ServiceCallback<Boolean> serviceCallback);

    /**
     * Get false Boolean value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Boolean&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Boolean>> getFalseWithRestResponseAsync();

    /**
     * Get false Boolean value.
     *
     * @return the {@link Maybe&lt;Boolean&gt;} object if successful.
     */
    Maybe<Boolean> getFalseAsync();

    /**
     * Set Boolean value false.
     *
     * @param boolBody the boolean value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putFalse(boolean boolBody);

    /**
     * Set Boolean value false.
     *
     * @param boolBody the boolean value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> putFalseAsync(boolean boolBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Set Boolean value false.
     *
     * @param boolBody the boolean value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putFalseWithRestResponseAsync(boolean boolBody);

    /**
     * Set Boolean value false.
     *
     * @param boolBody the boolean value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable putFalseAsync(boolean boolBody);

    /**
     * Get null Boolean value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the boolean object if successful.
     */
    boolean getNull();

    /**
     * Get null Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Boolean&gt;} object.
     */
    ServiceFuture<Boolean> getNullAsync(final ServiceCallback<Boolean> serviceCallback);

    /**
     * Get null Boolean value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Boolean&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Boolean>> getNullWithRestResponseAsync();

    /**
     * Get null Boolean value.
     *
     * @return the {@link Maybe&lt;Boolean&gt;} object if successful.
     */
    Maybe<Boolean> getNullAsync();

    /**
     * Get invalid Boolean value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the boolean object if successful.
     */
    boolean getInvalid();

    /**
     * Get invalid Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Boolean&gt;} object.
     */
    ServiceFuture<Boolean> getInvalidAsync(final ServiceCallback<Boolean> serviceCallback);

    /**
     * Get invalid Boolean value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Boolean&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Boolean>> getInvalidWithRestResponseAsync();

    /**
     * Get invalid Boolean value.
     *
     * @return the {@link Maybe&lt;Boolean&gt;} object if successful.
     */
    Maybe<Boolean> getInvalidAsync();
}
