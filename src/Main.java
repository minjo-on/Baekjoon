import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int checkStudent[] = new int[30];
        for(int i=0;i<28;i++){
            int n = sc.nextInt();
            checkStudent[n-1]++;
        }
        for(int i =0;i<checkStudent.length;i++){
            if(checkStudent[i]==0) System.out.println(i+1);
        }
    }
}