package JavaSummary._2023_08_18;

public class Task4 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(findPower(a,b));
        System.out.println(findPowerRecursiv(a,b));
    }
    static int findPower (int a, int b){
        int power = 1;
        for (int i=0; i < b; i++) {
            power*=a;

        }
        return power;
    }
    static int findPowerRecursiv (int a, int b){
        if (b==1){
            return a;
        }
        return a*findPower(a, b-1);
    }
}
