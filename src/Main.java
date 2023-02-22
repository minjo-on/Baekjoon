import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][]arr = new char[5][];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<5;i++){
            String s = sc.nextLine();
            arr[i] = new char[s.length()];
            for(int j=0;j<s.length();j++){
                arr[i][j] = s.charAt(j);
            }
        }
        int length = 0;
        for(int i=0;i<5;i++){
            if(length<arr[i].length) length = arr[i].length;
        }

        for(int i=0;i<length;i++){
            for(int j=0;j<5;j++){
                if(arr[j].length<=i){
                    continue;
                }else sb.append(arr[j][i]);
            }
        }
        System.out.println(sb);
    }
}