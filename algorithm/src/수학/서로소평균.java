package 수학;

import java.io.*;
import java.util.*;

class 서로소평균 { // 백준에서는 public class Main 사용하면 안 됨
    // 최대공약수 (GCD) 함수 - 유클리드 호제법
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 배열 크기

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int X = Integer.parseInt(br.readLine()); // 기준 수

        long sum = 0;
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (gcd(A[i], X) == 1) {
                sum += A[i];
                count++;
            }
        }

        double avg = (double) sum / count;
        System.out.printf("%.6f\n", avg);
    }
}

