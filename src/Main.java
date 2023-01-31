import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //행렬 크기 입력
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] a = new int[n][m];//배열 a
         //a배열 값 대입
        for(int i=0;i<n;i++){
            for(int k=0;k<m;k++){
                a[i][k] = sc.nextInt();
            }
        }
        //더할 값 입력 후 a배열에 덧셈
        for(int i=0;i<n;i++){
            for(int k=0;k<m;k++){
                a[i][k] += sc.nextInt();
            }
        }
        //결과 출력
        for(int i=0;i<n;i++){
            for(int k=0;k<m;k++){
                System.out.print(a[i][k]+" ");
            }
            System.out.println();
        }
    }
}