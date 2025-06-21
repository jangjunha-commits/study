package bronze3;

import java.util.Scanner;

public class 오븐시계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //시
        int b = sc.nextInt(); //분
        int c = sc.nextInt(); //+분

        b += c; //분기준으로 흐르는 시간 17:40 + 80 -> 19:00
        if(b > 59) {
            b = b%60;
            a = (a+b/60)%24;
        }
        System.out.println(a+" "+b);
    }
}
