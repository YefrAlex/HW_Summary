package JavaPro.lesson8_LINKEDLIST.task2;

import java.util.Iterator;
import java.util.function.Consumer;

public class MyLinkedList implements Iterable<String> {
    private int size = 0;
    private Node first;

    /**
     * Добавляет элемент в начало списка
     * @param value
     */
    public void addFirst(String value){
       Node node = new Node(value, first);
       first = node;
       size++;

    }
    /**
     * Добавляет элемент в конец списка
     * @param value
     */
    public void addLast(String value){
        if (size == 0){
            addFirst(value);
            return;
        }
        Node current = first;
        while (current.getNext() != null){
            current=current.getNext();
            size++;
        }
        Node last = new Node(value);
        current.setNext(last);
    }

    @Override
    public String toString() {
        if (size==0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        Node current = first;
        while (current != null){
            sb.append(current.getValue()).append(", ");
            current = current.getNext();

        }
        sb.setLength(sb.length()-2);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public Iterator iterator() {
        return  new MyIterator(first);
    }

}
