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
        var array = new ArrayList<Integer>();
        while(true){
            int n = sc.nextInt();
            if(n==0)break;
            array.add(n);
        }

        for(int i=0;i<array.size();i++){
            int num = array.get(i);
            int count = 0;
            for(int k=num+1;k<=2*num;k++){
                if(checkNum(k)) count++;
            }
            System.out.println(count);
        }
    }
}