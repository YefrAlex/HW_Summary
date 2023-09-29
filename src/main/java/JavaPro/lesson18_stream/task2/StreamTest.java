package JavaPro.lesson18_stream.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String>list =Arrays.asList("10","20","30","10","100","50");

        // сложить все эелементы
        String result1 = list.stream().reduce((x,y)->x+y).orElse("");
        System.out.println("результат сложения " + result1);

        String result3 = String.valueOf((list.stream().mapToInt(x->Integer.parseInt(x)).reduce((x,y)->x+y)).orElse(-1));
        System.out.println("результат сложения " + result3);

        String result2 = ""+(list.stream().mapToInt(x->Integer.parseInt(x)).reduce((x,y)->x+y).orElse(-1));
        System.out.println("результат сложения " + result2);

        long count = list.stream().filter(x->x.equals("10")).count();
        System.out.println("количество элементов '10' " + count);

        // Посчитать количество элементов, содержащих подстроку "10"
        count = list.stream().filter(x->x.contains("10")).count();
        System.out.println("количество элементов, содержащих подстроку '10' " + count);

        // Получить лист объектов, отсортированных в естественном порядке

        List<String> sortedList = list.stream().sorted().toList();
        System.out.println("Отсортированый лист " + sortedList);


        // Получить лист объектов, отсортированных по возрастанию их числового значения
        sortedList = list.stream().sorted((x,y) -> Integer.parseInt(x) - Integer.parseInt(y)).toList();
        System.out.println("Отсортированый как числа лист " + sortedList);

        // Отсортировать элементы листа и получить первые три
        List<String>limiterdList = list.stream().sorted().limit(3).toList();
        System.out.println("первые три элемента " + limiterdList);

        // Отсортировать лист как числа и пропустить первые два элемента
        sortedList = list.stream().sorted((x,y) -> Integer.parseInt(x) - Integer.parseInt(y)).skip(2).toList();
        System.out.println("лист с пропущенными элементами " + sortedList);

        // Получить новый лист, исключив дубликаты
        List<String> listWithoutDublicates = list.stream().distinct().toList();
        System.out.println(listWithoutDublicates);

        // Перебрать все элементы листа
        // 1. Вывести в консоль каждый элемент, добавив к нему hello (10   ->   10 hello)
        // 2. Сами элементы потока при этом меняться не должны
        // 3. Отсортировать поток в алфавитном порядке и передать в новый лист
        List<String> newList = list.stream().peek(x -> System.out.println(x+" hello")).sorted().toList();
        System.out.println("новый лист - " + newList);

        // То же самое задание, но изменения должны отразиться на каждом элементе

          newList = list.stream().map(x ->  x+" hello").sorted().toList();
          System.out.println("новый лист - " + newList);

        //вывести в консоль каждый элемент через пробел
        list.forEach(x -> System.out.println(x + " " + x));

        // Найти максимальное число
        List <Integer> numbers = Arrays.asList(8,2,9,4,3,1,5);
        int max = numbers.stream().max((x,y) -> x-y).orElse(-1);
        System.out.println("максимальное число - " + max);
        // Найти минимальное число
        int min = numbers.stream().min((x,y) -> x-y).orElse(-1);
        System.out.println("минимальное число - " + min);
    }
}
