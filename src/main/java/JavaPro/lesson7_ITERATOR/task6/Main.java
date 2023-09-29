package JavaPro.lesson7_ITERATOR.task6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        //  Iterator<Integer> iterator = numbers.iterator();
        MyIterator iterator = new MyIterator(numbers);
        while (iterator.hasNext()){
            System.out.println(iterator.next());

            }
        }
}
/*
public class MyIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    Integer next;

    public MyIterator(List<Integer> list) {
        iterator = list.iterator();
        moveToNext();
    }

    private void moveToNext() {
        while (iterator.hasNext()) {
            Integer current = iterator.next();
            if (current % 2 == 0) {
                next = current;
                return;
            }
        }
        next = null;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public Integer next() {
        Integer currentNext = next;
        moveToNext();
        return currentNext;
    }
}
 */