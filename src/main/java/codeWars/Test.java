package codeWars;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        System.out.println(vowel2Index("this is my string"));

    }

    public static String vowel2Index(String s) {
        String regex = "[euioa]";
        Pattern pattern = Pattern.compile(regex);
        List<String> words = new ArrayList<>();
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
            words =List.of(pattern.split(s));

        }
        StringBuilder result = new StringBuilder();
        int sumOfLengths = 0;

        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            result.append(word);
            sumOfLengths += word.length()+1;

            if (i != words.size() - 1) {
                result.append(sumOfLengths);
            }
        }
        return  result.toString();
    }

}

/*
Поиск НОД
public static void main(String[] args) {
        int x = 78;
        int y = 18;
        System.out.println(compute(x,y));

    }
    public static int compute(int x, int y) {
        System.out.println("x= " + x + " y = " + y);
       if (x==0) {return y;}
       if (y==0) {return x;}
       if (x>= y){return compute(x%y , y); }
       else {return compute(x , y%x); }
    }

 */

/*
public class Order {
   public static String order(String words) {
        String[] arr = words.split(" ");
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < 10; i++) {
            for (String s : arr) {
                if (s.contains(String.valueOf(i))) {
                    result.append(s + " ");
                }
            }
        }
        return result.toString().trim();
    }
}
 */

/*
return str.toLowerCase().chars().distinct().count() == str.length();
 */

/*
 public static void main(String[] args) {
        int number = 12345072;

        System.out.println(digital_root(number));
    }

    public static int digital_root(int n) {
        while(n/10 > 0){
            n = n/10 + n % 10;
        }
        return(n);
    }
 */

/*public static void main(String[] args) {
        String text=null;
        int n=1;
        //System.out.println(text.length());
        System.out.println("исходный текст - " + text);
        System.out.println("шифрованый текст - " + encrypt(text, n));
        System.out.println("расшифрованый текст - " + decrypt(encrypt(text, n), n));

    }

    public static String encrypt(final String text, final int n) {
        String newString=String.valueOf(text);
        for (int i=0; i < n; i++) {
            StringBuilder sb=new StringBuilder();
            for (int j=1; j < newString.length(); j+=2) {
                sb.append(newString.charAt(j));

            }
            for (int j=0; j < newString.length(); j+=2) {
                sb.append(newString.charAt(j));
            }
            newString=String.valueOf(sb.toString());
        }
        if (text == null) {
            return null;
        }
        return newString;

    }

    public static String decrypt(final String encryptedText, final int n) {
        if (encryptedText == null) {
            return null;
        } else {
        String newString=String.valueOf(encryptedText);
        int lang=0;
        for (int i=0; i < n; i++) {
            StringBuilder sb=new StringBuilder();
            for (int j=0, k=newString.length() / 2; k < newString.length(); j++, k++) {
                sb.append(newString.charAt(k)).append(newString.charAt(j));

            }
                if (encryptedText.length() % 2 != 0) {
                    sb.deleteCharAt(sb.length() - 1);
                    newString=String.valueOf(sb.toString());
                }
                if (encryptedText.length() % 2 == 0) {
                    newString=String.valueOf(sb.toString());
                }
            }
            return newString;
        }


    }*/
/*
public static void main(String[] args) {
        String words = "";
        System.out.println(order(words));


    }
    public static String order(String words) {
        if (words == "") {
            return "";
        } else {
            StringBuilder sb=new StringBuilder();
            List<String> list=Arrays.asList(words.split(" "));
            String[] list1=new String[list.size()];
            for (int i=0; i < list.size(); i++) {
                if (list.get(i).contains("1")) {
                    list1[0]=list.get(i);
                }
                if (list.get(i).contains("2")) {
                    list1[1]=list.get(i);
                }
                if (list.get(i).contains("3")) {
                    list1[2]=list.get(i);
                }
                if (list.get(i).contains("4")) {
                    list1[3]=list.get(i);
                }
                if (list.get(i).contains("5")) {
                    list1[4]=list.get(i);
                }
                if (list.get(i).contains("6")) {
                    list1[5]=list.get(i);
                }
                if (list.get(i).contains("7")) {
                    list1[6]=list.get(i);
                }
                if (list.get(i).contains("8")) {
                    list1[7]=list.get(i);
                }
                if (list.get(i).contains("9")) {
                    list1[8]=list.get(i);
                }
            }
            for (int i=0; i < list1.length; i++) {
                sb.append(list1[i]).append(" ");
            }

            return sb.toString().trim();

        }
    }
 */