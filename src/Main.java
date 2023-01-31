import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[9][9];
        int row=0,col=0; //배열 최댓값의 행과 열
        int max = 0;//배열 최댓값

        //입력하는 동시에 비교
        for(int i=0;i<9;i++){
            for(int k=0;k<9;k++){
                array[i][k] = sc.nextInt();
                if(array[i][k]>max){//해당 배열의 값이 이전 최댓값보다 크면?
                    max = array[i][k];// 최댓값 변경 후
                    row=i; col=k;//해당 행과 열 저장, 인덱스가 0부터 시작하니까 +1
                }
            }
        }

        //하고 출력
        System.out.println(max);
        System.out.println((row+1)+" "+(col+1));
    }
}