import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();//행
        int col = sc.nextInt();//열
        sc.nextLine();

        int min = 64;//출력값

        boolean[][] board = new boolean[row][col];//보드

        //보드 입력
        for(int i=0;i<row;i++){
            String s = sc.nextLine();
            for(int j=0;j<col;j++){
                if(s.charAt(j)=='W') board[i][j]=true;
                else board[i][j] = false;
            }
        }

        //8*8로 나눠서 분석
        for(int i=0;i<=row-8;i++){
            for(int j=0;j<=col-8;j++){
                int count = 0;//바꿔야 할 개수
                boolean b = board[i][j];//첫번째 타입 색
                for(int k=i;k<i+8;k++){
                    for(int l=j;l<j+8;l++){
                        if(board[k][l]!=b) count++;//만약 있어야 할 색과 다르면 카운트 증가
                        b = !b;// 다음 있어야 할 색깔로 변경
                    }
                    b=!b;//이거도 마찬가지
                }
                count = Math.min(count,64-count);//하는 이유는 반대 색깔로 바꿨을 때도 비교하려고
                min = Math.min(min,count);//기존 최솟값과 비교해서 더 작은 값으로
            }
        }
        System.out.println(min);
    }
}