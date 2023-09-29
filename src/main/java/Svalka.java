public class Svalka {
    /*
    Сортируем 0 и 1
    public static void main(String[] args) {
        int[] arr={0, 0, 1, 1,1,1, 0, 1, 1, 0, 1, 0};
        System.out.println(Arrays.toString(arr));
        for (int i=0, j=i; j < arr.length  && i < arr.length  ;j++ ) {
            if (arr[i] == 0 ) {
                i++;
            } else if (arr[j] == 0) {
                    arr[i]=0;
                    arr[j]=1;
                    i++;
                }
            }

        System.out.println(Arrays.toString(arr));

    }
     */
    /*  возвести в квадрат каждую цифру числа
    public static int squareDigits(int n) {
        int k = 0;
        String str = ""+n;
        for (int i=str.length()-1; i>=0; i--) {
            if (i < str.length() -1 && Math.pow(n/(int)Math.pow(10,i),2) > 9 ){
                k=k*10;
            }
            k += Math.pow(n/(int)Math.pow(10,i),2)*(int)Math.pow(10,i);

            n=n%(int)Math.pow(10,i);

        }

        return k;
    }
     */
    /*  посчитать сумму всех чисел между А и Б включая их самих, если они одинаковы, вернуть А или Б
     return (a + b) * (Math.abs(a - b) + 1) / 2;
      */
}
