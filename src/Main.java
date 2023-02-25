import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {//왜 틀린거임
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(n*(n-1)/2+"\n"+2);
    }
}