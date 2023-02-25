import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int first = 0;
        int last = s.length()-1;

        while(first<=last){
            if(s.charAt(first)==s.charAt(last)){
                first++;
                last--;
            }else{
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}