package bronze1;

import java.util.Scanner;

public class 피보나치2 {
    public static void main(String[] args) {
        long f[] = new long[91];
        f[0] = 0;
        f[1] = 1;
        for(int i=0; i<=90; i++) {
            f[i] = f[i-2] + f[i-1];
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f[n]);
    }
}
