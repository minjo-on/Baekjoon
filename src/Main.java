import java.util.*;
public class Main{
    static int count;//몇번 재귀했는지
    static int recursion(String s , int i, int r){//문자열 체크
        count++;//재귀한 횟수만큼 추가
        if(i>=r) return 1;//팰린드롬이면 1
        else if(s.charAt(i)!=s.charAt(r)) return 0;//아니면 0
        else return recursion(s,i+1,r-1);//아직 결정이 안됐으면 다음 문자 검사
    }
    static int isPalindrome(String s){//
        return recursion(s,0,s.length()-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//검사할 문자열 갯수
        sc.nextLine();
        String[] s = new String[n];//검사할 문자열 배열
        HashMap<String,String> map = new HashMap<>();//검사할 문자열을 key, 팰린드롬 결과와 몇번 재귀했는지를 문자열로 붙여서 value
        for(int i=0;i<n;i++){
            count = 0;//초기화
            s[i] = sc.nextLine();
            map.put(s[i],isPalindrome(s[i])+" "+count);
        }
        for(String i:s){
            System.out.println(map.get(i));
        }

    }
}