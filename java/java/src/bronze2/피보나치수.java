package bronze2;

import java.util.Scanner;

public class 피보나치수 {
    public static void main(String[] args) {
        int p[] = new int[21];
        p[0] = 0;
        p[1] = 1;
        for(int i=2; i<=20; i++) {
            p[i] = p[i-1] + p[i-2];
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(p[n]);
    }
}
