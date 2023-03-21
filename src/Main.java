import java.util.Scanner;
public class Main {//왜 틀린거임
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int num1 = a*d + b*c;
        int num2 = b*d;

        while(true){
            a = gbc(num1,num2);
            if(a==1){
                System.out.print(num1+" "+num2);
                break;
            }else{
                num1 /= a;
                num2 /= a;
            }
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
}