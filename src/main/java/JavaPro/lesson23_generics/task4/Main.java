package JavaPro.lesson23_generics.task4;

public class Main {
    public static void main(String[] args) {

        Long l = 123L;
        Integer i = 34;
        Float f = 5.87F;
        Double d = 123.45;
        Byte b = 32;

        NumberUtils<Float> utils = new NumberUtils<>(f);
        utils.printIntegerValue();
        NumberUtils<Double> utildouble = new NumberUtils<>(d);
        utildouble.printIntegerValue();
    }
}
