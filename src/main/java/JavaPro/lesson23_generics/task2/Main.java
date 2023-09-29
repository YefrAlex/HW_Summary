package JavaPro.lesson23_generics.task2;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        Box<Integer> integerBox = new Box<>();

        stringBox.putItem("nakonecto");
    }
}
