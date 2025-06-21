package bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 영의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int count = 0;

            for(int j=n; j<=n; j++) {
                char temp[] = String.valueOf(j).toCharArray();
                for(int k=0; k<temp.length; k++) {
                    if(temp[k]=='0') count++;
                }
            }
            System.out.println(count);
        }
    }
}
