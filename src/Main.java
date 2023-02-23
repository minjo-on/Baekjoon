import java.util.*;
public class Main {
    static int[] basket;
    static void rocation(int i,int j,int k){
        int temp = basket[k];
        while(basket[i]!=temp){
            for(int l=0;l<=j-k;l++){
                int num = basket[j];
                for(int m=j;m>i;m--){
                    basket[m] = basket[m-1];
                }
                basket[i] = num;
            }
        }
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        basket = new int[n];
        for(int l=0;l<n;l++){
            basket[l] = l+1;
        }
        for(int l=0;l<m;l++){
            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;
            int k = sc.nextInt()-1;
            if(i!=k) rocation(i,j,k);
        }
        for(int l=0;l<basket.length;l++){
            sb.append(basket[l]+" ");
        }
        System.out.println(sb);
    }
}