package algoritms.lesson14_09_23;

public class Task {
    public static void main(String[] args) {
        int[] arr={1, 6, 3, 3,-5, -1, 4};
        int n=8;
        System.out.println(isExists(arr, n));
    }

    public static boolean isExists(int[] arr, int n) {
        int sum=arr[0] + arr[1];
        for (int i=0, j=i+1; i < arr.length - 2; ) {
            if (arr[i] == n || arr[j] == n) {
                return true;
            }
            if (sum == n){
                return true;
            }
            if (j==arr.length-1){
                i++;
                j=i+1;
                sum = arr[i] + arr[j];
            }
            else  {j++;
                sum=sum+ arr[j];
            }
        }
        return false;
    }
}
/*
class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1, 2, 4, 5, 6};
        System.out.println(subArray(array));
    }
    public static boolean subArray(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        int sum = 0;
        for (int x:arr) {
            sum += x;
            if (set.contains(sum)) return true;
            set.add(sum);
        }
        return false;
    }


}
 */