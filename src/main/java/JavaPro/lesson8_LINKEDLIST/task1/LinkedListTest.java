package JavaPro.lesson8_LINKEDLIST.task1;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String>list = new LinkedList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");

        list.remove(0);

        System.out.println(list.peekFirst());
        System.out.println(list.get(0));

        list.addFirst("Lemon");
        list.addLast("Potato");
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(2));

        list.set(1,"Peach");
        System.out.println(list);

        System.out.println("Есть ли в списке яблоко - "+ list.contains("Apple"));
        System.out.println("Есть ли в списке лимон - "+ list.contains("Lemon"));

        String deletetElement = list.poll();
        System.out.println(deletetElement);
        System.out.println(list);

        String deletetElementLast = list.pollLast();
        System.out.println(deletetElementLast);
        System.out.println(list);

        list.add("Banana");
        list.add("Apple");
        list.add("Peach");
        list.add("Cherry");
        list.add("Orange");
        list.add("Peach");

        System.out.println(list);

        list.removeFirstOccurrence("Peach");
        list.removeLastOccurrence("Peach");

        System.out.println(list);

    }
}
