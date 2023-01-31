import java.util.*;
public class Main{
    static boolean checkNum(int n){
        if(n==1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        var array = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int c = sc.nextInt();
            array.add(c);
        }

        for(int i=0;i<array.size();i++){
            int num = array.get(i);
            int a = num/2;
            int b = num/2;
            while(true){
                if(checkNum(a)&&checkNum(b)) break;
                else{
                    a--;
                    b++;
                }
            }
            System.out.print(a+" ");
            System.out.println(b);
        }
    }
}