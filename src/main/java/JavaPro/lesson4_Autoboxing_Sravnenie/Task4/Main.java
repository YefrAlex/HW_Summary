package JavaPro.lesson4_Autoboxing_Sravnenie.Task4;

public class Main {
    public static void main(String[] args) {

        // аавтоупаковка, каждое число приводится к Integer
        Integer[] numbers = {3,4,5,6,7};
        // Автораспаковка  - распаковываем Integer в int
        int sum = getSumOfArray(numbers);
        System.out.println("Summa  " + sum);
    }



            public static  Integer getSumOfArray (Integer [] array){
        int sum = 0;
        for (Integer current : array) {
            //распаковка , current приводится к инту
            sum += current;
        }
                // автоупаковка - sum приводится к Integer
        return sum;
    }
}
