import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long j = sc.nextLong();
        long a = Math.max(n,j);
        long b = Math.min(n,j);
        long l1 = b*(b-1)/2;
        long l2 = a*(a+1)/2;

        System.out.println(l2-l1);
    }
}