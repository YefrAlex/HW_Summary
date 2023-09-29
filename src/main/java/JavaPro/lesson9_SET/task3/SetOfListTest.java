package JavaPro.lesson9_SET.task3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOfListTest {
    public static void main(String[] args) {


        List<String> list1=new ArrayList<>();
        List<String> list2=new ArrayList<>();
        Set<List<String>> setOfList=new HashSet<>();

        list1.add("AAA");
        list1.add("BBB");
        //       list1.add("CCC");


        list2.add("AAA");
        list2.add("BBB");
        list1.add("CCC");

        setOfList.add(list1);
        setOfList.add(list2);

        System.out.println(setOfList);

        list1.remove("CCC");

        System.out.println(setOfList);

        setOfList.add(list1);

        System.out.println(setOfList);

        Set<List<String>> setOfListCheck =new HashSet<>(setOfList);
        System.out.println(setOfListCheck);

    }
}