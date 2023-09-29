package JavaPro.lesson22_regular_expression.task5;

import java.util.Arrays;
import java.util.regex.Pattern;

public class DelemiterTest1 {
    public static void main(String[] args) {
        String tetx = "Hello67World5I789study00Java";
        String regex = "[0-9]{1,3}";
        Pattern pattern = Pattern.compile(regex);
        String[] words =pattern.split(tetx);
        //System.out.println(Arrays.toString(words));
        Arrays.stream(words).forEach(x-> System.out.print(x+" "));

    }
}
