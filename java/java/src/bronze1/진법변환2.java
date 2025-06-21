package bronze1;

import java.util.Scanner;

public class 진법변환2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        
        if(n<b) {
            if(n>9) {
                System.out.println((char)(n+55));
            }else {
                System.out.println(n);
            }
        }else {
            int cnt = 0;
            double temp = b;
            while(n>temp) {
                temp = Math.pow(b, cnt++);
            }//b진법으로 표현하는데 몇자리수로 표현되는지 계산하기
            cnt--;
            while(cnt>0) {
                temp = Math.pow(b, cnt--);
                int now = (int)(n/temp);
                if(now>9) {
                    System.out.println(now);
                }else {
                    System.out.println(now);
                }
                n = (int)(n%temp);
            }
        }
    }
}
