package 수학;

import java.io.*;
import java.util.StringTokenizer;

public class LCM {
    public static long gcd(long a, long b) {
          while(b!=0) {
              long temp = a%b;
              a=b;
              b=temp;
          }
          return a;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<=n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            long g = gcd(a,b);
            long lcm = (a/b)*b;
            bw.write(lcm+"\n");
        }
    }
}
