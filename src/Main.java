import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int room[][] = new int[15][15];

        //방 0층 인원수 설정
        for(int i=1;i<room[0].length;i++){
            room[0][i] = i;
        }

        //방 인원수 설정
        for(int i=1;i<15;i++){
            for(int k=1;k<15;k++){
                //각 층 1호실
                if(k==1){
                    room[i][1] = 1;
                }
                //1호실을 제외한 방들
                else{
                    int sum = 0;
                    for(int j=1;j<=k;j++){
                        sum+=room[i-1][j];
                    }
                    room[i][k] = sum;
                }
            }
        }

        //검색할 경우의 수 입력
        int c = sc.nextInt();

        //결과값 목록 배열 설정
        int result[] = new int[c];

        //검색할 층과 방 입력 후 결과를 배열에 저장
        for(int i = 0; i<result.length;i++){
            int k = sc.nextInt();
            int n = sc.nextInt();
            result[i] = room[k][n];
        }
        // 결과 값 출력
        for(int i=0;i< result.length;i++){
            System.out.println(result[i]);
        }
    }
}