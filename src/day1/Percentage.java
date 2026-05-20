package day1;

import java.util.Scanner;

public class Percentage {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
   System.out.println("enter the percentage");
   int percentage = sc.nextInt();
    if(percentage >=90){
        System.out.println("Grade A");
    }
    else if(percentage >=80){
        System.out.println("Grade B");
    }
    else if(percentage >=60){
        System.out.println("Grade C");
    }
    else{
        System.out.println("Grade D");
    }
 }
}
