import java.util.Scanner;
public class Main {//왜 틀린거임
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        System.out.println(lcm(a,b));
    }
    static long gbc(long a,long b){
        if(a<b){
            long temp = a;
            a = b;
            b = temp;
        }
        while (b!=0){
            long r = a%b;
            a=b;
            b=r;
        }
        return a;
    }
    static long lcm(long a,long b){
        return a*b / gbc(a,b);
    }
}