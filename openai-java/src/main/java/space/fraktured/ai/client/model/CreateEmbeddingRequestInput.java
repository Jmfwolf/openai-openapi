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
import java.util.List;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import space.fraktured.ai.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-27T16:09:35.007070044-07:00[America/Los_Angeles]")
public class CreateEmbeddingRequestInput extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateEmbeddingRequestInput.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateEmbeddingRequestInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateEmbeddingRequestInput' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<List&lt;Integer&gt;> adapterList&lt;Integer&gt; = gson.getDelegateAdapter(this, TypeToken.get(List&lt;Integer&gt;.class));
            final TypeAdapter<List&lt;List&lt;Integer&gt;&gt;> adapterList&lt;List&lt;Integer&gt;&gt; = gson.getDelegateAdapter(this, TypeToken.get(List&lt;List&lt;Integer&gt;&gt;.class));
            final TypeAdapter<List&lt;String&gt;> adapterList&lt;String&gt; = gson.getDelegateAdapter(this, TypeToken.get(List&lt;String&gt;.class));
            final TypeAdapter<String> adapterString = gson.getDelegateAdapter(this, TypeToken.get(String.class));

            return (TypeAdapter<T>) new TypeAdapter<CreateEmbeddingRequestInput>() {
                @Override
                public void write(JsonWriter out, CreateEmbeddingRequestInput value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `List&lt;Integer&gt;`
                    if (value.getActualInstance() instanceof List&lt;Integer&gt;) {
                        JsonObject obj = adapterList&lt;Integer&gt;.toJsonTree((List&lt;Integer&gt;)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `List&lt;List&lt;Integer&gt;&gt;`
                    if (value.getActualInstance() instanceof List&lt;List&lt;Integer&gt;&gt;) {
                        JsonObject obj = adapterList&lt;List&lt;Integer&gt;&gt;.toJsonTree((List&lt;List&lt;Integer&gt;&gt;)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `List&lt;String&gt;`
                    if (value.getActualInstance() instanceof List&lt;String&gt;) {
                        JsonObject obj = adapterList&lt;String&gt;.toJsonTree((List&lt;String&gt;)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `String`
                    if (value.getActualInstance() instanceof String) {
                        JsonObject obj = adapterString.toJsonTree((String)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: List<Integer>, List<List<Integer>>, List<String>, String");
                }

                @Override
                public CreateEmbeddingRequestInput read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize List<Integer>
                    try {
                        // validate the JSON object to see if any exception is thrown
                        List&lt;Integer&gt;.validateJsonObject(jsonObject);
                        actualAdapter = adapterList&lt;Integer&gt;;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'List<Integer>'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for List<Integer> failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'List<Integer>'", e);
                    }

                    // deserialize List<List<Integer>>
                    try {
                        // validate the JSON object to see if any exception is thrown
                        List&lt;List&lt;Integer&gt;&gt;.validateJsonObject(jsonObject);
                        actualAdapter = adapterList&lt;List&lt;Integer&gt;&gt;;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'List<List<Integer>>'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for List<List<Integer>> failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'List<List<Integer>>'", e);
                    }

                    // deserialize List<String>
                    try {
                        // validate the JSON object to see if any exception is thrown
                        List&lt;String&gt;.validateJsonObject(jsonObject);
                        actualAdapter = adapterList&lt;String&gt;;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'List<String>'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for List<String> failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'List<String>'", e);
                    }

                    // deserialize String
                    try {
                        // validate the JSON object to see if any exception is thrown
                        String.validateJsonObject(jsonObject);
                        actualAdapter = adapterString;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'String'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for String failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'String'", e);
                    }

                    if (match == 1) {
                        CreateEmbeddingRequestInput ret = new CreateEmbeddingRequestInput();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CreateEmbeddingRequestInput: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public CreateEmbeddingRequestInput() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateEmbeddingRequestInput(List<Integer> o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateEmbeddingRequestInput(List<List<Integer>> o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateEmbeddingRequestInput(List<String> o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateEmbeddingRequestInput(String o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("List<Integer>", new GenericType<List<Integer>>() {
        });
        schemas.put("List<List<Integer>>", new GenericType<List<List<Integer>>>() {
        });
        schemas.put("List<String>", new GenericType<List<String>>() {
        });
        schemas.put("String", new GenericType<String>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return CreateEmbeddingRequestInput.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * List<Integer>, List<List<Integer>>, List<String>, String
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof List<Integer>) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof List<List<Integer>>) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof List<String>) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof String) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be List<Integer>, List<List<Integer>>, List<String>, String");
    }

    /**
     * Get the actual instance, which can be the following:
     * List<Integer>, List<List<Integer>>, List<String>, String
     *
     * @return The actual instance (List<Integer>, List<List<Integer>>, List<String>, String)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `List<Integer>`. If the actual instance is not `List<Integer>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<Integer>`
     * @throws ClassCastException if the instance is not `List<Integer>`
     */
    public List<Integer> getList<Integer>() throws ClassCastException {
        return (List<Integer>)super.getActualInstance();
    }

    /**
     * Get the actual instance of `List<List<Integer>>`. If the actual instance is not `List<List<Integer>>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<List<Integer>>`
     * @throws ClassCastException if the instance is not `List<List<Integer>>`
     */
    public List<List<Integer>> getList<List<Integer>>() throws ClassCastException {
        return (List<List<Integer>>)super.getActualInstance();
    }

    /**
     * Get the actual instance of `List<String>`. If the actual instance is not `List<String>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<String>`
     * @throws ClassCastException if the instance is not `List<String>`
     */
    public List<String> getList<String>() throws ClassCastException {
        return (List<String>)super.getActualInstance();
    }

    /**
     * Get the actual instance of `String`. If the actual instance is not `String`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `String`
     * @throws ClassCastException if the instance is not `String`
     */
    public String getString() throws ClassCastException {
        return (String)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateEmbeddingRequestInput
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with List<Integer>
    try {
      List<Integer>.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for List<Integer> failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with List<List<Integer>>
    try {
      List<List<Integer>>.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for List<List<Integer>> failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with List<String>
    try {
      List<String>.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for List<String> failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with String
    try {
      String.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for String failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for CreateEmbeddingRequestInput with oneOf schemas: List<Integer>, List<List<Integer>>, List<String>, String. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of CreateEmbeddingRequestInput given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateEmbeddingRequestInput
  * @throws IOException if the JSON string is invalid with respect to CreateEmbeddingRequestInput
  */
  public static CreateEmbeddingRequestInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateEmbeddingRequestInput.class);
  }

 /**
  * Convert an instance of CreateEmbeddingRequestInput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

