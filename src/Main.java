import java.util.Scanner;
import java.math.BigInteger;
public class Main {
    static boolean checkNum(int n){
        if(n==1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    static boolean[] b = new boolean[1000001];
    static int partition(int n){
        int count = 0;
        int start = 2;
        while(true){
            if(start>n/2) break;
            if(!b[start]&&!b[n-start]){
                count++;
            }
            start++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        b[0] = b[1] = true;
        for(int i=2;i<=1000000;i++){
            if(!checkNum(i)) b[i] = true;
        }
        int t_case = sc.nextInt();
        for(int i=0;i<t_case;i++){
            int n = sc.nextInt();
            sb.append(partition(n)+"\n");
        }
        System.out.println(sb);
    }
}