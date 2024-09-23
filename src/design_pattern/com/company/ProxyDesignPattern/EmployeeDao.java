package design_pattern.com.company.ProxyDesignPattern;

import Job.Employee;

public interface EmployeeDao {

    public void create(String client, Employee emp) throws Exception;

    public void delete(String client, int empId) throws Exception;

    public Employee get(String client, int empId) throws Exception;
}
