package JavaPro.lesson2_NASLEDOVANIE.task1;

public class Dog extends LandAnimal {
    public Dog(double weight) {
        super(weight);
        System.out.println("Вызван конструктор Dog");
    }

    @Override
    public void voice() {
        System.out.println("гав!!!");
    }
}
