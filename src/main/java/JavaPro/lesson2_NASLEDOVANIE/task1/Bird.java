package JavaPro.lesson2_NASLEDOVANIE.task1;

public class Bird extends Animal implements Flayable {
    public Bird(double weight) {

        super(weight);
    }

    @Override
    public void fly() {
        System.out.println("птица летит");
    }

    @Override
    public void landing() {
        System.out.println("птица приземлилась");
    }

}
