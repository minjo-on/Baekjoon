import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int s = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr.add(i);
                count++;
            }
        }
        if(s>count){
            System.out.println(0);
        }else System.out.println(arr.get(s-1));
    }
}