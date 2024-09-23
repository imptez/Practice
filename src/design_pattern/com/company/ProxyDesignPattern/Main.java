package design_pattern.com.company.ProxyDesignPattern;

import Job.Employee;

public class Main {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDaoProxyImpl();
        try {
            employeeDao.create("ADMIN", new Employee("Imptez","ADMIN",123));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
