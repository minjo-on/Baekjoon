import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        var array = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            array.add(num);
        }
        Collections.sort(array);
        System.out.println(array.get(n-p));
    }
}