package bronze4;

import java.util.Scanner;

public class 방학숙제 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(); //방학일수
        int A = sc.nextInt(); //국어
        int B = sc.nextInt(); //수학
        int C = sc.nextInt(); //최대국어일수
        int D = sc.nextInt(); //최대수학일수
        int spend_A = A/C;
        if(A%C!=0) spend_A++;
        int spend_B = B/D;
        if(B%D!=0) spend_B++;
        System.out.println(L-Math.max(spend_A,spend_B));
    }
}
