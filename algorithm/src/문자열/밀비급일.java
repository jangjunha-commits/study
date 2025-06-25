package 문자열;

import java.util.Scanner;

public class 밀비급일 {
    public static void main(String[] args) {
        //쪽지발견 -> 암호 -> 뒤집히면 해독이 됩니다
        //암호 해독프로그램 작성
        //END 주어짐 -> 해독x
        //사용 방법 -> while문, StringBuilder
        Scanner sc = new Scanner(System.in);
        while(true) {
            String line = sc.nextLine();
            if(line.equals("END")) { //문자열 비교 equals -> END 종료
                break;
            }
            String reversed = new StringBuilder(line).reverse().toString(); //가변
            System.out.println(reversed);
            //String은 불변이기 때문에 문자열 수정 새로문자열 객체를 생성합니다
            //StringBuilder는 가변이기 때문에 문자열을 직접수정할수 있다
            //그래서 문자열이 뒤집하면 해독 -> StringBuilder()
        }
    }
}
