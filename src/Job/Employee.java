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

    public Employee(String empName, String department, double salary) {
        this.empName = empName;
        this.department = department;
        this.salary = salary;
    }
}
