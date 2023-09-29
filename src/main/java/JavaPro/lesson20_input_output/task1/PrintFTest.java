package JavaPro.lesson20_input_output.task1;

import java.util.Date;

public class PrintFTest {
    public static void main(String[] args) {
        System.out.print("Eins");
        System.out.print("Zwei");
        System.out.print("Drei");

        // \n переносит курсор на новую строку
        // \\n первы слеш экранирует перенос строки и просто выводит в консоле " \n"
        System.out.println("Служебные символы %n и \\n переносят информацию на новую строку");
        System.out.printf("one%ntwo\nthree");
        System.out.println();

        System.out.printf("подставляем в строки целочисленные переменные");
        int a=5;
        int b=9;
        System.out.printf("Сумма чисел %d и %d равна %d %n", a, b, a + b);
        System.out.println("подставляем строки в строку");
        String hello="Всем привет";
        System.out.printf("Значение переданной строки %s%n", hello);
        System.out.printf("Значение переданной строки %.3s%n", hello);// .3 обрезало строку
        System.out.printf("Значение переданной строки %.3S%n", hello); // большая S делает апперкейс

        System.out.println("подставляем дробные числа в строку");
        double pi=Math.PI;
        System.out.printf("число Пи равно - %f.%n", pi); // по умолчанию вывордит 6 знаков после запятой
        System.out.printf("число Пи равно - %.3f.%n", pi);

        System.out.println("вставляем в строки boolean");
        boolean bool=true;
        System.out.printf("Значение boolean переменной - %b.%n", bool);
        System.out.printf("Значение boolean переменной - %B.%n", bool); // большая В выведет значение в верхнем регистре
        System.out.printf("равны ли a и b  - %B.%n", a == b);

        System.out.println("Вставляем символы");
        char ch='r';
        System.out.printf("выводим сивол %c%n", ch);
        System.out.printf("выводим сивол %C%n", ch);
        System.out.println();
        System.out.printf("Выводим дату %n");
        Date date=new Date();
        System.out.println(date);
        System.out.printf("Значение даты  %tT.%n", date);
        //часы 10, минуты 41, секунды 55
        System.out.printf("часы %tH, минуты %tM, секунды %tS.%n", date, date, date);
        System.out.printf("%1$tA %1$td %1$tB %1$tY%n",date);


    }
}
