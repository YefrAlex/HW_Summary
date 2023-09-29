package JavaPro.lesson19_stream2.task5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] words = {{"Hello","World","Java"},
                {"Java","Python","C#","C++"},
                {"Hallo","Java"}};

        int count =(int)Arrays.stream(words).flatMap(x-> Arrays.stream(x)).count();

        System.out.println("количество слов " + count);

        int countUniq =(int)Arrays.stream(words).flatMap(x-> Arrays.stream(x)).distinct().count();

        System.out.println("количество уникальных слов " +countUniq);

    }
}
