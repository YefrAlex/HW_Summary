package JavaPro.lesson19_stream2.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] source={{9, 2, 7},
                        {6, 1, 8, 3},
                        {5, 4}};
        int[] result=Arrays.stream(source).flatMapToInt(x-> Arrays.stream(x)).toArray();
        System.out.println(Arrays.toString(result));
    }

}
