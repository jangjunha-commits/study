package bronze3;

import java.util.Scanner;

public class 최대값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;       // 최댓값
        int row = 0;       // 최댓값의 행 위치
        int col = 0;       // 최댓값의 열 위치

        for (int i = 0; i < 9; i++) {           // 9행
            for (int j = 0; j < 9; j++) {       // 9열
                int num = sc.nextInt();
                if (num > max) {
                    max = num;
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println(max);
        // 위치는 문제 요구사항에 따라 1부터 출력
        System.out.println((row + 1) + " " + (col + 1));
    }
}

