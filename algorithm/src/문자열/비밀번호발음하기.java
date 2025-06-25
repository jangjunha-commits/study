package 문자열;

import java.util.Scanner;

public class 비밀번호발음하기 {
    public static void main(String[] args) {
        //좋은 비밀번호
        //모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
        //모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
        //같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.
        //마지막 테스트 케이스는 end이며,
        //패스워드는 한글자 이상 20글자 이하의 문자열이다
        //대문자 포함되지 않는다
        Scanner sc = new Scanner(System.in);
        while(true){
            String pw = sc.nextLine();
            if(pw.equals("end")) break; //마지막 테스트는 end

            if(isAcceptable(pw)) {
                System.out.println("<"+ pw + "> is acceptable");
            }else {
                System.out.println("<"+ pw + "> is not acceptable");
            }
        }
    }
    private static boolean isAcceptable(String pw) {
        boolean hasVowel = false;
        int vowelCount = 0, consonantCount = 0;
        char prev = 0;

        for(int i=0; i<pw.length(); i++) {
            char c = pw.charAt(i);
            // 모음인지 판별
            boolean isVowel = "aeiou".indexOf(c) != -1;

            // 조건 1: 모음 하나 이상
            if (isVowel) {
                hasVowel = true;
                vowelCount++;
                consonantCount = 0;
            } else {
                consonantCount++;
                vowelCount = 0;
            }

            // 조건 2: 모음 or 자음 3개 연속 불가
            if (vowelCount == 3 || consonantCount == 3) {
                return false;
            }

            // 조건 3: 같은 글자 연속 2개 불가 (ee, oo는 예외)
            if (i > 0 && c == prev && !(c == 'e' || c == 'o')) {
                return false;
            }

            prev = c;
        }

        return hasVowel; // 조건 1 만족 여부
        }
}
