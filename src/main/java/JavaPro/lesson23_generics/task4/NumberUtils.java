package JavaPro.lesson23_generics.task4;

public class NumberUtils <T extends Number>{

    private T value;
    public NumberUtils (T value){
        this.value = value;
    }
    public void printIntegerValue () {
        System.out.println(value.intValue());
    }

}
