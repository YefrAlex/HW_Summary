package JavaPro.lesson2_NASLEDOVANIE.task1;

public abstract class  Animal {
    protected double weight;

    public Animal(double weight) {
        this.weight=weight;
        System.out.println("Вызван конструктор Animal");
    }
}
