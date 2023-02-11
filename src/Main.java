import java.util.*;
public class Main{
    static int factorial(int n){
        if(n<=1) return 1;
        else return n* factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = factorial(n);
        System.out.print(sum);
    }
}