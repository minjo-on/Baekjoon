import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = i+1;
        }
        int temp;
        for(int i=0;i<m;i++){
            int j = sc.nextInt();
            int k = sc.nextInt();
            temp = arr[k-1];
            arr[k-1] = arr[j-1];
            arr[j-1] = temp;
        }
        for(int i=0;i<n;i++){
            sb.append(arr[i]+" ");
        }
        System.out.println(sb);
    }
}