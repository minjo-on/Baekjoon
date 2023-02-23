import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=2*n-1;i++){
            if(i<=n){
                for(int j=n-i;j>0;j--) System.out.print(" ");
                for(int s=0;s<2*i-1;s++) System.out.print("*");
            }else{
                for(int j=0;j<i-n;j++) System.out.print(" ");
                for(int s=2*(2*n-i)-1;s>0;s--)System.out.print("*");
            }
            System.out.println();
        }
    }
}