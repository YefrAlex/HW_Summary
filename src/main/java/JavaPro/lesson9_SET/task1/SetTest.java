package JavaPro.lesson9_SET.task1;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetTest {
    public static void main(String[] args) {
        SortedSet<String> set=new TreeSet<>(); // отсортирует
        set.add("XXX");
        set.add("AAA");
        set.add("DDD");
        set.add("FFF");
        set.add("LLL");
        set.add("CCC");
        set.add("BBB");
        set.add("XXX"); // не добавит дубликаты
        set.add("AAA"); // не добавит дубликаты
        set.add("DDD"); // не добавит дубликаты
        set.add("OOO");
        set.add("BBBBB");

       // set.add(null);  нельзя добавить null в TreeSet

        System.out.println(set);
        boolean result = set.add("EEE");
        if (result){
            System.out.println("Элемент был добавлен");
        } else {
            System.out.println("Элемент НЕ был добавлен");
        }
        System.out.println(set);

        result = set.add("BBB");
        System.out.println("Был ли добавлен элемент --" + result);
        System.out.println(set);
        for (String current : set){
            System.out.println(current);
        }
        result = set.contains("CCC");
        System.out.println("Содержит ли сет ССС --- " + result) ;
        result = set.contains("ZZZ");
        System.out.println("Содержит ли сет ZZZ --- " + result) ;

        // Методы first и last  возвращают первый и последний элемент

        System.out.println("первый элемент -- " + set.first());
        System.out.println("последний элемент -- " + set.last());

        Iterator<String> iterator = set.iterator();

        System.out.println("итерируем SET при помощи итератора");

        while (iterator.hasNext()){
            String current = iterator.next();
            if (current.length() == 5){
                iterator.remove();
            }
            System.out.println(current);
        }
        System.out.println(set);
        result = set.remove("EEE");
        System.out.println(" Был ли удален EEE " + result);
        System.out.println(set);

        Set<Integer> set1 = new ConcurrentSkipListSet<>();
        set1.add(1);
        set1.add(3);
        set1.add(45);
        set1.add(13);
        set1.add(3);

        for (Integer current : set1){
            System.out.println(current);
        }




    }
}