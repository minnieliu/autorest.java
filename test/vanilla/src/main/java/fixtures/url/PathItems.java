/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.url;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.url.models.ErrorException;
import java.io.IOException;
import rx.Observable;
import rx.Single;

/**
 * An instance of this class provides access to all the operations defined
 * in PathItems.
 */
public interface PathItems {
    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void getAllWithValues(String localStringPath, String pathItemStringPath);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getAllWithValuesAsync(String localStringPath, String pathItemStringPath, final ServiceCallback<Void> serviceCallback);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> getAllWithValuesAsync(String localStringPath, String pathItemStringPath);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> getAllWithValuesWithRestResponseAsync(String localStringPath, String pathItemStringPath);
    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value 'localStringQuery'
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void getAllWithValues(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value 'localStringQuery'
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getAllWithValuesAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value 'localStringQuery'
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> getAllWithValuesAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery);
    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value 'localStringQuery'
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> getAllWithValuesWithRestResponseAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery);


    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void getGlobalQueryNull(String localStringPath, String pathItemStringPath);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getGlobalQueryNullAsync(String localStringPath, String pathItemStringPath, final ServiceCallback<Void> serviceCallback);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> getGlobalQueryNullAsync(String localStringPath, String pathItemStringPath);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> getGlobalQueryNullWithRestResponseAsync(String localStringPath, String pathItemStringPath);
    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value 'localStringQuery'
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void getGlobalQueryNull(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value 'localStringQuery'
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getGlobalQueryNullAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value 'localStringQuery'
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> getGlobalQueryNullAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery);
    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value 'localStringQuery'
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> getGlobalQueryNullWithRestResponseAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery);


    /**
     * send globalStringPath=globalStringPath, pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void getGlobalAndLocalQueryNull(String localStringPath, String pathItemStringPath);

    /**
     * send globalStringPath=globalStringPath, pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getGlobalAndLocalQueryNullAsync(String localStringPath, String pathItemStringPath, final ServiceCallback<Void> serviceCallback);

    /**
     * send globalStringPath=globalStringPath, pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> getGlobalAndLocalQueryNullAsync(String localStringPath, String pathItemStringPath);

    /**
     * send globalStringPath=globalStringPath, pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> getGlobalAndLocalQueryNullWithRestResponseAsync(String localStringPath, String pathItemStringPath);
    /**
     * send globalStringPath=globalStringPath, pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain null value
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void getGlobalAndLocalQueryNull(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery);

    /**
     * send globalStringPath=globalStringPath, pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain null value
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getGlobalAndLocalQueryNullAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * send globalStringPath=globalStringPath, pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain null value
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> getGlobalAndLocalQueryNullAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery);
    /**
     * send globalStringPath=globalStringPath, pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain null value
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> getGlobalAndLocalQueryNullWithRestResponseAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery);


    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery=null, localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void getLocalPathItemQueryNull(String localStringPath, String pathItemStringPath);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery=null, localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getLocalPathItemQueryNullAsync(String localStringPath, String pathItemStringPath, final ServiceCallback<Void> serviceCallback);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery=null, localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> getLocalPathItemQueryNullAsync(String localStringPath, String pathItemStringPath);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery=null, localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> getLocalPathItemQueryNullWithRestResponseAsync(String localStringPath, String pathItemStringPath);
    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery=null, localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value null
     * @param pathItemStringQuery should contain value null
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void getLocalPathItemQueryNull(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery=null, localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value null
     * @param pathItemStringQuery should contain value null
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getLocalPathItemQueryNullAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery=null, localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value null
     * @param pathItemStringQuery should contain value null
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> getLocalPathItemQueryNullAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery);
    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery=null, localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value null
     * @param pathItemStringQuery should contain value null
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> getLocalPathItemQueryNullWithRestResponseAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery);


}
