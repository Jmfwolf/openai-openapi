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


package space.fraktured.ai.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import space.fraktured.ai.client.JSON;

/**
 * CreateSearchRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T16:09:35.007070044-07:00[America/Los_Angeles]")
public class CreateSearchRequest {
  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  private List<String> documents;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private String _file;

  public static final String SERIALIZED_NAME_MAX_RERANK = "max_rerank";
  @SerializedName(SERIALIZED_NAME_MAX_RERANK)
  private Integer maxRerank = 200;

  public static final String SERIALIZED_NAME_RETURN_METADATA = "return_metadata";
  @SerializedName(SERIALIZED_NAME_RETURN_METADATA)
  private Boolean returnMetadata = false;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public CreateSearchRequest() {
  }

  public CreateSearchRequest query(String query) {
    
    this.query = query;
    return this;
  }

   /**
   * Query to search against the documents.
   * @return query
  **/
  @javax.annotation.Nonnull

  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    this.query = query;
  }


  public CreateSearchRequest documents(List<String> documents) {
    
    this.documents = documents;
    return this;
  }

  public CreateSearchRequest addDocumentsItem(String documentsItem) {
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * Up to 200 documents to search over, provided as a list of strings.  The maximum document length (in tokens) is 2034 minus the number of tokens in the query.  You should specify either &#x60;documents&#x60; or a &#x60;file&#x60;, but not both. 
   * @return documents
  **/
  @javax.annotation.Nullable

  public List<String> getDocuments() {
    return documents;
  }


  public void setDocuments(List<String> documents) {
    this.documents = documents;
  }


  public CreateSearchRequest _file(String _file) {
    
    this._file = _file;
    return this;
  }

   /**
   * The ID of an uploaded file that contains documents to search over.  You should specify either &#x60;documents&#x60; or a &#x60;file&#x60;, but not both. 
   * @return _file
  **/
  @javax.annotation.Nullable

  public String getFile() {
    return _file;
  }


  public void setFile(String _file) {
    this._file = _file;
  }


  public CreateSearchRequest maxRerank(Integer maxRerank) {
    
    this.maxRerank = maxRerank;
    return this;
  }

   /**
   * The maximum number of documents to be re-ranked and returned by search.  This flag only takes effect when &#x60;file&#x60; is set. 
   * minimum: 1
   * @return maxRerank
  **/
  @javax.annotation.Nullable

  public Integer getMaxRerank() {
    return maxRerank;
  }


  public void setMaxRerank(Integer maxRerank) {
    this.maxRerank = maxRerank;
  }


  public CreateSearchRequest returnMetadata(Boolean returnMetadata) {
    
    this.returnMetadata = returnMetadata;
    return this;
  }

   /**
   * A special boolean flag for showing metadata. If set to &#x60;true&#x60;, each document entry in the returned JSON will contain a \&quot;metadata\&quot; field.  This flag only takes effect when &#x60;file&#x60; is set. 
   * @return returnMetadata
  **/
  @javax.annotation.Nullable

  public Boolean getReturnMetadata() {
    return returnMetadata;
  }


  public void setReturnMetadata(Boolean returnMetadata) {
    this.returnMetadata = returnMetadata;
  }


  public CreateSearchRequest user(String user) {
    
    this.user = user;
    return this;
  }

   /**
   * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
   * @return user
  **/
  @javax.annotation.Nullable

  public String getUser() {
    return user;
  }


  public void setUser(String user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSearchRequest createSearchRequest = (CreateSearchRequest) o;
    return Objects.equals(this.query, createSearchRequest.query) &&
        Objects.equals(this.documents, createSearchRequest.documents) &&
        Objects.equals(this._file, createSearchRequest._file) &&
        Objects.equals(this.maxRerank, createSearchRequest.maxRerank) &&
        Objects.equals(this.returnMetadata, createSearchRequest.returnMetadata) &&
        Objects.equals(this.user, createSearchRequest.user);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, documents, _file, maxRerank, returnMetadata, user);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSearchRequest {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    maxRerank: ").append(toIndentedString(maxRerank)).append("\n");
    sb.append("    returnMetadata: ").append(toIndentedString(returnMetadata)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("query");
    openapiFields.add("documents");
    openapiFields.add("file");
    openapiFields.add("max_rerank");
    openapiFields.add("return_metadata");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("query");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateSearchRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateSearchRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateSearchRequest is not found in the empty JSON string", CreateSearchRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateSearchRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateSearchRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateSearchRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("documents") != null && !jsonObj.get("documents").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `documents` to be an array in the JSON string but got `%s`", jsonObj.get("documents").toString()));
      }
      if ((jsonObj.get("file") != null && !jsonObj.get("file").isJsonNull()) && !jsonObj.get("file").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file").toString()));
      }
      if ((jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) && !jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSearchRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSearchRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSearchRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSearchRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSearchRequest>() {
           @Override
           public void write(JsonWriter out, CreateSearchRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSearchRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateSearchRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSearchRequest
  * @throws IOException if the JSON string is invalid with respect to CreateSearchRequest
  */
  public static CreateSearchRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSearchRequest.class);
  }

 /**
  * Convert an instance of CreateSearchRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
