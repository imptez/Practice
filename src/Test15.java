import java.text.ParseException;
import java.util.*;
import java.util.stream.Collectors;

public class Test15 {
   /* public static void main(String[] args) throws ParseException {
        List<Employee> employees = Arrays.asList(
                // Department: IT
                new Employee("Alice", 4500, "IT"),
                new Employee("Bob", 4625, "IT"),
                new Employee("Charlie", 4780, "IT"),
                new Employee("David", 4890, "IT"),

                // Department: HR
                new Employee("Emma", 5010, "HR"),
                new Employee("Fiona", 5150, "HR"),
                new Employee("George", 5280, "HR"),
                new Employee("Helen", 5390, "HR"),

                // Department: Finance
                new Employee("Ian", 5600, "Finance"),
                new Employee("Jack", 5720, "Finance"),
                new Employee("Karen", 5890, "Finance"),
                new Employee("Leo", 5960, "Finance"),

                // Department: Sales
                new Employee("Mia", 6100, "Sales"),
                new Employee("Noah", 6240, "Sales"),
                new Employee("Olivia", 6390, "Sales"),
                new Employee("Paul", 6550, "Sales"),

                // Department: Operations
                new Employee("Quinn", 6700, "Operations"),
                new Employee("Imptez", 7120, "Operations"),
                new Employee("Ryan", 6840, "Operations"),
                new Employee("Sophia", 6980, "Operations"),
                new Employee("Tom", 7120, "Operations")
        );

        printEmployeeWithHighestSalaryWithEachDepartment(employees);
    }*/



    static void printEmployeeWithHighestSalaryWithEachDepartment(List<Employee> empList){
        Set<Double> set=new HashSet<>();
        empList.stream().collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((s, employees) ->{
            System.out.println("The Department is "+s);
                    System.out.println("=====================================================");
                    List<Double> uniqueSalaries = employees.stream()
                            .map(Employee::getSalary)
                            .distinct()
                            .sorted(Comparator.reverseOrder())
                            .toList();

                    double thirdHighestSalary;
                    if (uniqueSalaries.size() >= 3) {
                        thirdHighestSalary = uniqueSalaries.get(2); // 3rd highest
                    } else {
                        thirdHighestSalary = uniqueSalaries.get(uniqueSalaries.size() - 1); // last one
                    }
                    employees.stream()
                            .filter(employee -> employee.getSalary()>=thirdHighestSalary)
                            .forEach(System.out::println);
                    System.out.println("=====================================================");

                } );
    }
}
