import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        var array = new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            int num = sc.nextInt();
            sum += num;
            array.add(num);
        }
        Collections.sort(array);
        System.out.println(sum/5);
        System.out.println(array.get(2));
    }
}