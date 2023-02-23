import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[]{1,1,2,2,2,8};
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<6;i++){
            int n = sc.nextInt();
            if(num[i]!=n) num[i] -=n;
            else num[i] = 0;
            sb.append(num[i]+" ");
        }
        System.out.println(sb);
    }
}