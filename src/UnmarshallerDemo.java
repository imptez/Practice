import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.xml.bind.JAXBException;

public class UnmarshallerDemo {

    public static void main(String[] args) throws JAXBException, IOException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        String json = "{\"id\":1,\"name\":\"Imptez\",\"joining\": \"2023-01-09T05:24:52.541624\"}";

        ObjectMapper mapper = new ObjectMapper()
                .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        // mapper.setDateFormat(sdf);
        // Getting the employee pojo again from the json
        Employee employee = mapper.readValue(json, Employee.class);

//time zone with BST
        System.out.println(employee);

    }

}
