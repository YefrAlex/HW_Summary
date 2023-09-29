package JavaPro.lesson11_STAK_i_QUEUE.task4;

public class MyArrayDeque implements MyDeque{

    private Integer [] elements;
    private int headIndex;
    private int tailIndex;
    private int size;
    private int defaultCapacity = 20;

    public MyArrayDeque (){
        elements = new Integer[defaultCapacity];
        headIndex = elements.length /2;
        tailIndex = headIndex;

    }

    @Override
    public void addToHead(Integer element) {


    }

    @Override
    public void addToTail(Integer element) {

    }

    @Override
    public Integer removeHead() {
        return null;
    }

    @Override
    public Integer removeTail() {
        return null;
    }

    @Override
    public Integer peekHead() {
        return null;
    }

    @Override
    public Integer peekTail() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Integer getByIndex(int index) {
        return null;
    }

    @Override
    public boolean contains(Integer element) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");

        for (int i=headIndex; i <= tailIndex; i++) {
            builder.append(elements[i]).append(", ");
        }
        builder.setLength(builder.length() - 2);
        builder.append("]");
        return builder.toString();
    }
}
