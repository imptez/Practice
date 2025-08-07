package Job;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringManipulation {
    static String output = "{\"eventType\":\"/profile/api/v1/card\",\"eventSubType\":\"POST\",\"eventId\":\"0a389c55-4f1b-4a9b-97bc-02cff6a17f28\",\"requestOrigin\":\"george\",\"userAgent\":\"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome Safari/537.36 SoastaCTP\",\"referrerId\":\"10.74.166.113\",\"eventTs\":\"2024-02-29T14:22:19.117+00:00\",\"account\":{\"id\":\"836b560f-4d78-4e45-9843-37cc4a9f0bf1\",\"createdTs\":\"2024-02-29T14:22:18.966+00:00\",\"modifiedTs\":\"2024-02-29T14:22:18.966+00:00\",\"createdBy\":\"836b560f-4d78-4e45-9843-37cc4a9f0bf1\",\"email\":\"api-auto.1709216540695@spother.com\",\"firstName\":\"Automation\",\"fullyRegistered\":\"y\",\"isActive\":\"y\",\"lastLoginAt\":\"2024-02-29T14:22:18.966+00:00\",\"lastUpdatedBy\":\"836b560f-4d78-4e45-9843-37cc4a9f0bf1\",\"loginid\":\"api-auto.1709216540695@spother.com\",\"marketingPreference\":\"y\",\"lastMktPrefUpdateAt\":\"2024-02-29T14:22:18.966+00:00\",\"tncAccepted\":\"y\",\"addresses\":[],\"contacts\":[{\"id\":\"b4ac0226-74e8-4848-8143-d27c3afd40a0\",\"createdTs\":\"2024-02-29T14:22:18.966+00:00\",\"modifiedTs\":\"2024-02-29T14:22:18.966+00:00\",\"contact\":\"api-auto.1709216540695@spother.com\",\"contactType\":\"EMAIL\",\"emailContentType\":\"HTML\",\"isDefault\":\"y\",\"maskedContact\":\"api***@spother.com\",\"accountIdfk\":\"836b560f-4d78-4e45-9843-37cc4a9f0bf1\"}],\"linkedApps\":[],\"memberships\":[],\"messagingPreferences\":[{\"id\":\"026a335a-104a-4f12-a6d1-af5ddea2e987\",\"createdTs\":\"2024-02-29T14:22:18.966+00:00\",\"modifiedTs\":\"2024-02-29T14:22:18.966+00:00\",\"preferenceType\":\"EMAIL\",\"lastUpdatedBy\":\"george\",\"preferenceValue\":\"y\",\"contactReferenceId\":\"836b560f-4d78-4e45-9843-37cc4a9f0bf1\",\"accountIdfk\":\"836b560f-4d78-4e45-9843-37cc4a9f0bf1\",\"optOutReason\":\"George Permission Migration\",\"banner\":\"asda\"}],\"notes\":[],\"paymentInfos\":[],\"termsConditions\":[{\"id\":\"562b299a-a8e7-49d7-b512-ef49cc386e60\",\"createdTs\":\"2024-02-29T14:22:18.966+00:00\",\"modifiedTs\":\"2024-02-29T14:22:18.966+00:00\",\"service\":\"GHS\",\"acceptance\":\"y\",\"accountIdfk\":\"836b560f-4d78-4e45-9843-37cc4a9f0bf1\",\"lastUpdatedBy\":\"836b560f-4d78-4e45-9843-37cc4a9f0bf1\"}],\"profileAttributes\":[],\"channelLevelLoginInfo\":[]}}";

    public static void main(String[] args) throws IOException {
       /* Iterator<Map.Entry<String, JsonNode>> fieldsIterator = getEntryIterator();

        while (fieldsIterator.hasNext()) {

            Map.Entry<String, JsonNode> field = fieldsIterator.next();
            System.out.println("Key:" +field.getKey() + "\tValue:" + field.getValue());
        }*/

        Map<String, Object> singleProfileDataMap = getSingleProfileDataMap(output);
        if(singleProfileDataMap.containsValue("/profile/api/v1/profile")&&(
                singleProfileDataMap.containsValue("PUT") ||
                        singleProfileDataMap.containsValue("POST")
                )){
            System.out.println("Working");
        }

    }

    private static Iterator<Map.Entry<String, JsonNode>> getEntryIterator() throws IOException {


        JsonFactory factory = new JsonFactory();

        ObjectMapper mapper = new ObjectMapper(factory);
        JsonNode rootNode = mapper.readTree(output);

        Iterator<Map.Entry<String, JsonNode>> fieldsIterator = rootNode.fields();
        return fieldsIterator;
    }

    private static Map<String, Object> getSingleProfileDataMap(String output) {
        Map<String, Object> jsonMap = new HashMap<>();
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(output);

            Iterator<Map.Entry<String, JsonNode>> fieldsIterator = jsonNode.fields();
            while (fieldsIterator.hasNext()) {
                Map.Entry<String, JsonNode> field = fieldsIterator.next();
                jsonMap.put(field.getKey(), field.getValue().asText());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonMap;
    }
}


