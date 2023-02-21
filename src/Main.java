import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append("long ");
            n-=4;
        }
        sb.append("int ");
        System.out.println(sb);
    }
}