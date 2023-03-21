import java.util.Scanner;
public class Main {//왜 틀린거임
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(lcm(a,b));
        }

    }
    static int gbc(int a,int b){
        if(a<b){
            int temp = a;
            a = b;
            b = temp;
        }
        while (b!=0){
            int r = a%b;
            a=b;
            b=r;
        }
        return a;
    }
    static int lcm(int a,int b){
        return a*b / gbc(a,b);
    }
}