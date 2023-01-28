import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int totalNum = sc.nextInt();
        int num[] = new int[totalNum];
        for(int i=0;i<num.length;i++){
            num[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        for(int i=0;i<num.length;i++){
            if(num[i]==n) count++;
        }
        System.out.println(count);
    }
}