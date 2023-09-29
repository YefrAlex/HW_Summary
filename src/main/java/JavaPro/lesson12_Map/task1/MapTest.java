package JavaPro.lesson12_Map.task1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        System.out.println("Пустая ли коллекция? - " + map.isEmpty());

        map.put("Orange", 200);
        map.put("Banana", 150);
        map.put("Apple", 89);
        map.put("Potato", 76);
        map.put("Carrot", 112);
        map.put("Pineapple", 238);
        map.put("Lemon", 143);
        map.put("Tomato", 128);

        System.out.println("Цена на морковь: " + map.get("Carrot"));
        System.out.println("Цена на лимон: " + map.get("Lemon"));
        System.out.println("Цена на абрикос: " + map.get("Apricot"));

        map.put("Carrot", 122);

        System.out.println("Цена на морковь: " + map.get("Carrot"));

        System.out.println("Есть ли в списке помидор? - " + map.containsKey("Tomato"));
        System.out.println("Есть ли в списке абрикос? - " + map.containsKey("Apricot"));

        System.out.println("Есть ли в списке товар по цене 143? - " + map.containsValue(143));
        System.out.println("Есть ли в списке товар по цене 99? - " + map.containsValue(99));

        System.out.println("Пустая ли коллекция ?  " + map.isEmpty());

        map.remove("Pineapple");
        System.out.println("содержится ли Ананас ? " + map.containsKey("Pineapple"));

        System.out.println("размер коллекции " + map.size());

        // Вывод в консоль мап при помощи println
        System.out.println(map);

        for (String currentKey : map.keySet()){
            System.out.println(currentKey);
        }
        for (Integer currentValue : map.values()){
            System.out.println(currentValue);
        }
        for (Map.Entry<String, Integer> pair : map.entrySet()){
            String key = pair.getKey();
            Integer value =pair.getValue();
            System.out.printf("Продукт - %s, цена - %d.%n", key, value);

        }

        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String,Integer> pair = iterator.next();
            String key = pair.getKey();
            Integer value = pair.getValue();
            if (value > 190 || key.startsWith("T")) {
                iterator.remove();
            }
        }
        for (Map.Entry<String, Integer> pair : map.entrySet()){
            String key = pair.getKey();
            Integer value =pair.getValue();
            System.out.printf("Продукт - %s, цена - %d.%n", key, value);

        }

    }
}
