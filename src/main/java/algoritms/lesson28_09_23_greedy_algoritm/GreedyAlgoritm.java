package algoritms.lesson28_09_23_greedy_algoritm;

public class GreedyAlgoritm {
    public static void main(String[] args) {
        int [] arr = {25,10,5,4};
        int num = 63;
        System.out.println(fimdMinCoinNumber(arr,num));
    }
    public static int fimdMinCoinNumber (int [] arr, int num ){
        int rem = num;
        int count = 0;
        for (int coin: arr){
            while (coin <= rem){
                System.out.println("остаток = " + rem + "  количество монет = " + count);
                rem = rem - coin;
                count++;
            }
        }
        if (rem == 0) return count;
        else
            System.out.println("не удалось подобрать нужной комбинации");
            return -1;
    }
}
