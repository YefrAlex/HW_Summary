package JavaPro.lesson2_NASLEDOVANIE.task1;

public class Cow extends LandAnimal {
    public Cow(double weight) {
        super(weight);
        System.out.println("Вызван конструктор Cow");

    }

    @Override
    public void voice() {
        System.out.println("Муу!!!");
    }

}
