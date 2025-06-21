package bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 컵홀더 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        int ccnt = 1;
        for(int i=0; i<n; i++) {
            ccnt++;
            char now = arr[i];
            if(now == 's') i++;
            else  i+= 2;
        }
        System.out.println(Math.min(ccnt, n));
    }
}
