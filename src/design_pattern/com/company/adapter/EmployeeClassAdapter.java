package design_pattern.com.company.adapter;


public class EmployeeClassAdapter extends Employee implements Customer {

    @Override
    public String getName() {
        return this.getFullName();
    }

    @Override
    public String getAddress() {
        return this.getOfficeAddress();
    }

    @Override
    public String getDesignation() {
        return this.getJobTitle();
    }
}
