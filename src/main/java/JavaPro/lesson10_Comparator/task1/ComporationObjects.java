package JavaPro.lesson10_Comparator.task1;

public class ComporationObjects {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Black", 5, 4.5);
        Cat cat2 = new Cat("Black", 5, 4.5);

        boolean result = cat1 == cat2;

        System.out.println("равны ли коты 1 и 2 ? ---" + result );

        Cat cat3 = cat2;
        result = cat2 == cat3;
        System.out.println("равны ли коты 3 и 2 ??-----" + result);

        result = cat1.equals(cat2); // правильный подход для сравнения НЕ ПРИМИТИВОВ но нужно его переопределить
        System.out.println("равны ли коты 1 и 2 ? методом equals  ---" + result );


    }
}
