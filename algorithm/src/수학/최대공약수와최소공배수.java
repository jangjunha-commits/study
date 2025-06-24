package 수학;

import java.util.Scanner;

public class 최대공약수와최소공배수 {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 최소공배수(LCM) = (a * b) / gcd(a, b)
    // 두수롤 곱하여 최대 공양수를 나눈다
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(lcm(A, B));
        System.out.println(gcd(A, B));
    }
}
