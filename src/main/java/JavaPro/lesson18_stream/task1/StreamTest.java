package JavaPro.lesson18_stream.task1;

import java.util.Arrays;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {

        List<Integer> numbers =Arrays.asList(6,3,8,9,0,5,2,4);
        int sum = 0;
        for(Integer currentNumber : numbers){
            if (currentNumber%2 != 0){
                sum+=currentNumber;
            }
        }
        System.out.println("результат при помощи цикла = " + sum);

        int sum2 = numbers.stream().filter(x -> x%2 !=0).reduce((x,y) -> x+y).orElse(-1);
        System.out.println("результат стрима - " + sum2);

        // при помощи стрима и метод-референс, вместо лямбда выражения
        int sum3 = numbers.stream().filter(x -> x%2 !=0).reduce(Integer::sum).orElse(-1);
        System.out.println("результат стрима и метод-референс - " + sum3);



    }
}
