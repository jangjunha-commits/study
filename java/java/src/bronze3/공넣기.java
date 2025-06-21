package bronze3;

import java.util.Scanner;

public class 공넣기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int B[] = new int[n+1];
        for(int t=0; t<m; t++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for (int index=i; index<=j; index++) {
                B[index] = k;
            }
        }
        for(int i=1; i<=n; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
