package bronze4;

import java.util.Scanner;

public class 뜨거운붕어빵 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 행 수
        //int M = sc.nextInt();  // 열 수
        sc.nextLine(); // 개행 문자 소비

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine(); //한줄읽기
            String reversed = new StringBuilder(line).reverse().toString(); //뒤집기
            System.out.println(reversed);
        }
    }
}

