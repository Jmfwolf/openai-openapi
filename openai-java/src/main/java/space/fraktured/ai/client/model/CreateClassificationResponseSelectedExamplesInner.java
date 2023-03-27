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
 * CreateClassificationResponseSelectedExamplesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T16:09:35.007070044-07:00[America/Los_Angeles]")
public class CreateClassificationResponseSelectedExamplesInner {
  public static final String SERIALIZED_NAME_DOCUMENT = "document";
  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  private Integer document;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public CreateClassificationResponseSelectedExamplesInner() {
  }

  public CreateClassificationResponseSelectedExamplesInner document(Integer document) {
    
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


  public CreateClassificationResponseSelectedExamplesInner text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public CreateClassificationResponseSelectedExamplesInner label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateClassificationResponseSelectedExamplesInner createClassificationResponseSelectedExamplesInner = (CreateClassificationResponseSelectedExamplesInner) o;
    return Objects.equals(this.document, createClassificationResponseSelectedExamplesInner.document) &&
        Objects.equals(this.text, createClassificationResponseSelectedExamplesInner.text) &&
        Objects.equals(this.label, createClassificationResponseSelectedExamplesInner.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, text, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateClassificationResponseSelectedExamplesInner {\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
    openapiFields.add("document");
    openapiFields.add("text");
    openapiFields.add("label");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateClassificationResponseSelectedExamplesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateClassificationResponseSelectedExamplesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateClassificationResponseSelectedExamplesInner is not found in the empty JSON string", CreateClassificationResponseSelectedExamplesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateClassificationResponseSelectedExamplesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateClassificationResponseSelectedExamplesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateClassificationResponseSelectedExamplesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateClassificationResponseSelectedExamplesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateClassificationResponseSelectedExamplesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateClassificationResponseSelectedExamplesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateClassificationResponseSelectedExamplesInner>() {
           @Override
           public void write(JsonWriter out, CreateClassificationResponseSelectedExamplesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateClassificationResponseSelectedExamplesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateClassificationResponseSelectedExamplesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateClassificationResponseSelectedExamplesInner
  * @throws IOException if the JSON string is invalid with respect to CreateClassificationResponseSelectedExamplesInner
  */
  public static CreateClassificationResponseSelectedExamplesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateClassificationResponseSelectedExamplesInner.class);
  }

 /**
  * Convert an instance of CreateClassificationResponseSelectedExamplesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
