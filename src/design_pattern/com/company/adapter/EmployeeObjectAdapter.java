package design_pattern.com.company.adapter;

public class EmployeeObjectAdapter implements Customer{

    private final Employee employee;

    public EmployeeObjectAdapter(Employee employee) {
        this.employee = employee;
    }


    @Override
    public String getName() {
        return employee.getFullName();
    }

    @Override
    public String getAddress() {
        return employee.getOfficeAddress();
    }

    @Override
    public String getDesignation() {
        return employee.getJobTitle();
    }
}
