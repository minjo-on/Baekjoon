import java.util.*;
class MergeArray{//뭔 예제를 파이썬만 주냐 바꾸느라 고생함
    int arr[];
    private int tmp[];
    private int goal;
    private int cnt;
    MergeArray(int n,int goal){
        arr = new int[n];
        tmp = new int[n];
        this.goal=goal;
        cnt = 0;
    }
    public void merge_sort(int p, int r) { // A[p..r]을 오름차순 정렬한다.
        int q;
        if (p < r){
            q = (p + r) / 2;       //q는 p, r의 중간 지점
            merge_sort(p, q);      //전반부 정렬
            merge_sort(q + 1, r);  //후반부 정렬
            merge(p, q, r);        //병합
        }
    }

    //A[p..q]와 A[q+1..r]을 병합하여 A[p..r]을 오름차순 정렬된 상태로 만든다.
//A[p..q]와 A[q+1..r]은 이미 오름차순으로 정렬되어 있다.
    private void merge(int p,int q,int r) {
        int i = p;
        int j = q + 1;
        int t = 0;
        while (i <= q && j <= r) {
            if (arr[i] <= arr[j]) tmp[t++] = arr[i++];//tmp[t] <- A[i]; t++; i++;
            else tmp[t++] = arr[j++];//tmp[t] <- A[j]; t++; j++;
        }
        while (i <= q) tmp[t++] = arr[i++]; //왼쪽 배열 부분이 남은 경우

        while (j <= r) tmp[t++] = arr[j++];//오른쪽 배열 부분이 남은 경우

        i = p; t = 0; //초기화
        while (i <= r){
            arr[i++] = tmp[t++];
            cnt++;
            if(cnt==goal){
                System.out.println(arr[i-1]);
                System.exit(0);
            }
        }
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        MergeArray m = new MergeArray(n,k);

        for(int i=0;i<n;i++){
            m.arr[i] = sc.nextInt();
        }
        m.merge_sort(0, n-1);
        System.out.println(-1);
        sc.close();
    }
}