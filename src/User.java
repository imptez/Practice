
import lombok.Data;
import org.codehaus.jackson.annotate.JsonProperty;

@Data
public class User {

    @JsonProperty("username")
    private String name;

    @JsonProperty("id")
    private int identification;

    public User(String name, int identification) {
        this.name = name;
        this.identification = identification;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", identification=" + identification +
                '}';
    }
}
