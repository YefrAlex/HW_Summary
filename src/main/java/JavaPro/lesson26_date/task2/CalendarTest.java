package JavaPro.lesson26_date.task2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {
    public static void main(String[] args) {
     //   Calendar calendar = new GregorianCalendar();
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH)+1);
        System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));

        calendar.set(Calendar.MONTH,Calendar.APRIL);
        System.out.println(calendar.get(Calendar.MONTH));

        calendar.add(Calendar.YEAR,10);
        System.out.println(calendar.get(Calendar.YEAR));

        // 27/09/2023

        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        String formatedDate =  formater.format(calendar.getTime());
        System.out.println(formatedDate);

        // 2023-09-27 10:24

        formater = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        System.out.println(formater.format(calendar.getTime()));
    }
}
