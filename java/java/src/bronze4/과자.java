package bronze4;

import java.util.Scanner;

public class 과자 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = k*n-m;
        if(result < 0) {
            result = 0;
        }
        System.out.println(result);
    }
}
