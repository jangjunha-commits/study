package 문자열;

import java.util.Scanner;

public class 복호화 {
    public static void main(String[] args) {
        //암호문의 알파벳 빈도수가 체크하면 가장 많이 빈번하게 나타내는 알파벳
        //주어진 문자가 빈번한 경우 -> ? 출력
        // 암호화하면 평문 "hello there"은 "xvssc kxvbv"가 된다
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine()); //테스트 데이터 개수
        for(int t=0; t<T; t++) {
            String line = sc.nextLine().toLowerCase(); //소문자 변환
            int[] count = new int[26];

            for(char c : line.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    count[c-'a']++;
                }
            }
            int max = -1;
            char result = '?';
            boolean isDuplicate = false;

            for(int i=0; i<26; i++) {
                if(count[i] >max) {
                    max = count[i];
                    result = (char)(i+'a');
                    isDuplicate = true;
                }
            }
            if (isDuplicate) {
                System.out.println(" ");
            }else {
                System.out.println(Character.toUpperCase(result));
            }
        }
    }
}
