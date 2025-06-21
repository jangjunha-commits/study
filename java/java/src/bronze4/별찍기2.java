package bronze4;

import java.util.Scanner;

public class 별찍기2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            // 공백 출력 (n - i개)
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 별 출력 (i개)
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

