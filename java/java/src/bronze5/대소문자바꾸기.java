package bronze5;

import java.util.Scanner;

public class 대소문자바꾸기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] text = sc.nextLine().toCharArray();
        //sc.nextLine() 한줄 전체에 문자열 입력을 받습니다
        //toCharArray()는 문자열을 한글자씩 쪼개서 배열을 만듭니다 char[]
        //영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤,
        //대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램
        for (int i=0; i<text.length; i++) {
            char temp = text[i];
            if(temp >= 'a' && temp <= 'z') {
                //아스크코드 소문자 a는 97, 대문자는 65
                //아스키코드 문자 대소문자할때 숫자값으로 입력해서 조건문을 만든다
                System.out.print((char)(temp-32));
            }else {
                System.out.print((char)(temp+32));
            }
        }
    }
}
