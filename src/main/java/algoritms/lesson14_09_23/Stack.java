package algoritms.lesson14_09_23;

import java.util.ArrayList;

public class Stack {
    ArrayList<Integer> items;
    public Stack(){
        this.items = new ArrayList<>();
    }
    public int push(int element){
        items.add(element);
        return element;
    }
    public int pop() {
        if (items.size() >= 1) {
            int index=items.get(items.size() - 1);
            items.remove(items.size() - 1);
            return index;
        } else {
            System.out.println("нет элементов");
            return -1;
        }
    }
    public int min( ) {
        if (items.size() == 0) {
            System.out.println("нет элементов");
            return -1;
        }
        int min=items.get(0);
        for (int i=1; i < items.size(); i++) {
            if (items.get(i) < min) {
                min=items.get(i);
            }
        }
        return min;
    }
    public int max( ) {
        if (items.size() == 0) {
            System.out.println("нет элементов");
            return -1;
        }
        int max=items.get(0);
        for (int i=1; i < items.size(); i++) {
            if (items.get(i) > max) {
                max=items.get(i);
            }
        }
        return max;
    }
    public void clear(){
        items = new ArrayList<>();
    }
    public int getLength(){
        return items.size();
    }
    public int peek(){
        if (items.size() == 0) {
            System.out.println("The stack is empty");
            return -1;
        }
        return items.get(items.size()-1);
    }
    public void increment(){
        for (int i=0;i<items.size();i++){
            items.set(i,items.get(i)+1);
        }
    }


}
