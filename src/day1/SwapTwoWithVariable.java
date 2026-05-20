package day1;

public class SwapTwoWithVariable {
    public static void main(String args[]){
        int a = 10;
        int b = 15;
        System.out.println("a = "+a +""+"b = "+b);
        int c = a;
        a = b;
        b=c;
        System.out.println("a = "+a +""+"b = "+b);
    }
}
