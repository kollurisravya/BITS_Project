package day1;

import java.util.Scanner;

public class Sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,sum;

        System.out.println("Enter a value");
         a = sc.nextInt();
        System.out.println("Enter b value");
         b = sc.nextInt();
         sum = a + b;
        System.out.println("total sum" +sum);
        sc.close();
        
    }
}
