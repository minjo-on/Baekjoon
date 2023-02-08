import java.sql.Array;
import java.util.*;
public class Main{//실행은 되나 시간초과
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        var list = new ArrayList<Integer>();
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i : arr){
            if(!list.contains(i)) list.add(i);
        }
        Collections.sort(list);

        for(int i=0;i<n;i++){
            for(int k=0;k<list.size();k++){
                if(arr[i] == list.get(k)){
                    System.out.print(k+" ");
                    break;
                }
            }
        }
    }
}