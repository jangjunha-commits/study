package bronze3;

import java.util.Scanner;

public class 세탁소사장동혁 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  // 테스트 케이스 개수

        for (int i = 0; i < T; i++) {
            int change = sc.nextInt();  // 거스름돈 입력

            int quarters = change / 25;
            change %= 25;

            int dimes = change / 10;
            change %= 10;

            int nickels = change / 5;
            change %= 5;

            int pennies = change;

            System.out.println(quarters + " " + dimes + " " + nickels + " " + pennies);
        }
    }
}

