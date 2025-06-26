package 문자열;

import java.util.Scanner;

public class 그룹단어체커 {
    public static void main(String[] args) {
        //abc -> 그룹단어
        //abca -> 그룹단어 아님 a가 먼저나오고 나중 a면 아니다
        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //단어 개수
        int count = 0;

        for(int i=0; i<n; i++) {
            String id = sc.next();
            if(isGropWord(word)) {
                count++;
            }
        }
        System.out.println(count);
    }
    private static boolean isGropWord(String word) {
        boolean[] seen = new boolean[26]; //알파벳 출현여부
        char prev = 0;

        for(int i=0; i<word.length(); i++) {
            char curr = word.charAt(i);

            // 이전문자와 다르다면
            if(curr != prev) {
                //이전에 들장한적 있다면 그룹단어가 아님
                if(seen[curr - 'a']) {
                    return false;
                }
                seen[curr - 'a'] = true; //현재 문자 기록
            }
            prev = curr;
        }
        return true;
        */
    }
}
