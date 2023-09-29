package JavaPro.lesson5_Massivs.task2;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        double[] doubles={2.3, 7.1, 8.12, 0, 4.35};
        System.out.println(Arrays.toString(doubles));

        for (int i=0; i < doubles.length; i++) {
            //  System.out.println(doubles[i]);
        }
        for (double number : doubles) {
            System.out.println(number + 1);
        }
        double [] doubles1 = doubles.clone();
        System.out.println(Arrays.toString(doubles1));
    }
}
