import java.util.*;
public class Main{//뭐라도 해서 검색 조건 만들려다가 실패하고 그냥 0부터 쉣
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(search(n));
    }

    static int search(int n){
        int test = 0;
        while(test<=n){
            int j = test;
            int sum = 0;
            while(j!=0){
                sum+=j%10;
                j/=10;
            }
            if(test+sum==n){
                return test;
            }else{
                test++;
            }
        }
        return 0;
    }
}