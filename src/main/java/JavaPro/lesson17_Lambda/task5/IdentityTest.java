package JavaPro.lesson17_Lambda.task5;

import java.util.function.Function;

public class IdentityTest {
    public static void main(String[] args) {
        Function<String,String> function = x -> x;
        System.out.println(function.apply("Hello"));
        Function<String,String>function1 = Function.identity();
        System.out.println(function1.apply("Hello"));
    }
}
