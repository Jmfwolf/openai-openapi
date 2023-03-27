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
import space.fraktured.ai.client.model.ChatCompletionResponseMessage;

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
 * CreateChatCompletionResponseChoicesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T16:09:35.007070044-07:00[America/Los_Angeles]")
public class CreateChatCompletionResponseChoicesInner {
  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private ChatCompletionResponseMessage message;

  public static final String SERIALIZED_NAME_FINISH_REASON = "finish_reason";
  @SerializedName(SERIALIZED_NAME_FINISH_REASON)
  private String finishReason;

  public CreateChatCompletionResponseChoicesInner() {
  }

  public CreateChatCompletionResponseChoicesInner index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @javax.annotation.Nullable

  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  public CreateChatCompletionResponseChoicesInner message(ChatCompletionResponseMessage message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable

  public ChatCompletionResponseMessage getMessage() {
    return message;
  }


  public void setMessage(ChatCompletionResponseMessage message) {
    this.message = message;
  }


  public CreateChatCompletionResponseChoicesInner finishReason(String finishReason) {
    
    this.finishReason = finishReason;
    return this;
  }

   /**
   * Get finishReason
   * @return finishReason
  **/
  @javax.annotation.Nullable

  public String getFinishReason() {
    return finishReason;
  }


  public void setFinishReason(String finishReason) {
    this.finishReason = finishReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatCompletionResponseChoicesInner createChatCompletionResponseChoicesInner = (CreateChatCompletionResponseChoicesInner) o;
    return Objects.equals(this.index, createChatCompletionResponseChoicesInner.index) &&
        Objects.equals(this.message, createChatCompletionResponseChoicesInner.message) &&
        Objects.equals(this.finishReason, createChatCompletionResponseChoicesInner.finishReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, message, finishReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionResponseChoicesInner {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    finishReason: ").append(toIndentedString(finishReason)).append("\n");
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
    openapiFields.add("message");
    openapiFields.add("finish_reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateChatCompletionResponseChoicesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateChatCompletionResponseChoicesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateChatCompletionResponseChoicesInner is not found in the empty JSON string", CreateChatCompletionResponseChoicesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateChatCompletionResponseChoicesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateChatCompletionResponseChoicesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `message`
      if (jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) {
        ChatCompletionResponseMessage.validateJsonObject(jsonObj.getAsJsonObject("message"));
      }
      if ((jsonObj.get("finish_reason") != null && !jsonObj.get("finish_reason").isJsonNull()) && !jsonObj.get("finish_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `finish_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("finish_reason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateChatCompletionResponseChoicesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateChatCompletionResponseChoicesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateChatCompletionResponseChoicesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateChatCompletionResponseChoicesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateChatCompletionResponseChoicesInner>() {
           @Override
           public void write(JsonWriter out, CreateChatCompletionResponseChoicesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateChatCompletionResponseChoicesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateChatCompletionResponseChoicesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateChatCompletionResponseChoicesInner
  * @throws IOException if the JSON string is invalid with respect to CreateChatCompletionResponseChoicesInner
  */
  public static CreateChatCompletionResponseChoicesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateChatCompletionResponseChoicesInner.class);
  }

 /**
  * Convert an instance of CreateChatCompletionResponseChoicesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
