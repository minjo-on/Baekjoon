import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double credit = 0;
        double sum = 0;
        for(int i=0;i<20;i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
            st.nextToken();
            double d = Double.parseDouble(st.nextToken());
            String s = st.nextToken();
            sum += d;
            if (s.equals("A+")) {
                credit += d * 4.5;
            } else if (s.equals("A0")) {
                credit += d * 4;
            } else if (s.equals("B+")) {
                credit += d * 3.5;
            } else if (s.equals("B0")) {
                credit += d * 3;
            } else if (s.equals("C+")) {
                credit += d * 2.5;
            } else if (s.equals("C0")) {
                credit += d * 2;
            } else if (s.equals("D+")) {
                credit += d * 1.5;
            } else if (s.equals("D0")) {
                credit += d;
            } else if (s.equals("P")) {
                sum -= d;
            }
        }
        System.out.printf("%.6f",credit/sum);
    }
}