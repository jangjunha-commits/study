package bronze3;

import java.util.Scanner;

public class 별찍기4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //5

        for (int i = 0; i < N; i++) {
            // 공백 출력
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int k = 0; k < N - i; k++) { //***** **** *** ** *
                System.out.print("*");
            }
            // 줄바꿈
            System.out.println();
        }
    }
}

