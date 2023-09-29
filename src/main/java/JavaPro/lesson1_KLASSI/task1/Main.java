package JavaPro.lesson1_KLASSI.task1;

public class Main {
    public static void main(String[] args) {
        // создание переменной - объект еще не создается
        Dog dog = new Dog();
        //  создается объект "собаки"  под него выделяется память
        // и ссылка на этот объект записывается в переменную dog
        System.out.println("объект собаки создан");
        dog.age = 7;
        dog.color = "Черный";

        System.out.println("возраст " + dog.age );
        System.out.println("цвет " + dog.color);

        dog.bark();
        dog.sleep();

        Dog secondDog = new Dog(5);
        System.out.println("возвраст второй собаки - " + secondDog.age);

        Dog therdDog = new Dog(1, "белый");
        System.out.println("возвраст второй собаки - " + therdDog.age);
        System.out.println("цвет - " + therdDog.color );
    }
}
