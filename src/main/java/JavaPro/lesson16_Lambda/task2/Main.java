package JavaPro.lesson16_Lambda.task2;

public class Main {
    public static void main(String[] args) {
        Operation operation = (x, y) -> {
            int result = x+y;
            System.out.println("DONE");
            return result;
        };
        System.out.println(operation.operate(3,5));
    }
}
