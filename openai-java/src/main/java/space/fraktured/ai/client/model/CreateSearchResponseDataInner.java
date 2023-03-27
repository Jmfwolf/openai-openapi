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
import java.math.BigDecimal;

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
 * CreateSearchResponseDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T16:51:01.357479157-07:00[America/Los_Angeles]")
public class CreateSearchResponseDataInner {
  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object;

  public static final String SERIALIZED_NAME_DOCUMENT = "document";
  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  private Integer document;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private BigDecimal score;

  public CreateSearchResponseDataInner() {
  }

  public CreateSearchResponseDataInner _object(String _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nullable

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    this._object = _object;
  }


  public CreateSearchResponseDataInner document(Integer document) {
    
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @javax.annotation.Nullable

  public Integer getDocument() {
    return document;
  }


  public void setDocument(Integer document) {
    this.document = document;
  }


  public CreateSearchResponseDataInner score(BigDecimal score) {
    
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @javax.annotation.Nullable

  public BigDecimal getScore() {
    return score;
  }


  public void setScore(BigDecimal score) {
    this.score = score;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSearchResponseDataInner createSearchResponseDataInner = (CreateSearchResponseDataInner) o;
    return Objects.equals(this._object, createSearchResponseDataInner._object) &&
        Objects.equals(this.document, createSearchResponseDataInner.document) &&
        Objects.equals(this.score, createSearchResponseDataInner.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, document, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSearchResponseDataInner {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
    openapiFields.add("object");
    openapiFields.add("document");
    openapiFields.add("score");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateSearchResponseDataInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateSearchResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateSearchResponseDataInner is not found in the empty JSON string", CreateSearchResponseDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateSearchResponseDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateSearchResponseDataInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) && !jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSearchResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSearchResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSearchResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSearchResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSearchResponseDataInner>() {
           @Override
           public void write(JsonWriter out, CreateSearchResponseDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSearchResponseDataInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateSearchResponseDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSearchResponseDataInner
  * @throws IOException if the JSON string is invalid with respect to CreateSearchResponseDataInner
  */
  public static CreateSearchResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSearchResponseDataInner.class);
  }

 /**
  * Convert an instance of CreateSearchResponseDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

