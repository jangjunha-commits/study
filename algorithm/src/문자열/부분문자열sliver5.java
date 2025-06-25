package 문자열;

import java.util.Scanner;

public class 부분문자열sliver5 {
    public static void main(String[] args) {
        //문자열 순서가 sequence인지
        //isSubsequenc() 이용
        //문자열이 두 부분 수열인지 확인하기
        //a=seq -> b= sequence -> yes s -> e -> q
        //a=sub -> b=abstruct -> no b -> s -> u
        //입력된 s와 t의 순서대로 s가 t의 부분 문자열인 경우
        //Yes라 출력하고 아닐 경우 No라고 출력한다.
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String s = sc.next(); //sequence
            String t = sc.next(); //subsequence

            if (isSubsequence(s, t)) { //private static boolean도 사용해야함
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
    private static boolean isSubsequence(String s, String t) {
        int i=0, j=0;
        while(i < s.length() && j < t.length()) {
            if(s.charAt(i) == t.charAt(j)) {
                i++; //s의 다음 문자 이동
            }
            j++; //t는 무조건 다음문자 이동
        }
        return i == s.length(); //s의 모든 문자 순서대로 찾았으면 true
    }
}
