package bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평균은넘겠지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(str.nextToken());
            int s = 0;
            int p[] = new int[n];
            for(int j=0; j<n; j++) {
                p[j] = Integer.parseInt(str.nextToken());
                s += p[j];
            }
            double avg = s/(double)n;
            int over_age = 0;
            for(int j=0; j<n; j++) {
                if(avg < p[j]) over_age++;
            }
            System.out.println(Math.round(over_age/(double)n*100*1000)/1000.0+"%");
        }
    }
}
