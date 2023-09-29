package algoritms.lesson20230810;

import java.lang.reflect.Array;

public class RecursionExamples {
    public static void main(String[] args) {
        System.out.println(ballPossibleWayTab (9));
    }

    public static int ballPossibleWay(int n){
        if (n == 1) return 1; // base condition
        if (n == 2) return 2; // base condition
        if (n == 3) return 4; // base condition
        return ballPossibleWay(n - 1) + ballPossibleWay(n - 2) + + ballPossibleWay(n - 2);

    }
    public static int ballPossibleWayTab(int n){
        int result;
        if  (n == 1) return  1;
        if ( n == 2) return  2;
        if ( n == 3) return  4;
        int firstStep = 1;
        int secondStep = 2;
        int thirdStep = 4;
          result = firstStep + secondStep + thirdStep;

        for (int i=4; i < n + 1; i++) {
             result = firstStep + secondStep + thirdStep;
             firstStep = secondStep;
             secondStep = thirdStep;
             thirdStep = result;
        }
        return result;
    }

/*2. Самый дешёвый путь
В каждой клетке прямоугольной таблицы N*M записано некоторое число.
Изначально игрок находится в левой верхней клетке.
За один ход ему разрешается перемещаться в соседнюю клетку либо вправо, либо вниз (влево и вверх перемещаться запрещено).
При проходе через клетку игрок платит определенную сумму, какое число записано в этой клетке.
Требуется найти минимальную стоимость пути, отдав которую игрок может попасть в правый нижний угол.
*/
     public static int wayPrice (int n, int m){

        return 0;
     }

}
