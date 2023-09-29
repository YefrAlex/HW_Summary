package JavaPro.lesson19_stream2.task6;

public class Employee {
    private String name;
    private String state;
    private double salary;

    public Employee(String name, String state, double salary) {
        this.name=name;
        this.state=state;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setState(String state) {
        this.state=state;
    }

    public void setSalary(double salary) {
        this.salary=salary;
    }
}
