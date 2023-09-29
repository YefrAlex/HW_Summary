package JavaSummary._2023_08_11;

import com.sun.jdi.IntegerValue;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<Integer, String> map=new HashMap<>();
        map.put(-1, "fff");
        map.put(-6, "fftf");
        map.put(11, "ferff");
        map.put(21, "ffgf");
        map.put(98, "ffaf");
        map.put(151, "fvff");
        System.out.println(new Task2().getKey(map));

    }

    public int getKey(Map<Integer, String> map) {
        int max=Integer.MAX_VALUE;
        for (Map.Entry<Integer, String> pair : map.entrySet()) {
            int key=pair.getKey();
            if (max > key) {
                max=key;
            }
        }
        return max;
    }
}
