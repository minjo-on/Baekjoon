import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(search(arr,n,k));
    }

    static int search(int[]arr, int n, int k){
        int result = 0;
        for(int i=0;i<n-2;i++){

            if(arr[i]>=k) continue;//첫번째 카드가 더 크면 패스
            for(int j=i+1;j<n-1;j++){
                if(arr[i]+arr[j]>=k) continue;//두 카드의 합이 더 크면 패스
                for(int l=j+1;l<n;l++){
                    int sum = arr[i]+arr[j]+arr[l];
                    if(sum==k) return sum;//블랙잭 당첨
                    if(sum>result&&sum<k) result = sum;//낼 수 있는 최대 값
                }
            }
        }
        return result;
    }
}