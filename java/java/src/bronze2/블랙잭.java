package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 블랙잭 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int []A = new int[n];
        for(int i=0; i<n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        int max = -1;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; k<n; k++) {
                    int temp = A[i] + A[j] + A[k];
                    if(max < temp && m >= temp) {
                        max = temp;
                    }
                }
            }
        }
    }
}
