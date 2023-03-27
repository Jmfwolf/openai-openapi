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
import space.fraktured.ai.client.model.CreateCompletionResponseChoicesInner;
import space.fraktured.ai.client.model.CreateCompletionResponseUsage;

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
 * CreateCompletionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T16:09:35.007070044-07:00[America/Los_Angeles]")
public class CreateCompletionResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private Integer created;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_CHOICES = "choices";
  @SerializedName(SERIALIZED_NAME_CHOICES)
  private List<CreateCompletionResponseChoicesInner> choices = new ArrayList<>();

  public static final String SERIALIZED_NAME_USAGE = "usage";
  @SerializedName(SERIALIZED_NAME_USAGE)
  private CreateCompletionResponseUsage usage;

  public CreateCompletionResponse() {
  }

  public CreateCompletionResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CreateCompletionResponse _object(String _object) {
    
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


  public CreateCompletionResponse created(Integer created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nonnull

  public Integer getCreated() {
    return created;
  }


  public void setCreated(Integer created) {
    this.created = created;
  }


  public CreateCompletionResponse model(String model) {
    
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nonnull

  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }


  public CreateCompletionResponse choices(List<CreateCompletionResponseChoicesInner> choices) {
    
    this.choices = choices;
    return this;
  }

  public CreateCompletionResponse addChoicesItem(CreateCompletionResponseChoicesInner choicesItem) {
    this.choices.add(choicesItem);
    return this;
  }

   /**
   * Get choices
   * @return choices
  **/
  @javax.annotation.Nonnull

  public List<CreateCompletionResponseChoicesInner> getChoices() {
    return choices;
  }


  public void setChoices(List<CreateCompletionResponseChoicesInner> choices) {
    this.choices = choices;
  }


  public CreateCompletionResponse usage(CreateCompletionResponseUsage usage) {
    
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @javax.annotation.Nullable

  public CreateCompletionResponseUsage getUsage() {
    return usage;
  }


  public void setUsage(CreateCompletionResponseUsage usage) {
    this.usage = usage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCompletionResponse createCompletionResponse = (CreateCompletionResponse) o;
    return Objects.equals(this.id, createCompletionResponse.id) &&
        Objects.equals(this._object, createCompletionResponse._object) &&
        Objects.equals(this.created, createCompletionResponse.created) &&
        Objects.equals(this.model, createCompletionResponse.model) &&
        Objects.equals(this.choices, createCompletionResponse.choices) &&
        Objects.equals(this.usage, createCompletionResponse.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, created, model, choices, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompletionResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("object");
    openapiFields.add("created");
    openapiFields.add("model");
    openapiFields.add("choices");
    openapiFields.add("usage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("created");
    openapiRequiredFields.add("model");
    openapiRequiredFields.add("choices");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateCompletionResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateCompletionResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCompletionResponse is not found in the empty JSON string", CreateCompletionResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateCompletionResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCompletionResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateCompletionResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      if (!jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("choices").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `choices` to be an array in the JSON string but got `%s`", jsonObj.get("choices").toString()));
      }

      JsonArray jsonArraychoices = jsonObj.getAsJsonArray("choices");
      // validate the required field `choices` (array)
      for (int i = 0; i < jsonArraychoices.size(); i++) {
        CreateCompletionResponseChoicesInner.validateJsonObject(jsonArraychoices.get(i).getAsJsonObject());
      };
      // validate the optional field `usage`
      if (jsonObj.get("usage") != null && !jsonObj.get("usage").isJsonNull()) {
        CreateCompletionResponseUsage.validateJsonObject(jsonObj.getAsJsonObject("usage"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCompletionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCompletionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCompletionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCompletionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCompletionResponse>() {
           @Override
           public void write(JsonWriter out, CreateCompletionResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCompletionResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateCompletionResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCompletionResponse
  * @throws IOException if the JSON string is invalid with respect to CreateCompletionResponse
  */
  public static CreateCompletionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCompletionResponse.class);
  }

 /**
  * Convert an instance of CreateCompletionResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

