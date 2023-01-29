import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        // a 숫자열을 역순으로
        StringBuffer buffer = new StringBuffer(a);
        a = buffer.reverse().toString();
        String b = sc.next();
        // b 숫자열을 역순으로
        buffer = new StringBuffer(b);
        b = buffer.reverse().toString();

        //문자배열 공간 생성
        int[] ca = new int[a.length()];
        int[] cb = new int[b.length()];

        //더 긴 숫자 설정
        int max = Math.max(a.length(),b.length());

        //입력
        for(int i=0;i<a.length();i++){
            ca[i] = a.charAt(i) - '0';
        }
        for(int i=0;i<b.length();i++){
            cb[i] = b.charAt(i) - '0';
        }

        int carry = 0; //올림수
        int[] result = new int[max+1]; //결과 값 배열

        for(int i=0;i<max;i++){
            int res = 0;//한자릿수마다 계산해서 결과 값을 여기다가 넣음
            if(i>=ca.length){//b의 숫자 자리수가 더 클때
                res = carry + cb[i];
            }else if(i>=cb.length){//a의 숫자 자리수가 더 클때
                res = carry + ca[i];
            }else{//a,b 둘다 값이 있을 때
                res = ca[i] + cb[i] + carry;
            }
            if(res>9){ //올림수가 있으면 1
                carry = 1;
            }else carry = 0; //없으면 0
            result[i] = res%10;//일의 자리수만 추가
        }
        result[max] = carry; // 마지막에 올림수가 있을 수도 있으니 넣어줌

        StringBuffer re = new StringBuffer(); //출력할 결과값
        for(int i= result.length-1;i>=0;i--){
            re.append(result[i]);
        }

        if(re.charAt(0)=='0') re.deleteCharAt(0); // 첫자리가 0이면 제거
        System.out.println(re);
    }
}