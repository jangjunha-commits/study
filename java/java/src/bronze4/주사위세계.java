package bronze4;

import java.util.Scanner;

public class 주사위세계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a==b && b==c) { //같은눈 3개
            System.out.println(10000+a*1000);
        }
        else if(a==b || b==c || c==a) { //같은눈 2개
            if(a==b) {
                System.out.println(1000*a*1000);
            } else {
                System.out.println(1000+c+100);
            }
        }else {
            int max = Math.max(a, Math.max(b,c));
            System.out.println();
        }
    }
}
