package JavaPro.lesson17_Lambda.task9;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    // // Используя функциональный интерфейс, написать функцию,
    //        // которая проверяет, имеет ли входящая строка чётную длину.
    public static void main(String[] args) {
        String str = "1234";
        Predicate <String> predicate = x-> x.length()%2==0;
        System.out.println(predicate.test(str));

    }
}
