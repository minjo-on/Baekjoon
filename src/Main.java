import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int count = 0;
        HashMap<String,Integer> list = new HashMap<>();
        for(int i=0;i<n;i++){
            list.put(sc.next(),1);
        }
        for(int i=0;i<s;i++){
            if(list.containsKey(sc.next())) count++;
        }
        System.out.println(count);
    }
}