package JavaPro.lesson16_Lambda.task3;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
      //  Consumer<Integer> consumer =x -> System.out.println(x);
        Consumer<Integer> consumer = System.out::println;

        consumer.accept(5);
    }
}
