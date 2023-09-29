package JavaPro.lesson22_regular_expression.task6;

import java.util.regex.Pattern;

public class RegExTest {
    public static void main(String[] args) {
        System.out.println(checkString("abcbcacab"));
        System.out.println(checkString(" "));

    }
    public static boolean checkString(String source){
        //String regex = "[ABC]+";
        String regex = "[A-Z]+";
        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        System.out.print("проверяемая строка - " + source + "   :   ");
        return pattern.matcher(source).matches();
    }
}
