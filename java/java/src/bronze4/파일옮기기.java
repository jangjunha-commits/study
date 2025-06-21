package bronze4;

import java.util.Scanner;

public class 파일옮기기 {
    public static void main(String[] args) {
        //사과 1 오렌지 2
        //사과 3 오렌지 4
        // 2+3 -> 5
        // 1+4 -> 5
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //사과
        int b = sc.nextInt(); //오렌지
        int c = sc.nextInt(); //사과2
        int d = sc.nextInt(); //오렌지2

        //a b
        //c d
        System.out.println(Math.min(a+d, b+c)); //사과바구나 오렌지 바구니 개수중 최소값 출력
    }
}
