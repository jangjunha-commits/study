package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문자열반복 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            char[] text = st.nextToken().toCharArray();
            for(int j=0; j<text.length; j++) {
                for(int k=0; k<r; k++) {
                    System.out.println(text[j]);
                }
            }
        }
    }
}
