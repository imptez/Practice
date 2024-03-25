package Practice;

import java.util.ArrayList;
import java.util.List;

public class SortingOfEmployee {

    public static void main(String[] args) {

        List<Employee> employees = getEmployees();
        employees.stream()
               // .sorted((o1, o2) -> o1.getId() - o2.getId())
               // .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
                .sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()))
                .forEach(System.out::println);
    }

    private static List<Employee>  getEmployees() {
        Employee imptez = new Employee(1,"Imptez",14.56);
        Employee sasmita = new Employee(3,"Sasmita",12);
        Employee google = new Employee(2,"Google",34.56);
        Employee hamid = new Employee(2,"Hamid",13.56);
        List<Employee> employees = new ArrayList<>();
        employees.add(imptez);
        employees.add(sasmita);
        employees.add(google);
        employees.add(hamid);
        return employees;
    }

    public static class Employee {
        private int id;
        private String name;
        private double salary;


        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }
}
