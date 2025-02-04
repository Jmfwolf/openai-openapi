/*
 * OpenAI API
 * The OpenAI REST API
 *
 * The version of the OpenAPI document: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package space.fraktured.ai.client.api;

import space.fraktured.ai.client.ApiCallback;
import space.fraktured.ai.client.ApiClient;
import space.fraktured.ai.client.ApiException;
import space.fraktured.ai.client.ApiResponse;
import space.fraktured.ai.client.Configuration;
import space.fraktured.ai.client.Pair;
import space.fraktured.ai.client.ProgressRequestBody;
import space.fraktured.ai.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import space.fraktured.ai.client.model.CreateModerationRequest;
import space.fraktured.ai.client.model.CreateModerationResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ModerationsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ModerationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ModerationsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for createModeration
     * @param createModerationRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createModerationCall(CreateModerationRequest createModerationRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = createModerationRequest;

        // create path and map variables
        String localVarPath = "/moderations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createModerationValidateBeforeCall(CreateModerationRequest createModerationRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'createModerationRequest' is set
        if (createModerationRequest == null) {
            throw new ApiException("Missing the required parameter 'createModerationRequest' when calling createModeration(Async)");
        }

        return createModerationCall(createModerationRequest, _callback);

    }

    /**
     * Create Moderation
     * Classifies if text violates OpenAI&#39;s Content Policy
     * @param createModerationRequest  (required)
     * @return CreateModerationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CreateModerationResponse createModeration(CreateModerationRequest createModerationRequest) throws ApiException {
        ApiResponse<CreateModerationResponse> localVarResp = createModerationWithHttpInfo(createModerationRequest);
        return localVarResp.getData();
    }

    /**
     * Create Moderation
     * Classifies if text violates OpenAI&#39;s Content Policy
     * @param createModerationRequest  (required)
     * @return ApiResponse&lt;CreateModerationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CreateModerationResponse> createModerationWithHttpInfo(CreateModerationRequest createModerationRequest) throws ApiException {
        okhttp3.Call localVarCall = createModerationValidateBeforeCall(createModerationRequest, null);
        Type localVarReturnType = new TypeToken<CreateModerationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Moderation (asynchronously)
     * Classifies if text violates OpenAI&#39;s Content Policy
     * @param createModerationRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createModerationAsync(CreateModerationRequest createModerationRequest, final ApiCallback<CreateModerationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createModerationValidateBeforeCall(createModerationRequest, _callback);
        Type localVarReturnType = new TypeToken<CreateModerationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
