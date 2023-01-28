import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int count = 1;
        int max = 0;
        int a = 1;
        Scanner sc = new Scanner(System.in);
        int n[] = new int[3];
        for(int i=0;i<3;i++){
            int num = sc.nextInt();
            n[i] = num;
            if(num>max) max=num;
        }

        if(n[0]==n[1]&&n[1]==n[2]) {
            count+=2;   
        }else if(n[0]==n[1] || n[1]==n[2]){
            count++;
            a = n[1];
        }else if(n[0]==n[2]){
            count++;
            a = n[0];
        }

        switch(count){
            case 3: System.out.println(10000+max*1000); break;
            case 2: System.out.println(1000+a*100); break;
            case 1: System.out.println(max*100); break;
        }
    }
}