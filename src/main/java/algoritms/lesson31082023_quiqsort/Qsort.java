package algoritms.lesson31082023_quiqsort;

import java.util.Arrays;


class Qsort {
    public static void main(String[] args) {
        int[] numbers=new int[20];
        for (int i=0; i < numbers.length; i++) {
            numbers[i]=(int) (Math.random() * 100);
        }
        System.out.println("исходный массив -- " + Arrays.toString(numbers));
        quickSort(numbers, 0, numbers.length - 1);
        System.out.println("получилось -- " + Arrays.toString(numbers));

    }

    private static void quickSort(int[] numbers, int leftPoint, int rightPoint) {
        if (leftPoint >= rightPoint) {
            return;
        }
        int pivot=partition(numbers, leftPoint, rightPoint);
        quickSort(numbers, leftPoint, pivot - 1);
        quickSort(numbers, pivot + 1, rightPoint);
    }

    private static int partition(int[] numbers, int leftPoint, int rightPoint) {
        int pivot=numbers[rightPoint];
        int pointer=leftPoint - 1;
        int tmp;
        for (int i=leftPoint; i < rightPoint; i++) {
            if (numbers[i] < pivot) {
                pointer++;
                tmp=numbers[pointer];
                numbers[pointer]=numbers[i];
                numbers[i]=tmp;
            }

        }
        tmp=numbers[pointer + 1];
        numbers[pointer + 1]=numbers[rightPoint];
        numbers[rightPoint]=tmp;
        return pointer + 1;

    }
}
/*
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array= new ArrayList<>();
        array.add(5);
        array.add(1);
        array.add(6);
        array.add(8);
        array.add(9);
        array.add(3);
        array.add(7);
        array.add(4);
        System.out.println(quickSort(array));

    }

    public static ArrayList<Integer> quickSort(ArrayList<Integer> arr) {
        if (arr.size()<=1) return arr;
        int pivot = arr.get(arr.size()-1);
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        for (int i=0;i<arr.size()-1;i++){
            if (arr.get(i)<pivot) left.add(arr.get(i));
            else right.add(arr.get(i));
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(quickSort(left));
        result.add(pivot);
        result.addAll(quickSort(right));
        return result;
    }


}
 */