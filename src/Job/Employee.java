package Job;


public final class Employee {
    private final String empName;
    private final  String department;
    private final  double salary;

    private Employee(Builder builder) {
        this.empName = builder.empName;
        this.department = builder.department;
        this.salary = builder.salary;
    }

    public static class Builder {
        String empName;
        String department;
        double salary;

        public Builder setEmpName(String empName) {
            this.empName = empName;
            return this;
        }

        public Builder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public Builder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getEmpName() {
        return empName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}
