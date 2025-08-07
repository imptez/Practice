package design_pattern.com.company.adapter;

public class Main {
    public static void main(String[] args) {
        EmployeeClassAdapter employeeClassAdapter = new EmployeeClassAdapter();
        populateEmployee(employeeClassAdapter);
        BusinessCardDesigner businessCardDesigner = new BusinessCardDesigner();
        String designCard = businessCardDesigner.designCard(employeeClassAdapter);
        System.out.println("Class Adapter Design Pattern ");
        System.out.println("-------------------------------");
        System.out.println(designCard);
        System.out.println("-------------------------------");
        System.out.println();
        System.out.println("Object Adapter Design Pattern ");
        System.out.println("-------------------------------");
        Employee employee = new Employee();
        populateEmployee(employee);
        EmployeeObjectAdapter employeeObjectAdapter = new EmployeeObjectAdapter(employee);
        System.out.println(businessCardDesigner.designCard(employeeObjectAdapter));
        System.out.println("-------------------------------");
    }

    public static void populateEmployee(Employee employee){
        employee.setFullName("Imptez");
        employee.setJobTitle("Manager");
        employee.setOfficeAddress("Belandur Banglore");
    }
}
