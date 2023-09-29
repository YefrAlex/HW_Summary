package JavaPractice.leson_06_09;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        System.out.println(file.isHidden());
        File file1 = new File("first/second/thrid/fourth/test1.txt");
        if (!file1.exists()){
            file1.createNewFile();
        }
        File parent = file1.getParentFile();
        System.out.println(parent.getAbsolutePath());
    }
}
