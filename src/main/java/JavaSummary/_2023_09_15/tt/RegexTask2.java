package JavaSummary._2023_09_15.tt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class RegexTask2 {
    public static void main(String[] args) {
        String text = "London is the capital of Great Britain, its political, economic and cultural centre. It's one of the largest cities in the world. " +
                "Its population is more than million people. London is situated on the river Thames. The city is very old and beautiful. " +
                "It was founded more than two thousand years ago. Traditionally London is divided into several parts: " +
                "the City, the West End, the East End and Westminster. The City is the oldest part of London, its financial and business centre." +
                " The heart of the City is the Stock Exchange. Westminster is the most important part of the capital. It's the administrative centre. ";
        System.out.println(typeWordsCaps(text));

        System.out.println(findDate("London is the capital 08/11/2023 of Great Britain, its political, 01/39/1939 economic and cultural centre."));
        System.out.println(findDomen("London is the capital  exe.com of Great Britain, its political, BiMba.de economic and cultural centre."));
        System.out.println(findFloat("London is the capital 23.11 of Great Britain, its political, 45.2 economic and cultural centre."));
        System.out.println(findFromVovelToNot("Apple, orange, and banana are fruits. Dog, cat, and bird are animals."));
    }
    public static  List<String> typeWordsCaps (String text ){
       String[] words=text.split(" ");
        String regex = "[A-Z][a-zA-Z]*";
       return Arrays.stream(words).filter(word->Pattern.matches(regex,word)).toList();
    }
     public static List<String> findDate (String text ){
         String[] words=text.split(" ");
         String regex = "[0-9]{2}[/][0-9]{2}[/][0-9]{4}";
         return Arrays.stream(words).filter(word-> Pattern.matches(regex,word)).toList();
     }

    public static List<String> findDomen (String text ){
        String[] words=text.split(" ");
        String regex = "\\w+[.][a-z]{2,4}";
        return Arrays.stream(words).filter(word-> Pattern.matches(regex,word)).toList();
    }
    /**
     * Найдите все вхождения чисел
     * с плавающей точкой (с десятичной точкой) в строке.
     */
    public static List<String> findFloat (String text ) {
        String[] words=text.split(" ");
        String regex="\\d+[.]\\d+";
        return Arrays.stream(words).filter(word -> Pattern.matches(regex, word)).toList();
    }
    /**
     * Найдите все слова, которые начинаются
     * с гласной буквы и заканчиваются согласной.
     String text = "Apple, orange, and banana are fruits. Dog, cat, and bird are animals.";
     */
    public static List<String> findFromVovelToNot (String text ) {
        String[] words=text.split("\\s+|\\p{Punct}");
        String regex="[eyuioaEYUIOA].*[^eyuioaEYUIOA]";
        return Arrays.stream(words).filter(word -> Pattern.matches(regex, word)).toList();
    }
    /**
     * Найдите все строковые литералы в коде Java,
     * заключенные в двойные кавычки, исключая символы экранирования.
     String code = "String message = \"Hello, world!\";\n" +
     "String path = \"C:\\\\Program Files\\\\Java\";";
     */
    public static List<String> findLiteral (String text ) {
        String[] words=text.split("\\s+|\\p{Punct}");
        String regex="\"\\\"([^\\\"\\\\\\\\]|\\\\\\\\.)*\\\"\"";
        return Arrays.stream(words).filter(word -> Pattern.matches(regex, word)).toList();
    }
}
/**
 * Найдите все слова, которые начинаются с заглавной буквы.
 */

/**
 * Найдите все даты в формате "DD/MM/YYYY" в строке.
 */

/**
 * Найдите все домены в строке. Домены имеют формат
 * "example.com" и могут быть встроены в текст в любом месте.
 */

/**
 * Найдите все вхождения чисел
 * с плавающей точкой (с десятичной точкой) в строке.
 */

/**
 * Разберитесь с
 * HTML-кодом и извлеките все ссылки (теги <a>) с их атрибутами href.
 */

/**
 * Найдите все
 * HTML теги в строке (например, "<div>", "<a href='...'>").
 */

/**
 * Найдите все строковые литералы в коде Java,
 * заключенные в двойные кавычки, исключая символы экранирования.
 String code = "String message = \"Hello, world!\";\n" +
 "String path = \"C:\\\\Program Files\\\\Java\";";
 */

/**
 * Найдите все слова, которые начинаются
 * с гласной буквы и заканчиваются согласной.
 String text = "Apple, orange, and banana are fruits. Dog, cat, and bird are animals.";
 */