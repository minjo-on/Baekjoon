import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            result.append(s.charAt(0)+""+s.charAt(s.length()-1)+"\n");
        }
        System.out.println(result);

    }
}