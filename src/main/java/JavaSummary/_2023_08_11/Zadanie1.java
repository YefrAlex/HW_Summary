package JavaSummary._2023_08_11;

import java.util.ArrayList;
import java.util.List;

public class Zadanie1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        //Zadanie1 zadanie = new Zadanie1();
        // System.out.println(zadanie.getSum(list));
        // можно сразу указать новый объект класса
        System.out.println(new Zadanie1().getSum(list));

    }

    public int getSum(List<Integer> list) {
        int sum=0;
        for (int i=0; i < list.size(); i++) {
            sum=sum + list.get(i);
        }
        return sum;
    }
}
