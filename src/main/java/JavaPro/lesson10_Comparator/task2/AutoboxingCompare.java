package JavaPro.lesson10_Comparator.task2;

public class AutoboxingCompare {
    public static void main(String[] args) {
        int x=5;
        int y=5;
        boolean result=x == y;
        System.out.println("результат сравнения примитивов -- " + result);
        Integer integer1=new Integer(5);
        result=x == integer1;
        System.out.println("результат сравнения примитива и обертки -- " + result);
        Integer integer2=new Integer(5);
        result=integer2 == integer1;
        System.out.println("результат сравнения обертки и обертки (сравниваются ссылки НЕТ АВТОПРИВЕДЕНИЯ В ПРИМИТИВЫ) -- " + result);


    }
}
