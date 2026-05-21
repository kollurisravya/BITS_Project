package day3.Assignment;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "hello class";
        String reversed = new StringBuffer(s).reverse().toString();
        System.out.println(reversed);
    }
}
