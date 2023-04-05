import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x;
        int y;
        int max_x = -10001;
        int max_y = -10001;
        int min_x = 10001;
        int min_y = 10001;
        for(int i=0;i<n;i++){
            x = sc.nextInt();
            y = sc.nextInt();
            max_x = Math.max(x,max_x);
            max_y = Math.max(y,max_y);
            min_x = Math.min(x,min_x);
            min_y = Math.min(y,min_y);
        }
        if(n == 1){
            System.out.print(0);
        }else {
            System.out.print((max_x-min_x)*(max_y-min_y));
        }
    }
}