package design_pattern.com.company.ProxyDesignPattern;

import Job.Employee;

public class Main {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDaoProxyImpl();
        try {
            employeeDao.create("ADMIN", new Employee.Builder()
                    .setEmpName("Imptez")
                    .setDepartment("A")
                    .setSalary(20000.00)
                    .build());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
