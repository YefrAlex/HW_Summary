package JavaPro.lesson25_unit_test.task1;

public class ArrayUtils {
       public static int[] getArrayBySize(int size){
           if(size<0){
               throw new RuntimeException("Размер массива не может быть меньше 0");
           }
        int[] arr = new int[size];
        for (int i=0; i < arr.length; i++) {
            arr[i]=i+1;
        }
        return arr;
    }
}
