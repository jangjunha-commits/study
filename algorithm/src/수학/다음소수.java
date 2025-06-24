package 수학;

import java.util.Scanner;

public class 다음소수 {
    // 소수 판별 함수
    public static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        long sqrt = (long) Math.sqrt(n);
        for (long i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수

        while (T-- > 0) {
            long n = sc.nextLong();

            while (true) {
                if (isPrime(n)) {
                    System.out.println(n);
                    break;
                }
                n++;
            }
        }
    }
}

