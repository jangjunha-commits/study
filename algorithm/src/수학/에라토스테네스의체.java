package 수학;

import java.io.*;
import java.util.*;

public class 에라토스테네스의체 {
    // gcd 계산 (유클리드 호제법)
    static long gcd(long a, long b) {
        while (b != 0) {
            long tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            long[] arr = new long[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Long.parseLong(st.nextToken());
            }

            long sum = 0;
            // 모든 서로 다른 두 수 (i < j)에 대해 GCD 계산
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    sum += gcd(arr[i], arr[j]);
                }
            }
            sb.append(sum).append('\n');
        }

        System.out.print(sb.toString());
    }
}

