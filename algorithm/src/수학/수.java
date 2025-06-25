package 수학;

import java.util.*;

public class 수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        int maxNum = 0;
        for (int i = 0; i < K; i++) maxNum = maxNum * 10 + 9;
        maxNum = Math.max(maxNum, M);

        // 1. 소수 판별 (에라토스테네스의 체)
        boolean[] isPrime = sieve(maxNum);
        Set<Integer> primeSet = new HashSet<>();
        for (int i = 2; i <= maxNum; i++) {
            if (isPrime[i]) primeSet.add(i);
        }

        // 2. 순열로 K자리 수 생성
        boolean[] used = new boolean[10];
        List<Integer> digits = new ArrayList<>();
        int[] count = {0};

        dfsBuild(0, K, M, used, digits, isPrime, primeSet, count);

        System.out.println(count[0]);
    }

    static void dfsBuild(int depth, int K, int M,
                         boolean[] used, List<Integer> digits,
                         boolean[] isPrime, Set<Integer> primeSet, int[] count) {
        if (depth == K) {
            if (digits.get(0) == 0) return; // 맨 앞 0 제외
            int N = 0;
            for (int d : digits) N = N * 10 + d;

            // 조건 2 체크
            int temp = N;
            while (temp % M == 0) temp /= M;
            boolean cond2 = false;
            for (int p : primeSet) {
                if (p > temp) break;
                if (temp % p == 0) {
                    int q = temp / p;
                    if (primeSet.contains(q)) cond2 = true;
                    break;
                }
            }
            if (!cond2) return;

            // 조건 1 체크
            boolean cond1 = false;
            for (int p : primeSet) {
                if (p > N) break;
                int q = N - p;
                if (q > 1 && primeSet.contains(q) && q != p) {
                    cond1 = true;
                    break;
                }
            }
            if (cond1) count[0]++;

            return;
        }

        for (int d = 0; d <= 9; d++) {
            if (!used[d]) {
                used[d] = true;
                digits.add(d);
                dfsBuild(depth + 1, K, M, used, digits, isPrime, primeSet, count);
                used[d] = false;
                digits.remove(digits.size() - 1);
            }
        }
    }

    static boolean[] sieve(int N) {
        boolean[] isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}

