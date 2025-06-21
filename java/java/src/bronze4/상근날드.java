package bronze4;

import java.util.Scanner;

public class 상근날드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //상덕버거
        int b = sc.nextInt(); //중덕버거
        int c = sc.nextInt(); //하덕버거
        int min_f = Math.min(a, Math.min(b,c)); //버거중에 싼거
        int d = sc.nextInt(); //콜라
        int f = sc.nextInt(); //사이드
        int min_s = Math.min(d,f); //싼음요
        System.out.println(min_f + min_s - 50); //싼거 고른것을 -50한다
    }
}
