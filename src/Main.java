import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        var array = new ArrayList<Integer>();
        for(int i=0;i<s.length();i++){
            array.add(s.charAt(i)-'0');
        }
        Collections.sort(array);
        Collections.reverse(array);
        for(int i=0;i<array.size();i++){
            System.out.print(array.get(i));
        }
    }
}