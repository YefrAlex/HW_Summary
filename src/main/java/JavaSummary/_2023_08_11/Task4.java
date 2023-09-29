package JavaSummary._2023_08_11;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("AA");
        list.add("CC");
        list.add("CC");
        list.add("CC");
        list.add("CC");
        System.out.println(new Task4().findMaxRepeat(list));

    }

    public String findMaxRepeat(List<String> list) {
        int count=0;
        int max = 0;
        int indexmax = 0;
        String string="";
        for (int i=0; i < list.size() - 1; i++) {
            for (int j=0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;

                }
                if (max < count){
                    max=count;
                    indexmax = i;
                }
            }
        }
        return list.get(indexmax);
    }
}
//String most = Collections.max(frequencyMap.entrySet(), Map.Entry.comparingByValue()).getKey();

/*
package MoreLovelyThings1108;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ViktarsTask {
    // Есть лист стрингов. Они повторяются.
    // Вывести ту стрингу, которая встречается больше всего раз в листе

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Mazda");
        myList.add("Ford");
        myList.add("Cadillac");
        myList.add("Toyota");
        myList.add("Ford");
        myList.add("Mercedes");
        myList.add("BMW");
        myList.add("Cadillac");
        myList.add("Ford");
        myList.add("Dodge");
        myList.add("Mercedes");
        myList.add("Cadillac");
        myList.add("Fiat");
        myList.add("Cadillac");
        myList.add("Ford");

        System.out.println(mostRepeatingElement(myList));
    }

    public static String mostRepeatingElement (List<String> list) {
        StringBuilder repString = new StringBuilder();
        Map<String, Integer> mapaAuxilia = new HashMap<>();
        for (String current : list) {
            mapaAuxilia.put(current, mapaAuxilia.getOrDefault(current, 0)+1);
        }
        int maxCount = getMaxValue(mapaAuxilia);

        for (Map.Entry<String, Integer> entry : mapaAuxilia.entrySet()) {
            if (entry.getValue() == maxCount) repString.append(entry.getKey()).append(" ");
        }

        return repString.toString();
    }

    public static int getMaxValue(Map<String, Integer> map) {
        int maxValue = 0;
        for (int value : map.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
 */