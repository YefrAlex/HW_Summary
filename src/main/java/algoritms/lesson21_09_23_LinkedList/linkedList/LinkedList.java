package algoritms.lesson21_09_23_LinkedList.linkedList;

public class LinkedList {
    int value;
    LinkedList next;

    public LinkedList(int value){
        this.value = value;
        this.next = null;
    }

    public void add(int value){
        LinkedList current = this;
        while (current.next !=null){
            current = current.next;
        }
        current.next = new LinkedList(value);
    }
    public void insert(int value, int index){
        if (index <= 0 || index > this.count()) throw new Error("Wrong index");
        LinkedList current = this;
        for (int i=0;i<index-1;i++){
            current = current.next;
        }
        LinkedList node = new LinkedList(value);
        node.next = current.next;
        current.next = node;
    }
    public void insertByValue(int value, int valueList) {
        if (!this.getValue(valueList)) throw new Error("Wrong value");
        LinkedList current = this;
        while (current.value != valueList) {
            current = current.next;
        }
        LinkedList node = new LinkedList(value);
        node.next = current.next;
        current.next = node;
    }
    public int count (){

        int count = 0;
        LinkedList current = this;
        if (current.value != -1){
            count = 1;
        }
        while (current.next !=null){
            current = current.next;
            count++;
        }
        return count;
    }
    public boolean getValue(int value){
        LinkedList current = this;
        while (current != null){
            if (current.value == value){
                return true;
            } else
            current=current.next;
        }
        return false;
    }
    public void addFirst(int value) {
        LinkedList node = new LinkedList(value);
        node.next = this.next;
        this.next = node;
        int temp = this.value;
        this.value = value;
        this.next.value = temp;
    }
    public void removeLast() {
        if (this.count() == 1) throw new Error("We have only one wagon");
        LinkedList current = this;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }
    public void removeAfter(int index) {
        if (index > this.count() || index <= 0) throw new Error("Wrong index");
        LinkedList current = this;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        current.next = null;
    }
    public void removeByIndex(int index) {
        if (this.count() == 1) throw new Error("We have only one wagon");
        if (index <= 0 || index > this.count()) throw new Error("Wrong index");
        LinkedList current = this;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
    }
    public void removeByValue(int value) {
        if (!this.getValue(value) || this.value == value)
            throw new Error("Wrong value");
        LinkedList current = this;
        while (current.next.value != value) {
            current = current.next;
        }
        current.next = current.next.next;
    }

}

