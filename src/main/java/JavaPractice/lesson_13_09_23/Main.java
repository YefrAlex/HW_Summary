package JavaPractice.lesson_13_09_23;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String phone1 = "+123456789";
        String phone2 = "+123 456789";
        String phone3 = "+123-456789";
        String phone4 = "+123-456789";

        String regex = "[(]?[+]\\d{3}[)]?[\\s]?[-]?\\d{6}";

        System.out.println(phone2.matches(regex));
        //Pattern pattern = Pattern.compile(regex);




    }

}
