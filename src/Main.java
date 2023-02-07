import java.util.*;
import java.io.*;
public class Main{//시간초과 나며 ㄴ뒤 진다 어? 됐다 ㅅ발 제발 제발 됐다ㅏㅏ아아앙아
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(array);
        for(int i=0;i<n;i++){
            s.append(array[i]).append('\n');
        }
        System.out.println(s);
    }
}