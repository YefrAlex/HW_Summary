package JavaSummary._2023_09_08;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        //Дан список слов. Необходимо отфильтровать слова, состоящие только из букв, разделить их на гласные и согласные, и вывести результат.
        List<String> strings = List.of("Dell", "Apple", "Asus", "Acer", "Mob48");
        Map<String,Map<Boolean, List<String>>>map = strings.stream().
                filter(word -> word.chars()
                        .allMatch(Character::isLetter)).collect(Collectors.toMap(
                    word -> word,
                    word -> convertWord (word)
                ));

    }

    private static Map<Boolean, List<String>> convertWord(String word) {
        return Arrays.stream(word.split(""))
                .collect(Collectors.partitioningBy(Task1::isVowel,Collectors.toList()));

    }
    private static Boolean isVowel (String myChar){
        if ("aeiouy".contains(myChar.toLowerCase())) return true;
        return false;
    }

    public static void divideWords (List<String> strings){
           strings.stream().
                   filter(word -> word.chars().allMatch(Character::isLetter))                   // isLetter - проверяет по системе кодировке, является ли чар буквой

                   .collect(Collectors.partitioningBy(Task1::isVowel,Collectors.toList()));
    }


}
/*
public static Boolean isVowel (String myString) {
        if ("aeiouy".contains(myString.toLowerCase())) return true;
        return false;
    }

    public static Map<Boolean, List<String>> convertWordToMap (String word) {
        return Arrays.stream(word.split(""))
                .collect(Collectors.partitioningBy(
                        Task1::isVowel,
                        Collectors.toList()
                ));
    }

    public static Map<String, Map<Boolean, List<String>>> divideIntoVowelsAndConsonants (List<String> words) {
        System.out.println(words);
        List<String> shortList = words.stream()
                .filter(word -> word.chars().allMatch(Character::isLetter)).toList(); // isLetter - проверка на буквенность
        System.out.println(shortList);
        return shortList.stream()
                .collect(Collectors.toMap(
                        word -> word,
                        Task1::convertWordToMap
                ));
 */
