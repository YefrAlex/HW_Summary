package JavaPro.lesson22_regular_expression.task4;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CompailFlagTest {
    public static void main(String[] args) {
        String text = "Apple Banana, Orange";

        String regex = "a";
        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println("индекс вхождения буквы a  - " + matcher.start());
        }

    }
}
