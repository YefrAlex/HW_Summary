package JavaPro.lesson20_input_output.task5;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("testTest.txt");
        System.out.println("Существуте ли файл? - " + file.exists());
        file.createNewFile();
        System.out.println("Существуте ли файл? - " + file.exists());
        File dir = new File("first"); //нет расшмрения - значит будет папка
        dir.mkdir(); // создает папку

        File dir1 = new File("first/second/thrid/fourth");
        dir1.mkdirs(); // создает папки в иерархии

        System.out.println("'это файл ????" + file.isFile());
        System.out.println("это папка ????" + file.isDirectory());



    }
}
