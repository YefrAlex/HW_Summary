package JavaPro.lesson4_Autoboxing_Sravnenie.task5;

import JavaPro.lesson4_Autoboxing_Sravnenie.task1.Cat;

public class ComparingTest {
    public static void main(String[] args) {
        int x = 7;
        int y = 7;

        boolean compare = x == y;
        System.out.println("Сравнение x и y   " + compare);

        Cat cat1 = new Cat(3, "Black");
        Cat cat2 = new Cat(3,"Black");

        compare = cat1 == cat2;

        System.out.println("сравнение двух котов   " + compare );

        Integer integerX = 7;
        boolean compare1 = x == integerX;
        // будет тру из за автораспаковки и приведению Integer к примитуву int
        System.out.println("Сравнение x и integerX  " + compare1);

        Integer integerY = new Integer( 7);
        boolean compare2 = x == integerX;
        // будет фолс т к сравнивают две ссылки
        System.out.println("Сравнение x и integerX  " + compare2);
        // Integer integerY = new Integer( 7);
        //Integer integerX = new Integer( 7);
        // такое сравнение даст фолс т к ключевое слово new ПРИНУДИТЕЛЬНО СОЗДАЕТ НОВЫЙ ОБЪЕКТ


        compare = cat1.equals(cat2);
        System.out.println("сравнение через иквелс " + compare);
        // метод унаследован от OBJECTS и сравнивает опять ссылки поэтому фальш
        // после переопределения --equals-- в классе Cat  мы получим тру



    }
}
