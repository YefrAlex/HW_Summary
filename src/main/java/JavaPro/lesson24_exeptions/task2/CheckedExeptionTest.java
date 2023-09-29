package JavaPro.lesson24_exeptions.task2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class CheckedExeptionTest {
    public static void main(String[] args) {
        try (InputStream in = new FileInputStream("test.txt")) {
            char symbol=(char) in.read();
            System.out.println("первый символ в файле - " + symbol);
            int x=10;
            int y=0;
            int result=x / y;
            System.out.println("результат деления - " + result);
        } catch (IOException | ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
