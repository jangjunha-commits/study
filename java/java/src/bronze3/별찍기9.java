package bronze3;

import java.util.Scanner;

public class 별찍기9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 윗부분 (역삼각형)
        for (int i = 0; i < N; i++) {
            // 공백 출력
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 1; j < 2 * (N - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 아랫부분 (삼각형)
        for (int i = 1; i < N; i++) {
            // 공백 출력
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

