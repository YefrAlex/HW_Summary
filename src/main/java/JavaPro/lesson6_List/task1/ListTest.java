package JavaPro.lesson6_List.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        System.out.println("Лист - "+ list);

        list.add("AAA");
        list.add("BBB");
        list.add("CCC");

        System.out.println("Лист - " + list);

        list.add(1,"DDD");
        System.out.println("Лист - " + list);

        List<String > words = new ArrayList<>(3);
        words.add("XXX");
        words.add("YYY");
        words.add("ZZZ");

        list.addAll(words);

        System.out.println("Лист - " + list);
        list.addAll(2,words);
        System.out.println("Лист - " + list);

        String[] strings = {"K", "L", "M"};
        // Добавляем все элементы массива в лист при помощи статического метода asList
        list.addAll(Arrays.asList(strings));
        System.out.println("Лист - " + list);

        // Заменяем уже существующий элемент другим элементом
        list.set(3, "-Y-");
        System.out.println("Лист - " + list);

        // Удаление элементов
           list.remove(5);
        System.out.println("Лист - " + list);

        list.remove("XXX");
        System.out.println("Лист - " + list);

        // Удаление всех элементов K и L из листа
        list.removeAll(List.of("K", "L"));
        System.out.println("Лист - " + list);

        // Разница между методами set и add
        list.set(1, "OOO");
        System.out.println("После метода set:");
        System.out.println("Лист - " + list);
        list.add(1, "OOO");
        System.out.println("После метода add:");
        System.out.println("Лист - " + list);
    }


}
