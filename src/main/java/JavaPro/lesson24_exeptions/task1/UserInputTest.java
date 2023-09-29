package JavaPro.lesson24_exeptions.task1;

import java.util.Scanner;

public class UserInputTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        System.out.println("Введите возраст");
        int age;
        try{
            age = Integer.parseInt(scanner.nextLine());
        }
        catch (NumberFormatException e) {
            System.out.println("Неверный формат ввода данных - возраст!!!  возраст принят по умолчанию как 0.");
            age=0;
            System.out.println("Выводим информацию об ошибке: " + e.getMessage());
            System.out.println("Выводим стэк-трейс: ");
            e.printStackTrace();
        }

        System.out.printf("введенные данные: имя - %s, возраст - %d", name, age);

    }
}
