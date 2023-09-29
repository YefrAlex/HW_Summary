package JavaPro.lesson22_regular_expression.task5;

import java.util.Arrays;

public class DelimiterTest {
    public static void main(String[] args) {
        String tetx = "Hello World I study Java";
        String[] words = tetx.split(" ");
        System.out.println(Arrays.toString(words));

    }
}
