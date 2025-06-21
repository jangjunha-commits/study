package bronze2;

import java.util.Scanner;

public class 공바꾸기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int A[] = new int[n+1];
        for(int i=1; i<=n; i++) {
            A[i] = i;
        }
        for(int i=0; i<m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            int temp[] = new int[e-s+1];
            int index = 0;
            for(int j=e; j>=s; j--) {
                temp[index++] = A[j];
            }
            index = 0;
            for(int j=s; j<=e; j++) {
                A[j] = temp[index++];
            }
        }
        for(int i=1; i<=n; i++) {
            System.out.print(A[i]+" ");
        }
    }
}
