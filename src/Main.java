import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        int temp;
        for(int i=0;i<m;i++){
            int j = sc.nextInt();
            int k = sc.nextInt();
            int ball = sc.nextInt();
            for(int l=j-1;l<k;l++){
                arr[l] = ball;
            }
        }
        for(int i=0;i<n;i++){
            sb.append(arr[i]+" ");
        }
        System.out.println(sb);
    }
}