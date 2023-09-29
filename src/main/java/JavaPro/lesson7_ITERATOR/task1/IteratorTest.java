package JavaPro.lesson7_ITERATOR.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Orange");
        fruits.add("Banan");
        fruits.add("Mandarin");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Apricot");

        Iterator<String> iterator = fruits.iterator();

        // спрашиваем есть ли еще объекты в коллекции
        System.out.println("есть ли еще объекты в коллекции??? - " + iterator.hasNext());

        //получаем следующий элемент из коллекции
        System.out.println("следующий элемент " + iterator.next());

        // Получаем оставшиеся элементы коллекции при помощи цикла
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("+++++++++++++");
        for (int i=0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));

        }

    }
}
