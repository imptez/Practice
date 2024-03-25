package Job;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@Getter
@Setter
@ToString
public class Department {

    int id;
    String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }


}
