package algoritms.lesson21_09_23_LinkedList.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list=new LinkedList(1);
        list.add(2);
        list.add(3);
        System.out.println(list.next.next);

        list.insert(10, 2);
        list.insert(11, 3);
        System.out.println(list.getValue(15));
        System.out.println(list.count());
        list.removeByIndex(2);
        System.out.println(list.count());
    }
}

