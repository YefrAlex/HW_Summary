package algoritms.lesson0709202_binarySerch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,9,1,2};
        int num = 11;
        System.out.println(findPair(arr, num));
    }

    private static List<List<Integer>> findPair(int[] arr, int num) {
        List<List<Integer>> pairList = new ArrayList<>();
        List<Integer>list = new ArrayList<>();
        int x;
        for (int k=0,i=0, j=i+1; i < arr.length-1; ) {
            x=num-arr[i];
            if (j== arr.length){
                i++;
                j=i+1;
            } else
            if (arr[j]==x){
                list.add(arr[i]);
                list.add(arr[j]);
                i++;
                j=i+1;
                pairList.add(k,list);
                list = new ArrayList<>();
                k++;
            }

            else {
                j++;
            }
        }
        return pairList;
    }
}
