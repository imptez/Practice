import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ODSJsonUtil {


    private static final ObjectMapper OBJECT_MAPPER =
            new ObjectMapper()
                    .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                    .configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false)
                    .configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true)
                    .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
                    .configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, false)
                    .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
                    .configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, true)
                    .configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false)
                    .setSerializationInclusion(JsonInclude.Include.NON_NULL)
                    .setSerializationInclusion(JsonInclude.Include.NON_EMPTY)
                    .setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);

    /**
     * Convert object into Json string using jackson.
     *
     * @param object object that needs to be converted.
     * @param <T>    object type.
     * @return Json.
     */
    public static <T> String convertObjectInJson(T object) throws Exception {
        try {
            return getObjectMapperInstance().writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new Exception("Exception while parsing", e);
        }
    }

    /**
     * Convert json into object using jackson.
     *
     * @param json      json string
     * @param classType type of object tht is needed.
     * @param <T>       generic type to convert into
     * @return generic object.
     */
    public static <T> T convertJsonInObject(String json, Class<T> classType) throws Exception {
        try {
            return getObjectMapperInstance().readValue(json, classType);
        } catch (JsonProcessingException e) {
            throw new Exception("Exception while parsing", e);
        }
    }

    /**
     * converts the given sting to object.
     *
     * @param json          json input in string.
     * @param typeReference type of the class to be converted.
     * @param <T>           class to be converted.
     * @return T
     * @throws IOException io exception.
     */
    public static <T> T convertJsonInObject(final String json,
                                            final TypeReference<T> typeReference) throws IOException {
        try {
            return getObjectMapperInstance().readValue(json, typeReference);
        } catch (IOException e) {
            throw e;
        }
    }

    public static ObjectMapper getObjectMapperInstance() {
        return OBJECT_MAPPER;
    }
}
