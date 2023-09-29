package JavaPro.lesson2_NASLEDOVANIE.task1;

public class Main {
    public static void main(String[] args) {

        System.out.println("создаем кошку ");
        Cat cat = new Cat(3);
        //cat.weight = 3;
        System.out.println("создаем собаку ");
        Dog dog = new Dog(7);
        //dog.weight =7;
        System.out.println("вес кошки - " + cat.weight);
        System.out.println("вес собаки - " + dog.weight);
        System.out.println("вес коровы - " + test());

        cat.voice();
        dog.voice();

        Bird bird = new Bird(2);
        Airplane airplane = new Airplane();
        bird.fly();
        bird.landing();
        airplane.fly();
        airplane.landing();

    }
    public static double test () {
        System.out.println("создаем корову ");
        Cow cow = new Cow(150);
        //cow.weight = 150;
        return cow.weight;


    }
}
