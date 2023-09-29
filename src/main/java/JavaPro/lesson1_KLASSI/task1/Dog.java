package JavaPro.lesson1_KLASSI.task1;

public class Dog {

    int age;
    String color;
    //конструткор по умолчанию, который автоматически добавдяется компилятором
        public Dog(){
            System.out.println("вызван конструтор");
    }
    // конструтор с входящим параметром
    public Dog(int age){
            this.age = age;
    }
    public Dog(int age, String color){
        this.age = age;
        this.color = color;
    }

    public void sleep(){
        System.out.println("собака спит");
    }
    public void bark(){
        System.out.println("гав-гав!");
    }
}
