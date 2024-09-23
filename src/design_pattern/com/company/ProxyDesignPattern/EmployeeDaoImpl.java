package design_pattern.com.company.ProxyDesignPattern;

import Job.Employee;
import java.util.Random;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, Employee emp) throws Exception {
        Random random = new Random();
        System.out.println("Employee Created Successfully "+ String. format("%04d", random. nextInt(10000)));
    }

    @Override
    public void delete(String client, int empId) throws Exception {
        System.out.println("Employee Deleted Successfully "+ empId);
    }

    @Override
    public Employee get(String client, int empId) throws Exception {
        return new Employee("Imptez","ADMIN",123);
    }
}
