package JavaSummary._2023_09_15.tt;

import java.util.regex.Pattern;

public class RegexTest1 {
    private static boolean isIPCorrect(String ip) {
          String regex="((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?).){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

        return Pattern.matches(regex, ip);
    }

    private static boolean isIP(String ip) {
        String[] numbers=ip.split("\\.");
        for (int i=0; i < numbers.length; i++) {
            int result=Integer.parseInt(numbers[i]);
          //  System.out.println();
            if (result > 255 || result < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ip1="127.0.98.966";
        String ip2="88.0.0.0";
        System.out.println(isIPCorrect(ip1));
        System.out.println(isIPCorrect(ip2));
        System.out.println(isIP(ip1));
        System.out.println(isIP(ip2));

    }
}
