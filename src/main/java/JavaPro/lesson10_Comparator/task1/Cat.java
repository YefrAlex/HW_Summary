package JavaPro.lesson10_Comparator.task1;

import java.util.Objects;

public class Cat {
    private  String color;
    private int age;
    private  double weight;

    public Cat(String color, int age, double weight) {
        this.color=color;
        this.age=age;
        this.weight=weight;
    }

    public Cat() {
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (obj.getClass() != this.getClass()){
            return false;
        }
        Cat cat = (Cat) obj;
        // this - текущий кот (у которого вызван метод equals)
        // cat - это тот кот, который передан в метод в качестве входящего параметра

        if (this.age == cat.age && Objects.equals(this.color,cat.color) && Double.compare(this.weight, cat.weight) == 0){
            return  true;

        } else return false;
    }




}
