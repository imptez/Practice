import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Date;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Employee {
    private int id;
    private String name;
    //private List<String> skills;
    @JsonDeserialize(using = DateHandler.class)
    private Date joining;

}
