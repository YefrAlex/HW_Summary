package JavaPro.lesson26_date.task1;

import java.util.Date;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        Date date = new Date();
        Thread.sleep(3000);
        Date date1 = new Date();
        Date date2 = new Date();

        System.out.println(date);
        System.out.println(date1);

        System.out.println("Вторая дата позже первой ? " + date1.after(date));
        System.out.println("Вторая дата ранее первой ? " + date1.before(date));

        System.out.println("сравнение двух дат " + date.compareTo(date1));
        System.out.println(date1.getTime());
        System.out.println(date2.getTime());
        System.out.println("эквивалентны ли две даты ?  " + date2.equals(date1));
    }
}
