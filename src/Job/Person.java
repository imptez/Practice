package Job;


public class Person {
    int id;
    String name;
    double salary;
    Department department;

    public Person(int id, String name, double salary, Department department) {
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.department=department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
}
