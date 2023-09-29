package JavaPro.lesson6_List.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> first = new ArrayList<>();
        List<String> second = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();
        List<String> list5 = new ArrayList<>();


        first.add("A");
        first.add("B");
        first.add("C");
        first.add("D");
        first.add("E");

        second.add("D");
        second.add("E");
        second.add("F");
        second.add("G");

        System.out.println(first);
        System.out.println(second);
        System.out.println("++++++++++++++++++++");

        // 1. Объединение - A B C D E D E F G
        // 2. Объединение без дубликатов - A B C D E F G
        // 3. Пересечение - D E D E
        // 4. Пересечение без дубликатов - D E
        // 5. Разность - A B C F G

        list1.addAll(first);
        list1.addAll(second);
        System.out.println("Объединение - A B C D E D E F G" + list1);
        System.out.println("++++++++++++++++++++");

        list2.addAll(first);
        for (int i=0; i < second.size() ; i++) {
            if (!list2.contains(second.get(i))){
                list2.add(second.get(i));
            }
        }
        System.out.println("Объединение без дубликатов - A B C D E F G" + list2);
        System.out.println("++++++++++++++++++++");

        list3.addAll(list1);
        for (int i=list3.size() - 1; i > -1 ; i--) {

            if ((!first.contains(list3.get(i)) && second.contains(list3.get(i))) || (first.contains(list3.get(i)) && !second.contains(list3.get(i)))){
                list3.remove(list3.get(i));

            }
        }
        System.out.println("3. Пересечение - D E D E" + list3);
        System.out.println("++++++++++++++++++++");

        for (int i=0; i < second.size() ; i++) {
            if (first.contains(second.get(i))){
                list4.add(second.get(i));
            }
        }
        System.out.println("4. Пересечение без дубликатов - D E" + list4);
        System.out.println("++++++++++++++++++++");

        for (int i=0; i < list1.size() ; i++) {
            if (first.contains(list1.get(i)) && second.contains(list1.get(i))){
                list1.remove(list1.get(i));
                i--;
            }
        }

        System.out.println("5. Разность - A B C F G " + list1);
        System.out.println("++++++++++++++++++++");
    }
}
