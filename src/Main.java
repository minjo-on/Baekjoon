import java.util.*;
public class Main{//두ㅣ지게 어렵네 이거
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//입력 개수
        int sum = 0;//총합
        var array = new ArrayList<Integer>();//숫자 배열
        for(int i=0;i<n;i++){
            array.add(sc.nextInt());
            sum += array.get(i);
        }
        Collections.sort(array);
        int mode_count=0;//빈도가 몇갠지
        int mode = 0;//최빈값
        boolean flag = false;//최빈값 중 두번째 값을 찾기 위해
        for(int i=0;i<n;i++){
            int jump = 0;//같은 수 넘길 값
            int count = 1;//빈도 개수
            int value = array.get(i);//현재 검사할 값

            for(int k = i+1;k<n;k++){
                if(value != array.get(k)) break;
                count++;
                jump++;
            }
            if(count>mode_count){//최빈값인 경우
                mode = value;
                mode_count = count;
                flag = true;//첫번째를 넣었으니 true로
            }else if(count == mode_count && flag == true){//빈도가 같고 두번째로 작은 경우
                flag = false;//false로 바꿔주면서 최빈값이 변경되지 못하게
                mode = value;
            }

            i+=jump;
        }

        System.out.println(java.lang.Math.round((double)sum/ array.size()));//평균
        System.out.println(array.get(array.size()/2));//중앙값
        System.out.println(mode);//최빈값
        System.out.println(array.get(array.size()-1)-array.get(0));//범위
    }
}