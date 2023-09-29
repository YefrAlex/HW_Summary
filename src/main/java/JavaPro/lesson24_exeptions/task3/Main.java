package JavaPro.lesson24_exeptions.task3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
            first();

    }
    public static void first(){
        second();
    }
    public static void second()  {
        try {
            third();
        } catch (FileNotFoundException e){
            System.out.println("ошибка найдена во обработана мотоде");
        }
    }
    public static void third() throws FileNotFoundException{
        forth();

    }
    public static void forth() throws FileNotFoundException {
        InputStream in = new FileInputStream("test48.txt");
    }
}
