package JavaPro.lesson20_input_output.task3;

public class Main {
    public static void main(String[] args) {
        int x=64;
        int y=0;
        System.out.println("НАЧАЛО РАБОТЫ ");
        System.out.println("вызываем метод");
        div(x,y);
        System.out.println("Конец работы программы");
    }

    public static void div(int x, int y) {
        System.out.println("начало работы метода");
        System.out.println("осуществляем проверку делителя");
        if (y==0){
            System.err.println("Ошибка!!! Делитель равен нулю");
            y = 1;
        }
        int result=x / y;
        System.out.println("Метод завершил работу");
        System.out.println("Результат работы - " + result);

    }
}
