package 수학;

import java.util.Scanner;
public class 소수 {
    public static void main(String[] args) {
        //자연수 m과 n이 주어질때 m이상 n이하 소수인것 골라 소수의 합과 최솟값을 찾는 프로그램
        //60이상 100이하 -> 소수 값들을 합 620 최솟값은 61
        //m이상 n이하 자연수 -> 소수 없을때 -1
        int A[] = new int[10001];
        for(int i=2; i<10001; i++) {
            A[i] = i;
        }
        for(int i=2; i<Math.sqrt(10001); i++) {
            if(A[i]==i) {
                //소수이면
                for(int j=2; j<10001; j++) {
                    A[j] = 0;
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int sum = 0;
        int min = 0;
        for(int i=n; i>=m; i--) {
            sum += A[i];
            if(A[i] != 0) {
                min = A[i];
            }
        }
        if(sum == 0) {
            System.out.println(-1);
        }else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
