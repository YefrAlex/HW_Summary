package JavaPro.lesson7_ITERATOR.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Banan");
        fruits.add("Mandarin");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Apricot");
        fruits.add("Cherry");
        fruits.add("Pear");
        fruits.add("Apricot");

        // Пройти по списку фруктов, и если встречается фрукт на букву P,
        // то удалить фрукты перед ним на букву А

        System.out.println("До удаления");
        System.out.println(fruits);

        ListIterator<String> listIterator=fruits.listIterator();
        while (listIterator.hasNext()) {
            String tmp=listIterator.next();
            if (tmp.startsWith("P")) {
                break;
            }
        }
        while (listIterator.hasPrevious()) {
            if (listIterator.previous().startsWith("A")) {
                listIterator.remove();
            }
        }

        System.out.println("После удаления");
        System.out.println(fruits);
    }
}
