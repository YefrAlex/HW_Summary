package JavaPro.lesson7_ITERATOR.task6;

import com.sun.source.tree.LiteralTree;

import java.util.Iterator;
import java.util.List;

public class MyIterator implements Iterator {
    private Iterator<Integer> iterator;
    Integer next;

    public MyIterator(List<Integer> list) {
        iterator=list.iterator();
        moveToNext();
    }

    private void moveToNext() {
        while (iterator.hasNext()) {
            Integer current=iterator.next();
            if (current % 2 == 0) {
                next=current;
                return;
            }
        }
        next=null;
    }


    @Override
    public boolean hasNext() {
        if (next != null) {
            return true;
        } else
            return false;
    }

    @Override
    public Integer next() {
        Integer currentNext = next;
        moveToNext();
        return currentNext;
    }
}
