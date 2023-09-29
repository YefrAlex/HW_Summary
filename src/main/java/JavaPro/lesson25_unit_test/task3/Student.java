package JavaPro.lesson25_unit_test.task3;

public class Student {
    private int id;
    private String name;
    private int age;
    private Degree degree;

     Student(int id, String name, int age, Degree degree) {
        this.id=id;
        this.name=name;
        this.age=age;
        this.degree=degree;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Degree getDegree() {
        return degree;
    }
}
