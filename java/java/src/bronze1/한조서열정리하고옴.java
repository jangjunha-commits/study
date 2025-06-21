package bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 한조서열정리하고옴 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a[] = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int maxcnt = -1; //현재까지 최고의 활찹이가 차지한수
        int cnt = 0; //현재 활잡이가 차지한 수
        int nowH = a[0]; //현재 활잡이 높이
        for(int i=0; i<n; i++) {
            if(a[i] < nowH) {
                cnt++;
            }else {
                nowH = a[i];
                if(maxcnt < cnt) {
                    maxcnt = cnt;
                }
                cnt = 0;
            }
        }
        if(maxcnt < cnt) {
            maxcnt = cnt;
        }
        System.out.println(maxcnt);
    }
}
