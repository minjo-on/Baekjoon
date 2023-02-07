import java.util.*;
public class Main{
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        var array = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            array.add(num);
        }
        Collections.sort(array);
        for(int i=0;i<n;i++){
            s.append(array.get(i)).append('\n');
        }
        System.out.println(s);
    }
}