import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] length = new int[3];
        while (true){
            int max = 0;
            int sum = 0;
            for(int i=0;i<3;i++){
                length[i] = sc.nextInt();
                sum+=length[i];
                max = Math.max(max,length[i]);
            }
            if(sum==0) break;
            if(max>=sum-max){
                System.out.println("Invalid");
            }else{
                if (length[0]==length[1]&&length[1]==length[2]) {
                    System.out.println("Equilateral");
                }else if (length[0]==length[1]||length[1]==length[2]||length[0]==length[2]) {
                    System.out.println("Isosceles");
                }else {
                    System.out.println("Scalene");
                }
            }
        }
    }
}