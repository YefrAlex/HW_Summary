package JavaSummary._2023_08_18;

public class Fib {
    public static void main(String[] args) {
        int fibIndex = 9;
        System.out.println(findeFib(fibIndex));
       System.out.println(findFibRecurs(fibIndex));

    }



    static int findeFib(int fibIndex){
        int numberFib = 1;
        int fib1 = -1;
        int fib2 = 1;

        for (int i=0; i <= fibIndex ; i++) {

           numberFib = fib1 + fib2;
           fib1= fib2;
           fib2 = numberFib;

        }
        return numberFib;
    }
    static int findFibRecurs (int fibIndex){
        if (fibIndex == 1 || fibIndex == 0){
            return fibIndex;
        } else
        return findFibRecurs(fibIndex-1) + findFibRecurs(fibIndex-2);
    }
}
