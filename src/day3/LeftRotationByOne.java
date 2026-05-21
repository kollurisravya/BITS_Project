package day3;

import java.util.Arrays;

public class LeftRotationByOne {

    //time complexity:o(n)
   public static void solution(int[] arr){
    int size = arr.length;
    //step1:

    int temp = arr[0];
    //step2:

    for(int i = 1; i<size;i++){
        arr[i-1] = arr[i];
    }
    //step3:
    arr[size-1] = temp;
   } 

   public static void main(String[] args) {
    int[] arr = {-1,2,5,8,11,35};
    solution(arr);
    System.out.println(Arrays.toString(arr));
   }
}
