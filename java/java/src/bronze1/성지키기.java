package bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 성지키기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int rcnt[] = new int[n];
        int ccnt[] = new int[m];
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++) {
                String now = st.nextToken();
                if(now.equals("X")) {
                    rcnt[i]++;
                    ccnt[j]++;
                }
            }
        }
        int rResult = 0;
        int cResult = 0;
        for(int i=0; i<n; i++) {
            if(rcnt[i]==0) rResult++;
        }
        for(int j=0; j<n; j++) {
            if(ccnt[j]==0) cResult++;
        }
        System.out.println(Math.max(rResult, cResult));
    }
}
