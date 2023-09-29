package JavaPro.lesson24_exeptions.task4;

import java.util.Scanner;

public class UserRegistrationTest {
    public static void main(String[] args) {
        // Регистрация пользователя
        // Пользователь должен ввести свой возраст
        // Регистрация запрещена, если возраст меньше 12
        // Регистрация запрещена, если возраст больше 120

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст:");
        try {
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Введенный возраст  - " + age);
            registration(age);
        }catch (IllegalArgumentException | TooBigAgeException | TooSmallAgeException e){
            System.out.println("Введены некоретные данные");
            System.out.println("Причина - " + e.getMessage());
        }

    }
    public static void registration (int age) throws  TooBigAgeException{
        if (age<12){
           throw new TooSmallAgeException ("Возраст не может быть меньше 12");
        }
        if (age>120){
            throw new TooBigAgeException ("Возраст не может быть больше 120");
        }
        System.out.println("Регистрация прошла успешно");
    }
}
