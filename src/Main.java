import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arr = new ArrayList<>();
        while(true){
            int n = sc.nextInt();
            arr.add(n);
            if(n==-1) break;
        }
        int num = 0;
        while(true){
            int n = arr.get(num);
            num++;
            if(n==-1) break;
            int sum = 0;
            for(int i=1;i<=n/2;i++) {
                if(n%i==0){
                    sum+=i;
                    if(i==n/2) sb.append(i);
                    else sb.append(i+" + ");
                }
            }
            if(sum==n){
                System.out.println(n+" = "+sb);
            }
            else{
                System.out.println(n + " is NOT perfect.");
                sb.setLength(0);
            }
        }
    }
}