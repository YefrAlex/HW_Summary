package algoritms.lesson31082023_quiqsort;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,1};
        System.out.println(findDuplicates(array));
    }
    public static int findDuplicates(int[] arr){
        boolean[] booleans = new boolean[arr.length];
        for (int i=0; i < arr.length; i++) {
            if (booleans[arr[i] - 1] == true){
                return arr[i];}
            booleans[arr[i]-1] = true;

        }
        return -1;
    }

}
/*
public class Main {



    public static void main(String[] args) {
        int[] array = {1,2,3,4,1};
        System.out.println(findDuplicates(array));
    }
    public static int findDuplicates(int[] arr){
        boolean[] booleans = new boolean[arr.length];
        for (int value: arr) {
            if (booleans[value - 1]) return value;
            booleans[value - 1] = true;
        }
        return -1;
    }
}
 */
