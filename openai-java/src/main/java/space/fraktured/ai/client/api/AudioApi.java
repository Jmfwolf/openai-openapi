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


import java.math.BigDecimal;
import space.fraktured.ai.client.model.CreateTranscriptionResponse;
import space.fraktured.ai.client.model.CreateTranslationResponse;
import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AudioApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AudioApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AudioApi(ApiClient apiClient) {
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
     * Build call for createTranscription
     * @param _file The audio file to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  (required)
     * @param model ID of the model to use. Only &#x60;whisper-1&#x60; is currently available.  (required)
     * @param prompt An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  (optional)
     * @param responseFormat The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional, default to json)
     * @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to 0)
     * @param language The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createTranscriptionCall(File _file, String model, String prompt, String responseFormat, BigDecimal temperature, String language, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/audio/transcriptions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (_file != null) {
            localVarFormParams.put("file", _file);
        }

        if (model != null) {
            localVarFormParams.put("model", model);
        }

        if (prompt != null) {
            localVarFormParams.put("prompt", prompt);
        }

        if (responseFormat != null) {
            localVarFormParams.put("response_format", responseFormat);
        }

        if (temperature != null) {
            localVarFormParams.put("temperature", temperature);
        }

        if (language != null) {
            localVarFormParams.put("language", language);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createTranscriptionValidateBeforeCall(File _file, String model, String prompt, String responseFormat, BigDecimal temperature, String language, final ApiCallback _callback) throws ApiException {
        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new ApiException("Missing the required parameter '_file' when calling createTranscription(Async)");
        }

        // verify the required parameter 'model' is set
        if (model == null) {
            throw new ApiException("Missing the required parameter 'model' when calling createTranscription(Async)");
        }

        return createTranscriptionCall(_file, model, prompt, responseFormat, temperature, language, _callback);

    }

    /**
     * Create Transcription
     * Transcribes audio into the input language.
     * @param _file The audio file to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  (required)
     * @param model ID of the model to use. Only &#x60;whisper-1&#x60; is currently available.  (required)
     * @param prompt An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  (optional)
     * @param responseFormat The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional, default to json)
     * @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to 0)
     * @param language The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional)
     * @return CreateTranscriptionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CreateTranscriptionResponse createTranscription(File _file, String model, String prompt, String responseFormat, BigDecimal temperature, String language) throws ApiException {
        ApiResponse<CreateTranscriptionResponse> localVarResp = createTranscriptionWithHttpInfo(_file, model, prompt, responseFormat, temperature, language);
        return localVarResp.getData();
    }

    /**
     * Create Transcription
     * Transcribes audio into the input language.
     * @param _file The audio file to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  (required)
     * @param model ID of the model to use. Only &#x60;whisper-1&#x60; is currently available.  (required)
     * @param prompt An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  (optional)
     * @param responseFormat The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional, default to json)
     * @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to 0)
     * @param language The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional)
     * @return ApiResponse&lt;CreateTranscriptionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CreateTranscriptionResponse> createTranscriptionWithHttpInfo(File _file, String model, String prompt, String responseFormat, BigDecimal temperature, String language) throws ApiException {
        okhttp3.Call localVarCall = createTranscriptionValidateBeforeCall(_file, model, prompt, responseFormat, temperature, language, null);
        Type localVarReturnType = new TypeToken<CreateTranscriptionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Transcription (asynchronously)
     * Transcribes audio into the input language.
     * @param _file The audio file to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  (required)
     * @param model ID of the model to use. Only &#x60;whisper-1&#x60; is currently available.  (required)
     * @param prompt An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  (optional)
     * @param responseFormat The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional, default to json)
     * @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to 0)
     * @param language The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createTranscriptionAsync(File _file, String model, String prompt, String responseFormat, BigDecimal temperature, String language, final ApiCallback<CreateTranscriptionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createTranscriptionValidateBeforeCall(_file, model, prompt, responseFormat, temperature, language, _callback);
        Type localVarReturnType = new TypeToken<CreateTranscriptionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createTranslation
     * @param _file The audio file to translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  (required)
     * @param model ID of the model to use. Only &#x60;whisper-1&#x60; is currently available.  (required)
     * @param prompt An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  (optional)
     * @param responseFormat The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional, default to json)
     * @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to 0)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createTranslationCall(File _file, String model, String prompt, String responseFormat, BigDecimal temperature, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/audio/translations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (_file != null) {
            localVarFormParams.put("file", _file);
        }

        if (model != null) {
            localVarFormParams.put("model", model);
        }

        if (prompt != null) {
            localVarFormParams.put("prompt", prompt);
        }

        if (responseFormat != null) {
            localVarFormParams.put("response_format", responseFormat);
        }

        if (temperature != null) {
            localVarFormParams.put("temperature", temperature);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createTranslationValidateBeforeCall(File _file, String model, String prompt, String responseFormat, BigDecimal temperature, final ApiCallback _callback) throws ApiException {
        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new ApiException("Missing the required parameter '_file' when calling createTranslation(Async)");
        }

        // verify the required parameter 'model' is set
        if (model == null) {
            throw new ApiException("Missing the required parameter 'model' when calling createTranslation(Async)");
        }

        return createTranslationCall(_file, model, prompt, responseFormat, temperature, _callback);

    }

    /**
     * Create Translation
     * Translates audio into into English.
     * @param _file The audio file to translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  (required)
     * @param model ID of the model to use. Only &#x60;whisper-1&#x60; is currently available.  (required)
     * @param prompt An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  (optional)
     * @param responseFormat The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional, default to json)
     * @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to 0)
     * @return CreateTranslationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CreateTranslationResponse createTranslation(File _file, String model, String prompt, String responseFormat, BigDecimal temperature) throws ApiException {
        ApiResponse<CreateTranslationResponse> localVarResp = createTranslationWithHttpInfo(_file, model, prompt, responseFormat, temperature);
        return localVarResp.getData();
    }

    /**
     * Create Translation
     * Translates audio into into English.
     * @param _file The audio file to translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  (required)
     * @param model ID of the model to use. Only &#x60;whisper-1&#x60; is currently available.  (required)
     * @param prompt An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  (optional)
     * @param responseFormat The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional, default to json)
     * @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to 0)
     * @return ApiResponse&lt;CreateTranslationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CreateTranslationResponse> createTranslationWithHttpInfo(File _file, String model, String prompt, String responseFormat, BigDecimal temperature) throws ApiException {
        okhttp3.Call localVarCall = createTranslationValidateBeforeCall(_file, model, prompt, responseFormat, temperature, null);
        Type localVarReturnType = new TypeToken<CreateTranslationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Translation (asynchronously)
     * Translates audio into into English.
     * @param _file The audio file to translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  (required)
     * @param model ID of the model to use. Only &#x60;whisper-1&#x60; is currently available.  (required)
     * @param prompt An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  (optional)
     * @param responseFormat The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional, default to json)
     * @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to 0)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createTranslationAsync(File _file, String model, String prompt, String responseFormat, BigDecimal temperature, final ApiCallback<CreateTranslationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createTranslationValidateBeforeCall(_file, model, prompt, responseFormat, temperature, _callback);
        Type localVarReturnType = new TypeToken<CreateTranslationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
