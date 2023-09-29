package JavaPro.lesson6_List.task2;

import java.util.ArrayList;
import java.util.List;

public class ListIterationTest {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("Banana");
        words.add("Orange");
        words.add("Apple");
        words.add("Peach");
        words.add("Ananas");
        words.add("Pear");
        words.add("Watermelon");
        System.out.println(words);

        for (String current : words){
            System.out.println(current + "  " + current.length());
        }

        // Вывести в консоль все фрукты, при этом пронумеровать строки
        for (int i=0; i < words.size(); i++) {
            System.out.println((i + 1) + "..." + words.get(i));

        }
        // Размер листа
        System.out.println("Размер листа - " + words.size());

        String deleteElement = words.remove(3);
        System.out.println("Лист после удаления" + words);
        System.out.println("Удаленный элемент" + deleteElement);

        words.add(3,deleteElement); // вернули все обратно

        System.out.println("индекс ананаса " + words.indexOf("Ananas"));
        // индекс несуществующего элемента будет -1

        System.out.println("пустой ли лист  " + words.isEmpty());

        System.out.println("Содержит ли список апельсин  " + words.contains("Orange"));

        words.clear();
        System.out.println("Лист -- " + words);
        System.out.println("размер листа  " + words.size());
    }
}
