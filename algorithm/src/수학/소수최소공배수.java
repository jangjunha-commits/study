package 수학;

import java.util.*;

public class 소수최소공배수 {
    static boolean[] isPrime = new boolean[1000001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //소수 판별 : 에라토스테네스 체
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for(int i=2; i*i<=1000001; i++) {
        if(isPrime[i]) {
            for (int j = i * i; j <= 1000001; j += i) {
                   isPrime[i] = false;
            }
          }
        }
        //중복없는 소수 저장
        Set<Integer> primes = new HashSet<>();

        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            if (isPrime[num]) {
                primes.add(num);
            }
        }
        if (primes.isEmpty()) {
            System.out.println(-1);
            return;
        }
        // 소수들의 LCM 계산
        long lcm = 1;
        for (int prime : primes) {
            lcm = lcm(lcm, prime);
        }

        System.out.println(lcm);
        }
        // 최대공약수 (유클리드 호제법)
        static long gcd(long a, long b) {
          while (b != 0) {
              long tmp = a % b;
               a = b;
               b = tmp;
           }
           return a;
       }
       // 최소공배수
       static long lcm(long a, long b) {
           return a / gcd(a, b) * b;
       }
}
