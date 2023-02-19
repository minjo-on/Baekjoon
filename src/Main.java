import java.util.*;
public class Main {//시간초과 해결
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int s = sc.nextInt();

        for(int i=0;i<s;i++){
            int search = sc.nextInt();
            int count;
            int left = 0;
            int right = n-1;
            while(left<=right){
                int mid = (left+right)/2;
                if(arr[(left+right)/2]<search){
                    left=mid+1;
                }else if(arr[(left+right)/2]>search){
                    right = mid-1;
                }else{
                    flag = true;
                    break;
                }
            }
            if(flag) sb.append(1+" ");
            else sb.append(0+" ");
            flag = false;
        }
        System.out.print(sb);
    }
}