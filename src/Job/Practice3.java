package Job;

import static java.util.Comparator.comparingDouble;
import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice3 {

    public static void main(String[] args) {

        List<Employee> employees = buildEmployeeList();
        Map<String, List<Employee>> departEmployee = employees.stream()
                .collect(groupingBy(Employee::getDepartment));
        departEmployee.forEach((s, employees1) -> System.out.println("The Department is "+s+" the eployees are "+employees1));

        Map<String, Employee> stringEmployeeMap = employees.stream()
                .collect(toMap(Employee::getDepartment, Function.identity(), BinaryOperator.maxBy(comparingDouble(Employee::getSalary))));
        stringEmployeeMap.forEach((s, employees1) -> System.out.println("The Department is "+s+" the eployees are "+employees1));

        //extractedWithoutUsingStream(employees);
        // extractedUsingStream(employees);
    }

    private static void extractedWithoutUsingStream(List<Employee> employees) {
        Map<String, Employee> collect = new HashMap<>();

        for (Employee emp : employees) {
            if (collect.containsKey(emp.getDepartment())) {
                if (collect.get(emp.getDepartment()).getSalary() < emp.getSalary()) {
                    collect.put(emp.getDepartment(), emp);
                }
            } else {
                collect.put(emp.getDepartment(), emp);
            }
        }

        collect.forEach((s, employee) -> System.out.println("Group: " + s + " employee" + employee));

    }

    private static void extractedUsingStream(List<Employee> employees) {
        Map<String, Employee> collect = employees.stream()
                .collect(groupingBy(Employee::getDepartment,
                        collectingAndThen(maxBy(comparingDouble(Employee::getSalary)), Optional::get)
                ));
        collect.forEach((s, employee) -> System.out.println("Group: " + s + " employee" + employee));
    }

    private static List<Employee> buildEmployeeList() {

        List<Employee> empList = new ArrayList<>();
        Employee employee1 = new Employee.Builder()
                .setEmpName("Imptez")
                .setDepartment("A")
                .setSalary(20000.00)
                .build();
        Employee employee2 = new Employee.Builder()
                .setEmpName("Amiya")
                .setDepartment("A")
                .setSalary(50000.00)
                .build();
        Employee employee3 = new Employee.Builder()
                .setEmpName("Dablu")
                .setDepartment("B")
                .setSalary(20000.00)
                .build();
        Employee employee4 = new Employee.Builder()
                .setEmpName("Sujit")
                .setDepartment("B")
                .setSalary(90000.00)
                .build();

        empList.add(employee1);
        empList.add(employee2);
        empList.add(employee3);
        empList.add(employee4);

        return empList;
    }
}
