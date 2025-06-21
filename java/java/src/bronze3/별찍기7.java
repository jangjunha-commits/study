package bronze3;

import java.util.Scanner;

public class 별찍기7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //5입력
        // 윗부분 (피라미드)
        for (int i = 1; i <= N; i++) { //공백 최댓닶 4
            // 공백
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            // 별
            for (int k = 1; k <= 2 * i - 1; k++) { //별 최댓값 9
                System.out.print("*");
            }
            System.out.println();
        }

        // 아랫부분 (역피라미드)
        for (int i = 1; i <= N - 1; i++) {
            // 공백
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // 별
            for (int k = 1; k <= 2 * (N - i) - 1; k++) { //*감소 내리는 값
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

