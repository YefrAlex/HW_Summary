package JavaSummary._2023_09_01;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("elbow", "below");

        boolean isAnagram = words.stream()
                .map(Main::sortString) // сортируем символы в каждом слове
                .distinct() // оставляем только уникальные слова (анаграммы должны быть одинаковыми после сортировки)
                .count() == 1; // считаем количество оставшихся слов после применения distinct

        if (isAnagram) {
            System.out.println("Слова являются анаграммами");
        } else {
            System.out.println("Слова не являются анаграммами");
        }
    }

    private static String sortString(String word) {
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}

