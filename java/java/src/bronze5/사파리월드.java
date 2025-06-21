package bronze5;

import java.util.Scanner;

public class 사파리월드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        //절댓값 빼기 유명도 차이
        System.out.println(Math.abs(n-m));
    }
}
