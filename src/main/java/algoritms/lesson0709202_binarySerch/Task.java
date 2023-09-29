package algoritms.lesson0709202_binarySerch;

public class Task {
             public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,6,7,8,9};
            int num = 16;
            findPairs(arr,num);

        }
        public static void findPairs(int[] arr, int num)  {
            for (int i = 0; i < arr.length - 2; i++) {
                for (int j = i + 1; j < arr.length -1; j++) {
                    for (int k=j+1; k < arr.length ; k++) {
                        if (arr[i] + arr[j] + arr[k] == num) System.out.println((arr[i]+" " +arr[j]+" "+ arr[k]));
                    }

                }
            }
        }

    }
