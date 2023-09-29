package JavaPro.lesson19_stream2.task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // Есть список товаров
    // Отфильтровать товары таким образом, чтобы получить
    // список товаров дороже 100 единиц и без дубликатов
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Apple",90));
        products.add(new Product("Banana",110));
        products.add(new Product("Potato",70));
        products.add(new Product("Carrot",88));
        products.add(new Product("Orange",200));
        products.add(new Product("Lemon",130));
        products.add(new Product("Orange",220));
        products.add(new Product("Kiwi",190));
        products.add(new Product("Apricot",70));

        List<String> result = products.stream().filter(x -> x.getPrice()>100).map(x->x.getName()).distinct().toList();
        System.out.println(result);

    }
}
