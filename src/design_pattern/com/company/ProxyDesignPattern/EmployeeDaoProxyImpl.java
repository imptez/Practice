package design_pattern.com.company.ProxyDesignPattern;

import Job.Employee;

public class EmployeeDaoProxyImpl implements EmployeeDao {

    EmployeeDao employeeDao;

    public EmployeeDaoProxyImpl() {
        this.employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, Employee emp) throws Exception {
        if (client.equals("ADMIN")) {
            employeeDao.create(client, emp);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int empId) throws Exception {
        if (client.equals("ADMIN")) {
            employeeDao.delete(client, empId);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public Employee get(String client, int empId) throws Exception {
        if (client.equals("ADMIN") || client.equals("USER")) {
            return employeeDao.get(client, empId);
        }
        throw new Exception("Access Denied");
    }
}
