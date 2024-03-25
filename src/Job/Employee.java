package Job;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Employee {
    String empName;
    String department;
    double salary;
}
