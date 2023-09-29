package JavaPro.lesson17_Lambda.task4;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        //1. Есть функция на вход которой подается строка
        // 2. Строку преобразуем в число
        // 3. Полученное число округляем
        // 4. Результат возводим в квадрат

        Function<String,Long> function = x -> {
            double result1 = Double.parseDouble(x);
            long result2 = Math.round(result1);
            long result3 = (long)Math.pow(result2,2);
            return result3;
        };
        System.out.println(function.apply("4.56"));

        Function<String,Long> function1 = x -> (long)Math.pow(Math.round(Double.parseDouble(x)),2);
        System.out.println(function1.apply("4.56"));

        Function<String,Double> funk1 = Double::parseDouble;
        Function<Double,Long> funk2 = Math::round;
        Function<Long,Long> funk3 = x ->(long)Math.pow(x,2);

        Function<String, Long>totalFunction = funk1.andThen(funk2).andThen(funk3);
        System.out.println(totalFunction.apply("4.56"));

        Function<String, Long>totalFunction2 =  funk2.andThen(funk3).compose(funk1);
        System.out.println(totalFunction2.apply("4.56"));
    }
}
