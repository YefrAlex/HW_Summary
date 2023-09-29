package JavaSummary._2023_09_15.jsonParser;


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProductParser {
    public static void main(String[] args) {
        String content=null;
        try {
            content=readFile("D:\\JavaPro_280323_m_be\\src\\main\\java\\JavaSummary\\_2023_09_15\\jsonParser\\report.txt", StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Product> products=getProductstList(getList(content));

        // выводим общую сумму товаров категори FOOD
        Double sum=products.stream().filter(x -> x.getCategory().equals("FOOD")).mapToDouble(prod -> prod.getPrice() * prod.getQuantity()).sum();
        System.out.println("общая сумму товаров категори FOOD - " + sum);
        // выводим среднюю маржинальность товаров, которые учавствуют в акциях
        Double avgAdvPrice=products.stream().filter(x -> x.isAdvertising() == true).mapToDouble(prod -> prod.getPrice()).average().orElse(-1);
        System.out.println("средняя маржинальность товаров, которые учавствуют в акциях - " + avgAdvPrice);
        // вывести всех производителей запас которых на складе больше 250 единиц
        List<String> warhauseQuantity=products.stream().filter(prod -> prod.getQuantity() > 200).map(product -> product.getFactory()).distinct().toList();
        System.out.println("производители запас товаров которых на складе больше 250 единиц" + warhauseQuantity);
    }

    public static String readFile(String path, Charset encoding) throws IOException {
        byte[] encoded=Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }


    public static List<Product> getProductstList(List<String> itemList) {
        List<Product> products=new ArrayList<>();

        for (String s : itemList) {
            products.add(getProduct(s));
        }

        return products;
    }

    public static Product getProduct(String string) {
        List<String> listCheracters=new ArrayList<>();
        Product product=new Product();
        String regex="[^)\\[]+#";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(string);
        while (matcher.find()) {
            String str=matcher.group();
            listCheracters.add(str.replaceFirst(".$", ""));
        }
        product.setCategory(listCheracters.get(0));
        product.setName(listCheracters.get(1));
        product.setFactory(listCheracters.get(2));
        product.setQuantity(Integer.parseInt(listCheracters.get(3)));
        product.setPacked(Boolean.parseBoolean(listCheracters.get(4)));
        product.setAdvertising(Boolean.parseBoolean(listCheracters.get(5)));
        product.setPrice(Double.parseDouble(listCheracters.get(6)));
        product.setMargin(Double.parseDouble(listCheracters.get(7)));
        product.setDebt(Boolean.parseBoolean(listCheracters.get(8)));
        return product;
    }

    public static List<String> getList(String content) {
        return Arrays.asList(content.split("\n"));
    }
}
