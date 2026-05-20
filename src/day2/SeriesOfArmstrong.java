package day2;

public class SeriesOfArmstrong {
    public static void main(String[] args) {
        int num = sc.nextInt();
         boolean res = solution(num);
    for(int i = 1;i<=num;i++){
        if(solution(i)){
            System.out.println(i + " ");
        }
    } 
    System.out.println();   
    }
}
