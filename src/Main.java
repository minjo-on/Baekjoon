import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }
        Arrays.sort(arr,(a,b)-> {
            if (a.length() != b.length()) return a.length() - b.length();//문자열 길이 다르면 짧은거
            else return a.compareTo(b);//같으면 알파벳 비교
        });
        for(int i=0;i<n;i++){
            if(i>0 && arr[i].equals(arr[i-1])) continue;
            System.out.println(arr[i]);
        }

    }
}