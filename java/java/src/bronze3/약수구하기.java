package bronze3;

import java.util.Scanner;

public class 약수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 대상 수    6 - 1 2 3 6
        int K = sc.nextInt(); // K번째 약수 3 - 3번째

        int count = 0; // 몇 번째 약수인지 카운트

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) { // 약수일 때
                count++;
                if (count == K) {
                    System.out.println(i);
                    return; // 프로그램 종료
                }
            }
        }
        // 약수 개수가 K보다 작을 경우 4 - 1 2 4 / 25 - 1 5 25
        System.out.println(0);
    }
}

