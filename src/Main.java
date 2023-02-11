import java.sql.Array;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];//숫자 목록
        HashMap<Integer,Integer> map = new HashMap<>();//원래 숫자들을 key, 압축한 값들을 value값에

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int[] sortArr = arr.clone();//숫자 작은순부터 정렬할 배열
        Arrays.sort(sortArr);

        int count = 0;//압축한 값

        for(int i:sortArr){
            if(!map.containsKey(i))//정렬 순서대로 넣는데 해시맵에 없으면?
                map.put(i,count++);//키와 압축한 값을 대입
        }

        StringBuffer sb = new StringBuffer();
        for(int i=0;i<n;i++){
            sb.append(map.get(arr[i])+" ");
        }
        System.out.println(sb);
    }
}