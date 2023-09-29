package JavaSummary._2023_09_01;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        List<String> str=List.of("ffff", "aa" , "preHOTpost" , "bbbbb", "ffff","   ", "prestopost", "ccc", "bbbbb", "d", "aaaa", "aaaaa");
        List<String> words = Arrays.asList("elbow", "below");
        int[] numbers={0, -9, -4, -5, 7, 89, 34, 18, 89, 34};
        List<Integer> list1 = List.of(1,2,3,4,5,4,6);
        List<Integer> list2 = List.of(7,0,3,4,9,4,6);


        //System.out.println(filtrString(str));
        //  System.out.println(findAvg(str));
        // System.out.println(grupingByLength(str));
       // System.out.println(minNumber(numbers));
       // System.out.println(sumOfPower(numbers));
      //  System.out.println(unites(list1,list2));
       // System.out.println(sortList(str));
        // System.out.println(sortListI(str));
       // System.out.println(findSecondMax(list1));
        //printAnagram(words);
        //System.out.println(isAnagram(words));
       // Дан список строк. Необходимо удалить пустые строки, объединить оставшиеся строки в одну строку, разделенную запятой.
       // System.out.println(makeOneString(str));

       // Дан список слов. Необходимо объединить все символы из всех слов в одну строку.
       // System.out.println(getOneString(str));

        //Даны два списка чисел. Необходимо найти разность множеств (элементы, присутствующие только в одном из списков) и вывести результат.
        //System.out.println(getUniqNumberList(list1,list2));

        // Дан список слов. Необходимо подсчитать количество слов для каждой длины и вывести результат.
        // getNumbersOfStringsLangth(str);

        // Дан список строк. Необходимо отфильтровать строки, которые начинаются с префикса "pre" и заканчиваются суффиксом "post".
        // System.out.println(findPrePost(str));

        //Дан список слов. Необходимо подсчитать количество символов в каждом слове и вывести результат.
        //getNumbersOfChars(str);

        //Дан список чисел. Необходимо найти среднее значение всех уникальных чисел.
        //System.out.println(getUniqAvg(numbers));

        System.out.println(findLangestEvenString(str));

    }

    // Дан список строк. Необходимо отфильтровать строки, длина которых больше 3 символов, преобразовать их в верхний регистр, удалить повторяющиеся и вывести результат в отсортированном порядке.
    public static List<String> filtrString(List<String> str) {
        return str.stream().filter(x -> x.length() > 3).map(String::toUpperCase).distinct().sorted().toList();
    }
   // Дан список слов. Необходимо найти среднюю длину слов, начинающихся с буквы "A".
    public static double findAvg(List<String> str) {
        return str.stream().filter(x -> x.startsWith("a")).mapToInt(String::length).average().orElse(0.0);
    }
    // Дан список слов. Необходимо сгруппировать их по длине и вывести результат.
    public static Map<Integer, List<String>> grupingByLength(List<String> strings) {
        return strings.stream().collect(Collectors.groupingBy(String::length));
    }
    // Дан список чисел. Необходимо найти наименьшее число, больше 0.
    public static int minNumber(int[] numbers) {
        return Arrays.stream(numbers).filter(x -> x > 0).min().orElse(-1);
    }
    // Дан список чисел. Необходимо найти сумму квадратов всех положительных чисел.
    public static int sumOfPower (int[] numbers){
        return Arrays.stream(numbers).filter(num -> num > 0).map(num -> (int)(Math.pow(num,2))).sum();
    }
    // !!!Даны два списка чисел. Необходимо объединить их в один список, отсортировать по убыванию и удалить повторяющиеся элементы.
    public static List<Integer> unites (List<Integer> list1, List<Integer> list2){
        return Stream.concat(list1.stream(),list2.stream()).distinct().sorted((x,y) -> y -x).toList();
    }
    //Дан список строк. Необходимо оставить только уникальные символы из всех строк и вывести их в алфавитном порядке.
    public static String sortList (List<String> strings){
        return strings.stream().flatMapToInt(CharSequence ::chars)
                .distinct().sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
    public static List<Character> sortListI (List<String> strings){
        return strings.stream()
                .flatMap(s -> s.chars().mapToObj(c -> (char) c))
                .sorted().distinct().toList();
    }


    //Дан список чисел. Необходимо найти второе максимальное число.
    public static int findSecondMax (List<Integer> numbers) {
        return numbers.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().orElse(-1);
    }
    // TODO: 01.09.2023
    //Дан список слов. Необходимо отфильтровать слова, состоящие только из букв, разделить их на гласные и согласные, и вывести результат.

  //  public static List<String> getTask (List<String> list) {
   //     return list.stream().filter(word -> word.chars().allMatch(Character::isLetter))
     //           .collect(Collectors.partitioningBy(word -> Arrays.asList('a', 'e', 'i', 'o', 'u').contains(word.charAt(0))));
      // }
        /*
        Map<Boolean, List<String>> dividedByLetters = words.stream()
            .filter(word -> word.chars().allMatch(Character::isLetter))
            .collect(Collectors.partitioningBy(
                word -> Arrays.asList('a', 'e', 'i', 'o', 'u').contains(word.charAt(0))
            ));

        System.out.println("Гласные слова: " + dividedByLetters.get(true));
        System.out.println("Согласные слова: " + dividedByLetters.get(false));
         */
//Дан список слов. Необходимо проверить, содержат ли они одинаковые символы (являются ли анаграммами) и вывести результат.
  public static boolean isAnagram (List<String> strings){
      return strings.stream()
              .map(Task1::sortString) // сортируем символы в каждом слове
              .distinct() // оставляем только уникальные слова (анаграммы должны быть одинаковыми после сортировки)
              .count() == 1;
  }
    private static String sortString(String word) {
        char[] charArray=word.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
  public static void printAnagram (List<String> strings){
      if (isAnagram( strings)){
          System.out.println(strings);
      } else {
          System.out.println("Этот список  не является списком анаграмм");
      }
  }

  //Дан список строк. Необходимо удалить пустые строки, объединить оставшиеся строки в одну строку, разделенную запятой.

    public static String makeOneString (List<String> strings){
      return strings.stream()
              .map(s->s.trim())
              .filter(s->!s.isEmpty())
              .collect(Collectors.joining(","));

    }
    //Дан список слов. Необходимо объединить все символы из всех слов в одну строку.
    private static String getOneString(List<String> strings) {
       return  strings.stream()
               .flatMap(s -> s.chars().mapToObj(c -> (char) c))
               .map(Object::toString)
               .collect(Collectors.joining());
    }
    // Даны два списка чисел. Необходимо найти разность множеств (элементы, присутствующие только в одном из списков) и вывести результат.
    private static List<Integer> getUniqNumberList(List<Integer> list1, List<Integer> list2) {
      List<List<Integer>> listOfLists = new ArrayList<>();
      listOfLists.add(list1);
      listOfLists.add(list2);
      return listOfLists.stream().
              flatMap(list->list.stream())
              .filter(num -> !list1.contains(num) || !list2.contains(num))
              .toList();
              /*
               List<Integer> result = Stream.concat(list1.stream(), list2.stream())
                                     .filter(num -> !list1.contains(num) || !list2.contains(num))
                                     .collect(Collectors.toList());
               */

    }
    // Дан список слов. Необходимо подсчитать количество слов для каждой длины и вывести результат.
    private static void getNumbersOfStringsLangth(List<String> str) {
      str.stream().
              collect(Collectors.groupingBy(st -> st.length(),Collectors.counting())).
              forEach((length, count) -> System.out.println("количество слов длинной  " + length + "  равно -  " + count));
    }

    // Дан список строк. Необходимо отфильтровать строки, которые начинаются с префикса "pre" и заканчиваются суффиксом "post".
    private static List<String> findPrePost(List<String> str) {
      return str.stream().filter(x->x.startsWith("pre")&&x.endsWith("post")).toList();
    }

    //Дан список слов. Необходимо подсчитать количество символов в каждом слове и вывести результат.
    private static void getNumbersOfChars(List<String> str) {
      str.stream().distinct().collect(Collectors.toMap(st ->st,String::length)).forEach((word, length) -> System.out.println("слово " + word + "  содержит : " + length +" символов"));
    }
    //Дан список чисел. Необходимо найти среднее значение всех уникальных чисел.
    private static double getUniqAvg (int [] numbers){
      return Arrays.stream(numbers).distinct().mapToDouble(x->x).average().orElse(-1);
    }
     //todo как выдать стринг
    //Дан список слов. Необходимо найти самое длинное слово с четной длиной.
    private static List<String>  findLangestEvenString (List<String> strings){
      return strings.stream().filter(str -> str.length()%2 == 0).sorted((str1, str2)-> str2.length()-str1.length()).limit(1).toList();
    }
    //Дан список строк. Необходимо удалить все пробелы в каждой строке, отсортировать их в лексикографическом порядке и вывести результат.
    private static List<String> getNoSpace (List<String> words){
      return words.stream().map(w->w.replaceAll(" ","")).sorted().toList();
    }


}
/*




#########Дан список слов. Необходимо отфильтровать слова, состоящие только из букв, разделить их на гласные и согласные, и вывести результат.#######
Дан список строк. Необходимо удалить пустые строки, объединить оставшиеся строки в одну строку, разделенную запятой.
Дан список слов. Необходимо объединить все символы из всех слов в одну строку.

Даны два списка чисел. Необходимо найти разность множеств (элементы, присутствующие только в одном из списков) и вывести результат.

Дан список слов. Необходимо подсчитать количество слов для каждой длины и вывести результат.

Дан список строк. Необходимо отфильтровать строки, которые начинаются с префикса "pre" и заканчиваются суффиксом "post".

Дан список слов. Необходимо подсчитать количество символов в каждом слове и вывести результат.


Дан список чисел. Необходимо найти среднее значение всех уникальных чисел.


Дан список слов. Необходимо найти самое длинное слово с четной длиной.


Дан список строк. Необходимо удалить все пробелы в каждой строке, отсортировать их в лексикографическом порядке и вывести результат.


Дан список слов. Необходимо проверить, являются ли они палиндромами, и вывести результат.
Дан список чисел. Необходимо найти максимальное четное число.
Дан список строк. Необходимо объединить все строки в одну строку, добавив префикс ">>" и суффикс "<<" к каждой строке.
Дан список строк. Необходимо объединить все символы из всех строк, удалить дубликаты и отсортировать их в лексикографическом порядке.
Дан список объектов Person с полем "возраст". Необходимо отфильтровать объекты, возраст которых находится в диапазоне от 25 до 40 лет, отсортировать по имени и вывести результат.
Дан список чисел. Необходимо найти сумму всех четных чисел, которые являются положительными.
Дан список чисел. Необходимо найти второе минимальное число среди уникальных чисел.
Дан список слов. Необходимо разделить их на две группы: одна группа - слова с длиной менее или равной 4 символам, другая группа - слова с длиной более 4 символов. После этого подсчитать количество слов в каждой группе и вывести результат.
Дан список строк. Необходимо пропустить первые три символа в каждой строке и объединить оставшиеся символы в одну строку.
Дан список чисел. Необходимо найти три наименьших числа и вывести результат.
Дан список строк. Необходимо проверить, содержит ли хотя бы одна строка подстроку "an" и вывести результат.
 */