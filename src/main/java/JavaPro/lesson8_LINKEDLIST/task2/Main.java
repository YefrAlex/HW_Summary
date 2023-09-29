package JavaPro.lesson8_LINKEDLIST.task2;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addLast("UUU");
        list.addFirst("Orange");

        list.addFirst("Banana");
        list.addFirst("Apple");

        System.out.println(list);

        list.addLast("ZZZ");
        list.addLast("OOO");

        System.out.println(list);
        System.out.println("цикл фор ич");
        for (String cur : list){
            System.out.println(cur);
        }
    }
}
