package bronze5;

import java.util.Scanner;

public class 구구단 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //입력값
        for(int i = 1; i<10; i++) {
            System.out.println(N + " * " + i + " = " + N*i);
        }
    }
}
