package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소수팰린드룸 {
    public static void main(String[] args) throws IOException {
        //어떤 수와 그 수의 숫자 순서를 뒤집은 수가 일치하는 수를 팰린드롬
        //어떤 수 N (1 ≤ N ≤ 1,000,000)이 주어졌을 때,
        //N보다 크거나 같고, 소수이면서 팰린드롬인 수 중에서, 가장 작은 수를 구하는 프로그램
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=n; ;i++) {
            if(isPalindrome(i) && isPrime(i)) {
                System.out.println(i);
                break;
            }
        }
    }
    //팰린드 룸확인
    private static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int i=0, j=s.length() - 1;
        while(i<j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
    //소수 판정
    private static boolean isPrime(int x) {
        if (x<2) return false;
        int limit = (int)Math.sqrt(x);
        for(int i=2; i<limit; i++) {
            if(x%i==0) return false;
        }
        return true;
    }
}
