package JavaPro.lesson22_regular_expression.task1;

import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String[] args) {
        //проверить содержит ли строка последовательность символов ---- www ?
        String source = "www.example.com";

        System.out.println(checkString(source));
    }

    public static boolean  checkString (String source){
        // пишем регулярное выражение
        String regex = ".*www.*";
        // компилируем регулярное выражение в объект шаблона
        Pattern pattern = Pattern.compile(regex);
        // проверяем соответствует ли переданная строка шаблону
        boolean result = pattern.matcher(source).matches();

        return result;
    }
}
