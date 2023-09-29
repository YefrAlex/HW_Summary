package JavaPro.lesson17_Lambda.task2;

public class Dog {
    private int age;
    private String color;
    private  double weight;

    public Dog(int age, String color, double weight) {
        this.age=age;
        this.color=color;
        this.weight=weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return  String.format("Собака: возраст - %d, цвет - %s, вес - %2f", age, color, weight);
    }
}
