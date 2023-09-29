package JavaPro.lesson7_ITERATOR.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Orange");
        list.add("Banan");
        list.add("Mandarin");
        list.add("Apple");
        list.add("Apricot");
        list.add("Pineapple");
        list.add("Apricot");
        /*for (int i=0; i < list.size(); i++) {
            String tmp = list.get(i);
            if (tmp.startsWith("A")){
                list.remove(tmp);
            }
            System.out.println(list);

         */
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().startsWith("A")) {
                iterator.remove();
            }
        }

        System.out.println(list);
        }
    }

