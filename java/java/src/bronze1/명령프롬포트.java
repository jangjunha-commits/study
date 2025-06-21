package bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 명령프롬포트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] text = new char[3][];
        for(int i=0; i<n; i++) {
            text[i] = br.readLine().toCharArray();
        }

        for(int i=0; i<text[0].length; i++) {
            char now = text[0][i];
            boolean same = true;
            for(int j=1; j<n; j++) {
                if(now != text[j][i]) {
                    same = false;
                    break;
                }
            }
            if(same) System.out.println(now);
            else System.out.println('?');
        }
    }
}
