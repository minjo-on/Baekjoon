import java.util.*;
public class Main{
    /*static boolean checkNum(int n){
        if(n==1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 2;//인수분해할 수
        for(int i=2;i<=Math.sqrt(n);i++) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }
        if(n!=1) System.out.println(n);
    }
}