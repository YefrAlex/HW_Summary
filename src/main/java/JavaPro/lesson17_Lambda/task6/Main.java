package JavaPro.lesson17_Lambda.task6;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class Main {
    // Метод должен обработать каждый элемент массива и вернуть сет результатов
    public static void main(String[] args) {
        String[] array = {"AAA","BBB","CCCCC","BBB"};

        //обработать массив так чтобы к каждой строке был добавлен пробел и длинна этой строки
        Function<String, String> function =  x-> String.format("%s %d", x,x.length());
        Set<String>result = getSetFromArray(array,function);
        System.out.println(result);

        //используя метод вернуть сет никак не измененных значений
        Set<String>result1 = getSetFromArray(array,Function.identity());
        System.out.println(result1);


    }
    public static Set<String> getSetFromArray(String[]array,Function<String,String> function){
        Set<String> result = new HashSet<>();
        for (String currentWord : array){
            String processedWord =function.apply(currentWord);
            result.add(processedWord);
        }
        return result;
    }

}
