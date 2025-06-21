package bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 오르막길 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a[] = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        int max = 0;
        int temp = 0;
        for(int i=1; i<n; i++) {
            if(a[i] > a[i-1]){
                temp+=a[i]-a[i-1];
                if(max < temp) {
                    max = temp;
                }else {
                    temp = 0;
                }
            }
        }
        System.out.println(max);
    }
}
