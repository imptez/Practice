package Job;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@Getter
@Setter
@ToString
public class Person {
    int id;
    String name;
    double salary;
    Department department;

    public Person(int id, String name, double salary, Department department) {
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.department=department;
    }
}
