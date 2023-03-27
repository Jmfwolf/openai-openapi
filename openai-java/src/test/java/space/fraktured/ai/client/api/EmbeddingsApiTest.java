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
import space.fraktured.ai.client.model.CreateEmbeddingRequest;
import space.fraktured.ai.client.model.CreateEmbeddingResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmbeddingsApi
 */
@Disabled
public class EmbeddingsApiTest {

    private final EmbeddingsApi api = new EmbeddingsApi();

    /**
     * Create Embedding
     *
     * Creates an embedding vector representing the input text.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createEmbeddingTest() throws ApiException {
        CreateEmbeddingRequest createEmbeddingRequest = null;
        CreateEmbeddingResponse response = api.createEmbedding(createEmbeddingRequest);
        // TODO: test validations
    }

}
