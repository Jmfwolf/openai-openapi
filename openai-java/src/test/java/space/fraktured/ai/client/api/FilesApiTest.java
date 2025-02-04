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
import space.fraktured.ai.client.model.DeleteFileResponse;
import java.io.File;
import space.fraktured.ai.client.model.ListFilesResponse;
import space.fraktured.ai.client.model.OpenAIFile;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FilesApi
 */
@Disabled
public class FilesApiTest {

    private final FilesApi api = new FilesApi();

    /**
     * Create File
     *
     * Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createFileTest() throws ApiException {
        File _file = null;
        String purpose = null;
        OpenAIFile response = api.createFile(_file, purpose);
        // TODO: test validations
    }

    /**
     * Delete File
     *
     * Delete a file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteFileTest() throws ApiException {
        String fileId = null;
        DeleteFileResponse response = api.deleteFile(fileId);
        // TODO: test validations
    }

    /**
     * Download File
     *
     * Returns the contents of the specified file
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void downloadFileTest() throws ApiException {
        String fileId = null;
        String response = api.downloadFile(fileId);
        // TODO: test validations
    }

    /**
     * List Files
     *
     * Returns a list of files that belong to the user&#39;s organization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listFilesTest() throws ApiException {
        ListFilesResponse response = api.listFiles();
        // TODO: test validations
    }

    /**
     * Retrieve File
     *
     * Returns information about a specific file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveFileTest() throws ApiException {
        String fileId = null;
        OpenAIFile response = api.retrieveFile(fileId);
        // TODO: test validations
    }

}
