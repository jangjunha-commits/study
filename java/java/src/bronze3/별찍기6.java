package bronze3;

import java.util.Scanner;

public class 별찍기6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) { //i가 높을수록 공백이 많아집니다
            // 공백 출력
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int k = 0; k < 2 * (N - i) - 1; k++) {
                System.out.print("*");
            }

            // 줄바꿈
            System.out.println();
        }
    }
}

