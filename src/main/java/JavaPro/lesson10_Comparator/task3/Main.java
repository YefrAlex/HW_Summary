package JavaPro.lesson10_Comparator.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(2);
        numbers.add(4);
        numbers.add(9);
        numbers.add(11);
        numbers.add(754);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

        List<String>words = new ArrayList<>();
        words.add("Watermelon");
        words.add("Apple");
        words.add("Pineapple");
        words.add("Cherry");
        words.add("Banana");

        System.out.println(words);

        Collections.sort(words);

        System.out.println(words);

    }

}
