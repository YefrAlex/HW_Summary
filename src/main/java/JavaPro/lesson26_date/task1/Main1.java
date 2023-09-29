package JavaPro.lesson26_date.task1;

import java.util.Date;

public class Main1 {
    public static void main(String[] args) {
        Date date = new Date();
        Date date1 = new Date(date.getTime()+500);
        System.out.println(date.getTime());
        System.out.println(date1.getTime());

        date1.setTime(1695811144150L);
        System.out.println(date1);
    }
}
