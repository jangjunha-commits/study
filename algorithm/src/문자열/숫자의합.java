package 문자열;

import java.util.Scanner;

public class 숫자의합 {
    public static void main(String[] args) {
        //n개 숫자 공백없이 쓰고 있다
        //숫자 모두 합하는 프로그램
        //for문
        //문자열로 해서 숫자값으로 빼기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        String numbers = sc.next();
        for(int i=0; i<n; i++) {
            sum += numbers.charAt(i) - '0';
            //charAt()안의 값을 문자'숫자' 숫자로 바꾸는 방법
        }
        System.out.println(sum);
    }
}
