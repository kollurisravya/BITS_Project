package day2;

import java.util.Scanner;

public class Armstrong {


public static boolean solution(int num){

    // step1: get a count of the digits
    int temp=num;
    int count=0;
    while(temp !=0){
        count++;
        temp = temp /10;
    }
     
    // step2: calculate the consicutive sum of all digits

    temp = num;
    double result = 0;
    while(temp !=0){
        int digit = temp %10;
        result = result +Math.pow(digit, count);
        temp /=10;
    
    }

    System.out.println(result+" " +num);
    return result == num;

}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = solution(n);
        if(res){
            System.out.println("this is Armstrong number");
        }
        else{
            System.out.println("not a Armstrong number");
        }

    }
}
