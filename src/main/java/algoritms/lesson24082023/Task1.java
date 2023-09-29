package algoritms.lesson24082023;

public class Task1 {

  //          (mid -1+arr.lenght)%arr.lenght;
  //          (mid+1)%arr.lenght;
  public static void main(String[] args) {
      int[]arr = {7,8,9,10,11,12,13,14,1,2,3,4,5,6};

      System.out.println("индекс срыва -- "+ indexSerch(arr));
      System.out.println("элемент срыва -- "+ arr[indexSerch(arr)]);

  }
  public static int indexSerch (int[] arr) {

      int mid=0;
      if (arr[0] < arr[arr.length - 1]) {
          mid=0;
      } else {
          mid=arr.length / 2;
          while (arr[mid] < arr[mid + 1]) {
              if (arr[mid-1]> arr[mid]){
                  return mid-1;
              } else
              if (arr[mid] > arr[arr.length - 1]) {
                  mid=mid + (arr.length - mid) / 2;
              } else {
                  mid=mid / 2;
              }
          }
      }
      return mid;
  }
}
