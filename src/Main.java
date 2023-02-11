import java.util.*;
public class Main{
    static char[][] arr;
    static void star(int x,int y,int n, boolean blank){
        //빈칸일 경우
        if(blank){
            for(int i = x;i<x+n;i++){
                for(int j=y;j<y+n;j++){
                    arr[i][j]=' ';
                }
            }
            return;
        }
        //더이상 못나눌 때
        if(n==1){
            arr[x][y] = '*';
            return;
        }

        int size = n/3;//반복할 값
        int count = 0;//별 채운 횟수, 5일때마다 공백
        for(int i=x;i<x+n;i+=size){
            for(int j=y;j<y+n;j+=size){
                count++;
                if(count==5){
                    star(i,j,size,true);
                }else{
                    star(i,j,size,false);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new char[n][n];
        StringBuffer sb = new StringBuffer();
        star(0,0,n,false);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}