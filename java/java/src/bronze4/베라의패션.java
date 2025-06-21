package bronze4;

import java.util.Scanner;

public class 베라의패션 {
    public static void main(String[] args) {
        //상의 1 2 3 4 5 ->N
        //하의 1 2 3 4 5 ->N-1
        //N * N-1
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N*(N-1));
    }
}
