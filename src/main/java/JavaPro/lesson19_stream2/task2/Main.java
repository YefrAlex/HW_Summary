package JavaPro.lesson19_stream2.task2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[][] symbols={{"d", "r"},
                {"p", "c", "b", "s"},
                {"o", "q", "v"}};
        List<String> result =Arrays.stream(symbols).flatMap(x-> Arrays.stream(x)).filter(x->!"b".equals(x)).sorted().toList();
        System.out.println(result);
        String[][] words={{"ddd", "rrr"},
                {"ppp", "ccc", "b", "s"},
                {"o", "q", "v"}};
        List<Character> result2 = Arrays.stream(words)
                .flatMap(x -> Arrays.stream(x))
                .map(x -> {
                    Character[] characters = new Character[x.length()];
                    char[] chars = x.toCharArray();
                    for (int i = 0; i < chars.length; i++) {
                        characters[i] = chars[i];
                    }
                    return characters;
                })
                .flatMap(x -> Arrays.stream(x))
                .filter(x -> 'b' != x)
                .toList();
    };

}
