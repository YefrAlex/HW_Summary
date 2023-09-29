package JavaSummary.Tasks;

import org.jetbrains.annotations.NotNull;

public class Emploey implements Comparable <Emploey> {
    private String firstname;
    private String secondname;
    private double salary;
    private int age;

    public Emploey(String firstname, String secondname, double salary, int age) {
        this.firstname=firstname;
        this.secondname=secondname;
        this.salary=salary;
        this.age=age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname=firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname=secondname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary=salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age=age;
    }

    @Override
    public String toString() {
        return "Emploey{" +
                "firstname='" + firstname + '\'' +
                ", secondname='" + secondname + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                "}\n "
                ;
    }


    @Override
    public int compareTo(@NotNull Emploey o) {
        return (int)(this.salary-o.salary);
    }
}
