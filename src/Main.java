import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        int count = 0;//x좌표가 0인 개수
        for(int i=0;i<n;i++){
            arr[i][0] = sc.nextInt();//x좌표
            arr[i][1] = sc.nextInt();//y좌표
            if(arr[i][0]==0) count++;
        }
        Arrays.sort(arr,(a,b)-> {
            if (a[0] == b[0]) return a[1] - b[1];//x좌표가 같아서 y좌표끼리 비교해서 음수나오면 변경
            else return a[0] - b[0];//다르면 x좌표끼리 비교해서 음수나오면 변경
        });
        for(int i=count-1;i<n;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
        for(int i=0;i<count;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}