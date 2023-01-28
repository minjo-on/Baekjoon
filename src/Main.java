import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int totalNum = sc.nextInt();
        int sum = 0;
        for(int i=0;i<totalNum;i++){
            int price = sc.nextInt();
            int num = sc.nextInt();
            sum += price * num;
        }
        if(total == sum) System.out.println("Yes");
        else System.out.println("No");
    }
}