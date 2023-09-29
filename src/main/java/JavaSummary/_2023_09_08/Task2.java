package JavaSummary._2023_09_08;

import java.util.List;

public class Task2 {
    // Дан список строк, каждая строка содержит название города и его
    //население в тысячах человек, разделенных запятой. Необходимо найти топ N городов с
    //наибольшим населением. Напишите метод, который принимает список строк и число N и
    //возвращает список топ N городов.
    //public static List<String> getTopNCities(List<String> cities, int n)
    public static void main(String[] args) {
        List<String> cities=List.of("NewYork,7000", "Tokyo,6200", "London,5800", "Pekin,5300", "Berlin,3100", "Paris,2800", "Madrid,2500", "Rome,2800");
        int n=3;
        System.out.println(getTopNCities(cities, n));
    }

    public static List<String> getTopNCities(List<String> cities, int n) {
        return cities.stream()
                .map(city -> city.split(","))
                .sorted((c1, c2) -> Integer.compare(Integer.parseInt(c2[1].trim()), Integer.parseInt(c1[1].trim())))
                .limit(n)
                .map(city -> city[0])
                .toList();
    }

}
