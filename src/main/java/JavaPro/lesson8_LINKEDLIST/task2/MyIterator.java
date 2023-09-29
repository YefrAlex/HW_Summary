package JavaPro.lesson8_LINKEDLIST.task2;

import java.util.Iterator;

public class MyIterator implements Iterator {

    private Node current;

    public MyIterator(Node current) {
        this.current=current;
    }

    @Override
    public boolean hasNext() {

        return current !=null;
    }

    @Override
    public Object next() {
        String prev = current.getValue();
        current=current.getNext();
        return prev;

    }
}
