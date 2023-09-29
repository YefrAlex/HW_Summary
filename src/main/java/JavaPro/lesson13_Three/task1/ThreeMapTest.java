package JavaPro.lesson13_Three.task1;

import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.TreeMap;

public class ThreeMapTest {
    public static void main(String[] args) {
        TreeMap<String, Integer> items=new TreeMap<>();
        items.put("orange", 190);
        items.put("tomato", 150);
        items.put("apple", 190);
        items.put("banana", 140);
        items.put("watermelon", 40);
        items.put("peach", 170);
        items.put("lemon", 110);

        for (Map.Entry<String, Integer> item : items.entrySet()) {
            String key=item.getKey();
            Integer value=item.getValue();
            //  System.out.printf("Товар - %s, цена - %d.%n", key, value);

        }
        TreeMap<Cat, Integer> cats=new TreeMap<>();
        cats.put(new Cat(5, "Black", 6.12), 1);
        cats.put(new Cat(6, "White", 7.12), 2);
        cats.put(new Cat(7, "Gray", 5.12), 3);
        cats.put(new Cat(8, "Black", 6.72), 4);
        cats.put(new Cat(9, "Gray", 6.82), 5);
        cats.put(new Cat(5, "Green", 6.92), 6);
        cats.put(new Cat(7, "Yelow", 6.42), 7);
        cats.put(new Cat(4, "Black", 6.52), 8);

        for (Map.Entry<Cat, Integer> pair : cats.entrySet()) {
            Cat cat=pair.getKey();
            Integer id=pair.getValue();
            System.out.println(cat + "  " + id);

        }
    }
}
