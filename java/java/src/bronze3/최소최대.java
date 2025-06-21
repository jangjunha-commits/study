package bronze3;

import java.util.Scanner;

public class 최소최대 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();  // 정수 개수 입력
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();  // 정수 입력
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        System.out.println(min + " " + max);  // 결과 출력
    }
}

