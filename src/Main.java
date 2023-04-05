import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[3];
        int[] y = new int[3];
        int result_x;
        int result_y;
        
        for(int i=0;i<3;i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        if(x[0]==x[1]){
            result_x = x[2];
        } else if (x[1]==x[2]) {
            result_x = x[0];
        }else{
            result_x = x[1];
        }
        if(y[0]==y[1]){
            result_y = y[2];
        } else if (y[1]==y[2]) {
            result_y = y[0];
        }else{
            result_y = y[1];
        }

        System.out.println(result_x+" "+result_y);
    }
}