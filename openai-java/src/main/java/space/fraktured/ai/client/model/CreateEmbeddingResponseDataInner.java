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
import java.util.ArrayList;
import java.util.List;

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
 * CreateEmbeddingResponseDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T16:09:35.007070044-07:00[America/Los_Angeles]")
public class CreateEmbeddingResponseDataInner {
  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object;

  public static final String SERIALIZED_NAME_EMBEDDING = "embedding";
  @SerializedName(SERIALIZED_NAME_EMBEDDING)
  private List<BigDecimal> embedding = new ArrayList<>();

  public CreateEmbeddingResponseDataInner() {
  }

  public CreateEmbeddingResponseDataInner index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @javax.annotation.Nonnull

  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  public CreateEmbeddingResponseDataInner _object(String _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nonnull

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    this._object = _object;
  }


  public CreateEmbeddingResponseDataInner embedding(List<BigDecimal> embedding) {
    
    this.embedding = embedding;
    return this;
  }

  public CreateEmbeddingResponseDataInner addEmbeddingItem(BigDecimal embeddingItem) {
    this.embedding.add(embeddingItem);
    return this;
  }

   /**
   * Get embedding
   * @return embedding
  **/
  @javax.annotation.Nonnull

  public List<BigDecimal> getEmbedding() {
    return embedding;
  }


  public void setEmbedding(List<BigDecimal> embedding) {
    this.embedding = embedding;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEmbeddingResponseDataInner createEmbeddingResponseDataInner = (CreateEmbeddingResponseDataInner) o;
    return Objects.equals(this.index, createEmbeddingResponseDataInner.index) &&
        Objects.equals(this._object, createEmbeddingResponseDataInner._object) &&
        Objects.equals(this.embedding, createEmbeddingResponseDataInner.embedding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, _object, embedding);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEmbeddingResponseDataInner {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    embedding: ").append(toIndentedString(embedding)).append("\n");
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
    openapiFields.add("index");
    openapiFields.add("object");
    openapiFields.add("embedding");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("index");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("embedding");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateEmbeddingResponseDataInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateEmbeddingResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateEmbeddingResponseDataInner is not found in the empty JSON string", CreateEmbeddingResponseDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateEmbeddingResponseDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateEmbeddingResponseDataInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateEmbeddingResponseDataInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("embedding") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("embedding").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `embedding` to be an array in the JSON string but got `%s`", jsonObj.get("embedding").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateEmbeddingResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateEmbeddingResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateEmbeddingResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateEmbeddingResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateEmbeddingResponseDataInner>() {
           @Override
           public void write(JsonWriter out, CreateEmbeddingResponseDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateEmbeddingResponseDataInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateEmbeddingResponseDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateEmbeddingResponseDataInner
  * @throws IOException if the JSON string is invalid with respect to CreateEmbeddingResponseDataInner
  */
  public static CreateEmbeddingResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateEmbeddingResponseDataInner.class);
  }

 /**
  * Convert an instance of CreateEmbeddingResponseDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

