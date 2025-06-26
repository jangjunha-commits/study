package 문자열;

import java.util.Scanner;

public class 염색체 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // 테스트 케이스 수
        sc.nextLine();  // 개행 처리

        for (int i = 0; i < t; i++) {
            String input = sc.nextLine();
            if (input.matches("^A[FA]*C[FA]*A$")) {
                System.out.println("Infected!");
            } else {
                System.out.println("Good");
            }
        }

        sc.close();
    }
}

