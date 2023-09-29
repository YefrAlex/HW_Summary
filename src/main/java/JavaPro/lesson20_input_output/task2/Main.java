package JavaPro.lesson20_input_output.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите число x ");
        int x =sc.nextInt();
        System.out.println("ВВедите число y ");
        int y = sc.nextInt();
        System.out.printf("Summ - %d", x+y);
    }
}
