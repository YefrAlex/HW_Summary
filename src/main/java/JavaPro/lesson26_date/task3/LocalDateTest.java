package JavaPro.lesson26_date.task3;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDate date1 = LocalDate.of(2020, Month.JANUARY,15);
        System.out.println(date1);

        System.out.println(date.getYear());
        System.out.println(date.getMonthValue());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());

          date1 = date1.plusYears(5);
        System.out.println(date1);

        date1 = date1.plusYears(3).minusDays(3).plusWeeks(1);
        System.out.println(date1);
    }


}
