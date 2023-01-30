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
        int n = sc.nextInt(); //입력할 정수 개수
        int count = 0; //소수 개수
        for(int i=1;i<=999;i++){
            //int t = sc.nextInt();
            if(checkNum(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}