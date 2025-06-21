package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OX퀴즈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            char[] temp = br.readLine().toCharArray();
            int score = 0;
            int result = 0;
            for(int j=0; j<temp.length; j++) {
                if(temp[j] == 'O') {
                    score++;
                    result += score;
                }else {
                    score = 0;
                }
            }
            System.out.println(result);
        }
    }
}
