package 문자열;

import java.util.Scanner;
import java.util.Stack;

public class 단어뒤집기2 {
    public static void main(String[] args) {
        //알파벳 소문자('a'-'z'), 숫자('0'-'9'), 공백(' '), 특수 문자('<', '>')로만 이루어져 있다.
        //문자열의 시작과 끝은 공백이 아니다.
        //'<'와 '>'가 문자열에 있는 경우 번갈아가면서 등장하며, '<'이 먼저 등장한다. 또, 두 문자의 개수는 같다.
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        boolean inTag = false;
        for(int i=0; i<input.length(); i++) {
            char c = input.charAt(i);

            if(c=='<') {
                //스택있는 단어 뒤집기
                while(!stack.isEmpty()) {
                    result.append(stack.pop());
                }
                inTag = true;
                result.append(c);
            }else if(c == '>') {
                inTag = false;
                result.append(c);
            }else {
                if (c == ' ') {
                    //단어가 끝났을때 스택비우기
                    while(!stack.isEmpty()) {
                        result.append(stack.pop());
                    }
                    result.append(' ');
                }else {
                    stack.push(c);
                }
            }
        }
        //남은 스택관리
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        System.out.println(result);
    }
}
