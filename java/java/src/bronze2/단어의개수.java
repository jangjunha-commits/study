package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 단어의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); //한줄마다 스플릿하여 토큰으로 넣어줍니다 StringTokenizer
        //readLine()에러 해결법 IOException으로 해결합니다
        System.out.println(st.countTokens());
    }
}
