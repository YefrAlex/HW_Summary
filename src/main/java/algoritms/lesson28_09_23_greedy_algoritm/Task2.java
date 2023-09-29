package algoritms.lesson28_09_23_greedy_algoritm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        int[][] x = {{1,2},{3,6},{2,4},{4,6},{3,4},{5,8},{7,8}};
        Arrays.sort(x,(a,b)->a[1]-b[1]);
        System.out.println(Arrays.deepToString(x));

        for (int[] event : getEventsList(x)) {
            System.out.print(Arrays.toString(event) + ", ");
        }

    }
    public static List<int[]> getEventsList (int[][] x){
        List<int[]> events = new ArrayList<>();
        events.add(x[0]);
        for (int i=1; i < x.length; i++) {
            int h = events.get(events.size()-1)[1];
            if (x[i][0] >= h) {
                events.add(x[i]);
            }
        }
        return events;
    }
}
