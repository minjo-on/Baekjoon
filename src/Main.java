import java.util.*;
public class Main{
    public static void main(String[] args) {
        int[][] sketch = new int[100][100];//스케치북
        int count = 0;//색칠된 공간 변수
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//색종이 개수
        for(int i=0;i<n;i++){
            int x = sc.nextInt();//색종이 x
            int y = sc.nextInt();//색종이 y
            for(int j = y;j<y+10;j++){
                for(int k =x;k<x+10;k++){
                    if(sketch[j][k]==0){//색종이 올린 부분이 없으면?
                        sketch[j][k]++;//색칠하고
                        count++;//공간 카운트 올리기
                    }

                }
            }
        }
    }
}