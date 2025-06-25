package 문자열;

import java.util.Scanner;

public class 부분문자열 {
    public static void main(String[] args) {
        //문자열이 연속된 일부를 말한다
        //부분문자열 - 1 아니면 - 0
        Scanner sc = new Scanner(System.in);

        //sc.next() 구분된 단어를 읽는다 hello world -> hello만 읽고 멈춤 공백기준으로 단어를 읽는다
        //sc.nextLine() 한줄전체를 읽음 hello world 전체 다 읽는다 -> 줄바꿈 전까지 모두 읽고 반환합니다
        String s = sc.next(); //beakjoon
        String p = sc.next(); //joo
        //따라서 sc.next()는 단어를 읽는다 -> 여기서 nextLine()전체다 읽으므로
        if(s.contains(p)) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
