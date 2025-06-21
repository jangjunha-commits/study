package bronze3;

import java.util.Scanner;

public class 별찍기5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) { //i숫자가 높을수록 공백이 감소합니다
            // 공백 출력: N - i 개
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            // 별 출력: (2 * i - 1) 개
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // 줄바꿈
            System.out.println();
        }
    }
}
