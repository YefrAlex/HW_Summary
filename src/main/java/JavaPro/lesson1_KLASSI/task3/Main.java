package JavaPro.lesson1_KLASSI.task3;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat(3,"черный");
        Cat secondCat = new Cat();
        // обращатся к приватному полю напрямую нельзя
        //secondCat.age = 4;
        // чтобы обратится нужен сеттер
        secondCat.setAge(3);
        System.out.println("возраст кошки  " + secondCat.getAge());

    }
}
