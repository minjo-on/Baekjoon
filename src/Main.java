import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] arr = new String[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = sc.next();
            arr[i][1] = sc.nextLine();
        }
        Arrays.sort(arr,(a,b)-> {
            int a1 = Integer.parseInt(a[0]);
            int b1 = Integer.parseInt(b[0]);
            if (a1 != b1) return a1 - b1;//나이 같으면 어린거
            else return 0;//같으면 그대로
        });
        for(int i=0;i<n;i++){
            System.out.println(arr[i][0]+arr[i][1]);
        }

    }
}