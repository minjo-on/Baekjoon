import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean flag = false;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int s = sc.nextInt();
        int[] search = new int[s];
        for(int i=0;i<s;i++){
            search[i] = sc.nextInt();
            int count = 0;
            while(count<n){
                if(arr[count]==search[i]){
                    flag = true;
                    break;
                }
                count++;
            }
            if(flag) search[i] = 1;
            else search[i] = 0;
            flag = false;
        }

        for(int i=0;i<s;i++){
            System.out.print(search[i]+" ");
        }
    }
}