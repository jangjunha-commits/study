package bronze4;

import java.util.Scanner;

public class 인공지능시계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int time = sc.nextInt();

        //초->분->시 순으로 계산합니다
        //나머지 연산 -> 몫 % -> 나머지
        s += time; //시간합
        if(s>59) {
            m+=s/60;
            s=s%60;
        }

        if(m>59) {
            h+=m/60;
            m=m%60;
        }

        if(h>23) {
            h=h%24;
        }

        System.out.println(h +" "+ m +" " + s);
    }
}
