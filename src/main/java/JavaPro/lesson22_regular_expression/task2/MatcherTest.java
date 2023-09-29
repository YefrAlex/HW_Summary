package JavaPro.lesson22_regular_expression.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherTest {
    public static void main(String[] args) {
        String text = "Яблоко Ананас Привет Груша";
        String rexex = "Привет";

        Pattern pattern = Pattern.compile(rexex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Соответствует ли переданная строка шаблону " + matcher.matches());

        System.out.println("есть ли в текстк подстрока соответствующая шаблону? " + matcher.find());

        System.out.println("начало найденой подстроки " + matcher.start());

        System.out.println("конец найденой подстроки " + matcher.end());
    }
}
