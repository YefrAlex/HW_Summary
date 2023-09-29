package JavaPro.lesson5_Massivs.task4;

public class ArrayCloneTest {
    public static void main(String[] args) {
        int[][] numbers = {{1,2},{3,4}};
        System.out.println("элемент исходного массива  " + numbers[1][1] );
        int [][] copy = numbers.clone();
        copy [1][1] = 7;
        System.out.println("элемент клониррованого массива  " + numbers[1][1] );

        copy [0] = numbers[0];
        copy[1]=numbers[1];
        copy [1][1] = 7;

        System.out.println("элемент клониррованого массива  " + copy[1][1] );
        System.out.println("элемент исходного массива  " + numbers[1][1] );
    }
}
