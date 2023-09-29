package algoritms.lesson0709202_binarySerch;
import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binary(array,10));

    }


    public static int binary(int[] arr, int num) {
        int low=0;
        int high=arr.length - 1;
        while (high >= low) {
            int mid=(low + high) / 2;
            if (num == arr[mid]) return mid;
            else if (num > arr[mid]) low=mid + 1;
            else high=mid - 1;
        }
        return -1;

    }
}

