import java.util.Scanner;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int t_case = sc.nextInt();
        for(int i=0;i<t_case;i++){
            long n = sc.nextLong();
            BigInteger b = BigInteger.valueOf(n);
            if(b.isProbablePrime(10)){
                sb.append(n+"\n");
            }else sb.append(b.nextProbablePrime()+"\n");
        }
        System.out.println(sb);
    }
}