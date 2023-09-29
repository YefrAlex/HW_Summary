package JavaPro.lesson23_generics.task3;

import JavaPro.lesson2_NASLEDOVANIE.task1.Cat;

public class Main {
    public static void main(String[] args) {
        print(5.4);
        print("Hello");
        print(new Cat(3.5));

    }
    // задача метода вывести в консоль переданное значение (любого типа)

    public static <T>void print (T item){
        System.out.println(item);
    }
}
