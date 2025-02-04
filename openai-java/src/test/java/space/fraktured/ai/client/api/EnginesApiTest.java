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

import space.fraktured.ai.client.ApiException;
import space.fraktured.ai.client.model.CreateAnswerRequest;
import space.fraktured.ai.client.model.CreateAnswerResponse;
import space.fraktured.ai.client.model.CreateClassificationRequest;
import space.fraktured.ai.client.model.CreateClassificationResponse;
import space.fraktured.ai.client.model.CreateSearchRequest;
import space.fraktured.ai.client.model.CreateSearchResponse;
import space.fraktured.ai.client.model.Engine;
import space.fraktured.ai.client.model.ListEnginesResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EnginesApi
 */
@Disabled
public class EnginesApiTest {

    private final EnginesApi api = new EnginesApi();

    /**
     * Create Answer
     *
     * Answers the specified question using the provided documents and examples.  The endpoint first [searches](/docs/api-reference/searches) over provided documents or files to find relevant context. The relevant context is combined with the provided examples and question to create the prompt for [completion](/docs/api-reference/completions). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAnswerTest() throws ApiException {
        CreateAnswerRequest createAnswerRequest = null;
        CreateAnswerResponse response = api.createAnswer(createAnswerRequest);
        // TODO: test validations
    }

    /**
     * Create Classification
     *
     * Classifies the specified &#x60;query&#x60; using provided examples.  The endpoint first [searches](/docs/api-reference/searches) over the labeled examples to select the ones most relevant for the particular query. Then, the relevant examples are combined with the query to construct a prompt to produce the final label via the [completions](/docs/api-reference/completions) endpoint.  Labeled examples can be provided via an uploaded &#x60;file&#x60;, or explicitly listed in the request using the &#x60;examples&#x60; parameter for quick tests and small scale use cases. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createClassificationTest() throws ApiException {
        CreateClassificationRequest createClassificationRequest = null;
        CreateClassificationResponse response = api.createClassification(createClassificationRequest);
        // TODO: test validations
    }

    /**
     * Create Search
     *
     * The search endpoint computes similarity scores between provided query and documents. Documents can be passed directly to the API if there are no more than 200 of them.  To go beyond the 200 document limit, documents can be processed offline and then used for efficient retrieval at query time. When &#x60;file&#x60; is set, the search endpoint searches over all the documents in the given file and returns up to the &#x60;max_rerank&#x60; number of documents. These documents will be returned along with their search scores.  The similarity score is a positive score that usually ranges from 0 to 300 (but can sometimes go higher), where a score above 200 usually means the document is semantically similar to the query. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSearchTest() throws ApiException {
        String engineId = null;
        CreateSearchRequest createSearchRequest = null;
        CreateSearchResponse response = api.createSearch(engineId, createSearchRequest);
        // TODO: test validations
    }

    /**
     * List Engines
     *
     * Lists the currently available (non-finetuned) models, and provides basic information about each one such as the owner and availability.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listEnginesTest() throws ApiException {
        ListEnginesResponse response = api.listEngines();
        // TODO: test validations
    }

    /**
     * Retrieve Engine
     *
     * Retrieves a model instance, providing basic information about it such as the owner and availability.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveEngineTest() throws ApiException {
        String engineId = null;
        Engine response = api.retrieveEngine(engineId);
        // TODO: test validations
    }

}
