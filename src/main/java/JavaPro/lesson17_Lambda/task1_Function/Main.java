package JavaPro.lesson17_Lambda.task1_Function;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        MyFunction function = new MyFunction();
        long result = function.apply(3.54);
        System.out.println("результат округления:  " + result);
        System.out.println("результат округления:  " + function.apply(5.12));
        // lambda
        Function<Double,Long> function1 = x -> Math.round(x);
        System.out.println(function1.apply(9.49));

        // method reference
        Function<Double,Long> function2 =Math::round;

        System.out.println(function2.apply(12.63));

    }
}
