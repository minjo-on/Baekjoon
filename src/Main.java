import java.util.*;
public class Main{
    static StringBuilder sb = new StringBuilder();
    static void hanoiTower(int n, int start, int mid, int last){
        if(n==1){
            sb.append(start+" "+last+"\n");
            return;
        }
        hanoiTower(n-1,start,last,mid);
        sb.append(start+" "+last+"\n");
        hanoiTower(n-1,mid,start,last);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sb.append((int)(Math.pow(2,n)-1)+"\n");
        hanoiTower(n,1,2,3);
        System.out.print(sb);
    }
}