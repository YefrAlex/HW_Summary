package JavaSummary._2023_08_25;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task3 {
    //AAADSDDDSFAFDSFADSDFRETYDLKJHAFSHGDFASD
    //5A6S7D8F

    public static void main(String[] args) {
        String str = "AAADSDDDSFAFDSFADSDFRETYDLKJHAFSHGDFASD";
        System.out.println(countChar(str));

    }
    public static String countChar (String str){
        Map<Character,Integer> map = new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else {
                map.put(str.charAt(i),1);

            }
        }
        for (Map.Entry<Character,Integer> pair : map.entrySet()){
            sb.append(pair.getValue()).append(pair.getKey());
        }
        return sb.toString();
    }

}
