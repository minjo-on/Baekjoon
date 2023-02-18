import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        int first = 0;
        int count = 1;
        if(n>1){
            /*case 5가지임
            1. xxxx666xx
            2. xxxx666
            3. xxxx66
            4. xxxx6
            5. xxxx    */
            while(true){
                //first가 ~666~일때
                if(first%10000/10==666&&first%10!=6){
                    for(int i=0;i<1000;i++){
                        if(count==n){
                            System.out.println(first*1000+num);
                            return;
                        }
                        count++;
                        num++;
                    }
                    first++;
                } else if (first%1000==666) {//first가 ~666일때
                    num=0;
                    for(int i=0;i<1000;i++){
                        if(count==n){
                            System.out.println(first*1000+num);
                            return;
                        }
                        count++;
                        num++;
                    }
                    first++;
                } else if (first%100==66) {//first가 ~66일때
                    num=600;
                    for(int i=0;i<100;i++){
                        if(count==n){
                            System.out.println(first*1000+num);
                            return;
                        }
                        count++;
                        num++;
                    }
                    first++;
                } else if (first%10==6) {//~6일때
                    num = 660;
                    for(int i=0;i<10;i++){
                        if(count==n){
                            System.out.println(first*1000+num);
                            return;
                        }
                        count++;
                        num++;
                    }
                    first++;
                }else{//6이 아에 없을 때
                    num = 666;
                    if(count==n){
                        System.out.println(first*1000+num);
                        return;
                    }
                    count++;
                    first++;
                }
            }
        }else{
            System.out.println(666);
        }
    }
}