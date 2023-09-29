package JavaPro.lesson3_Enum.task4;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("До обращения к классу Day");
        Day day = Day.MONDAY;
        System.out.println("После обращения к классу Day");

        System.out.println("Выводим все возможные названия пятницы:");
        System.out.println(day);
        System.out.println(day.getRussianName());
        System.out.println(day.getShortName());

        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("Вызываем неабстрактный метод");
        day.printInfo();
        System.out.println("**********************************");
        System.out.println("Вызываем абстрактный метод");

    }
}
