package bronze4;

import java.util.Scanner;

public class 영수증 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();  // 총 금액
        int n = sc.nextInt();  // 항목 수

        int total = 0;

        for (int i = 0; i < n; i++) {
            int price = sc.nextInt();  // 개별 항목 가격
            int count = sc.nextInt();  // 개수
            total += price * count;
        }

        if (total == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

