package day3.Assignment;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s = sc.nextLine();

        if(isPalindrome(s)){
            System.out.println("it is a palindrome:"+s);

        }
        else{
            System.out.println("it is not a palindrome");
        }
         sc.close();
    }

    public static boolean isPalindrome(String s){
        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while (left<right) {
            if(s.charAt(left)!= s.charAt(right)){
                return false;
            }

            left++;
            right--;
            
        }
        return true;
    }
   
}
