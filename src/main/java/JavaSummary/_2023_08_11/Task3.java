package JavaSummary._2023_08_11;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(6);
        // System.out.println(new Task3().getOdd(list));
        System.out.println(new Task3().remoweDublicate(list));
    }

    public List<Integer> getOdd(List<Integer> list) {
        List<Integer> oddList=new ArrayList<>();
        for (Integer integer : list) {
            if (integer % 2 == 0) {
                oddList.add(integer);
            }
        }
        return oddList;
    }

    public List<Integer> remoweDublicate(List<Integer> list) {

        for (int j=0, i= 1; i < list.size() ; i++ ) {

            if (list.get(j) == list.get(i)) {
                list.remove(i);
                i--;
            } else j++;

        }

        return list;
    }
}
 /*int i=0;

        while (i < list.size()) {
            int value =list.get(i);
            int j = i +1;
            while (j< list.size()) {
                if (value == list.get(j)) {
                    list.remove(j);

                } else
                j++;
            }
            i++;
        }*/