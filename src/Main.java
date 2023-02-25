import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Long n = Long.parseLong(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append(n*n).append("\n").append(2);
        System.out.println(sb);
    }
}