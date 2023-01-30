import java.util.*;
public class Main{
    static boolean checkNum(int n){
        if(n==1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();//m의 범위부터
        int n = sc.nextInt();//n까지의 범위
        int sum = 0; //소수들의 총합
        int min = 0; //소수중 최소값
        for(int i=m;i<=n;i++){
            if(checkNum(i)) {
                if(sum==0) min = i;
                sum += i;
            }
        }
        if(sum==0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}