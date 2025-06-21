package bronze3;

import java.util.Scanner;

public class 별찍기16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            // 공백 출력
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            // 별 출력 (별과 별 사이 공백 포함)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                if (j < i) {
                    System.out.print(" ");
                }
            }

            System.out.println(); // 줄 바꿈
        }
    }
}

