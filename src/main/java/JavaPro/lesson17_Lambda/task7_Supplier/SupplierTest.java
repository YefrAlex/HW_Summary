package JavaPro.lesson17_Lambda.task7_Supplier;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 7;
        print(supplier);

        Supplier<Integer> supplier1 = () -> (int)(Math.random()*16+5);
        print(supplier1);

        }
    // написать метод, который в качистве параметра принимает суплаер и 10 раз выводт в консоль его значение
        public static void print(Supplier<Integer>supplier){
            for (int i=0; i < 10; i++) {
                System.out.print(supplier.get() + " ");

            }
            System.out.println();
        }
}
