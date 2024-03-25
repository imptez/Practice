package Job;

import static java.util.Comparator.comparingDouble;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Practice3 {

   /* public static void main(String[] args) {

        List<Employee> employees = buildEmployeeList();

        extractedWithoutUsingStream(employees);
       // extractedUsingStream(employees);
    }

    private static void extractedWithoutUsingStream(List<Employee> employees) {
        Map<String, Employee> collect = new HashMap<>();

        for(Employee emp:employees){
            if(collect.containsKey(emp.getDepartment()))
            {
                if(collect.get(emp.getDepartment()).getSalary() < emp.getSalary()){
                    collect.put(emp.getDepartment(),emp);
                }
            }else{
                collect.put(emp.getDepartment(),emp);
            }
        }

        collect.forEach((s, employee) -> System.out.println("Group: "+s+" employee"+employee));

    }

    private static void extractedUsingStream(List<Employee> employees) {
        Map<String, Employee> collect = employees.stream()
                .collect(groupingBy(Employee::getDepartment,
                        collectingAndThen(maxBy(comparingDouble(e -> e.salary)), Optional::get)
                ));
        collect.forEach((s, employee) -> System.out.println("Group: "+s+" employee"+employee));
    }

    private static List<Employee> buildEmployeeList() {

        List<Employee> empList = new ArrayList<>();
        Employee employee1 = Employee.builder()
                .empName("Imptez")
                .department("A")
                .salary(20000.00)
                .build();
        Employee employee2 = Employee.builder()
                .empName("Amiya")
                .department("A")
                .salary(50000.00)
                .build();
        Employee employee3 = Employee.builder()
                .empName("Dablu")
                .department("B")
                .salary(20000.00)
                .build();
        Employee employee4 = Employee.builder()
                .empName("Sujit")
                .department("B")
                .salary(90000.00)
                .build();

        empList.add(employee1);
        empList.add(employee2);
        empList.add(employee3);
        empList.add(employee4);

        return empList;
    }*/
}
