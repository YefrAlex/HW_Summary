package algoritms.lesson28_09_23_greedy_algoritm;

import java.util.Arrays;

public class MainGreedy {
    public static void main(String[] args) {
        int [] arr = {25,10,5,4};
        int num = 63;
        System.out.println(Arrays.toString(minCoins(arr,num)));
    }
    public static int[] minCoins(int[] arr, int num) {
        int[] dp = new int[num + 1];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int coin : arr) {
            for (int i = coin; i < dp.length; i++) {
                if (dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp;
    }
}
// TODO: 28.09.2023 разобратся с кодом и сделать наверное мапу, для каждого значения 
//class Main {
//    public static void main(String[] args) {
//        int[] array = {25, 10, 5, 4};
//        int number = 63;
//        Result result = minCoins(array, number);
//        System.out.println(result.minCoins);
//        System.out.println(result.coinsUsed);
//    }
//
//    static class Result {
//        int minCoins;
//        List<Integer> coinsUsed;
//
//        Result(int minCoins, List<Integer> coinsUsed) {
//            this.minCoins = minCoins;
//            this.coinsUsed = coinsUsed;
//        }
//    }
//
//    public static Result minCoins(int[] arr, int num) {
//        int[] dp = new int[num + 1];
//
//        for (int i = 1; i < dp.length; i++) {
//            dp[i] = Integer.MAX_VALUE;
//        }
//
//        List<Integer>[] coinCombination = new List[num + 1];
//        for (int i = 0; i <= num; i++) {
//            coinCombination[i] = new ArrayList<>();
//        }
//
//        for (int coin : arr) {
//            for (int i = coin; i <= num; i++) {
//                if (dp[i - coin] != Integer.MAX_VALUE && dp[i - coin] + 1 < dp[i]) {
//                    dp[i] = dp[i - coin] + 1;
//                    coinCombination[i] = new ArrayList<>(coinCombination[i - coin]);
//                    coinCombination[i].add(coin);
//                }
//            }
//        }
//
//        return new Result(dp[num], coinCombination[num]);
//    }
//}
