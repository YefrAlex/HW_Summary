package algoritms.lesson24082023;

import java.util.Arrays;

public class HomeWork_24_08_23 {
    public static void main(String[] args) {
        int[] numbers = new int [20];
        for (int i=0; i < numbers.length; i++) {
            numbers[i]=(int)(Math.random()*1000);
        }
        System.out.println("исходный массив -- " + Arrays.toString(numbers));
        mergeSort(numbers);
        System.out.println("отсортированый массив -- " + Arrays.toString(numbers));
    }
    private static void mergeSort (int[] numbers){
        int inputLength =numbers.length;
        if (inputLength < 2){
            return;
        }
        int midIndex = inputLength/2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength-midIndex];
        for (int i=0; i < midIndex; i++) {
            leftHalf[i] = numbers[i];
        }
        for (int i=midIndex; i < inputLength; i++) {
            rightHalf[i-midIndex]=numbers[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(numbers,leftHalf,rightHalf);
    }

    private static void merge(int[] numbers, int[] leftHalf, int[] rightHalf) {
        for (int i=0, j=0, l=0; i < numbers.length ; i++) {
            if (leftHalf[j]<=rightHalf[l]){
                numbers[i]=leftHalf[j];
                if (j==leftHalf.length-1){
                    leftHalf[j] = Integer.MAX_VALUE;
                } else {
                    j++;}
            } else {
                numbers[i]=rightHalf[l];
                if (l==rightHalf.length-1){
                    rightHalf[l] = Integer.MAX_VALUE;
                } else {
                    l++;}
            }

        }
    }

}
