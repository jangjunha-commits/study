package bronze3;

import java.util.Scanner;

public class 지능형기차 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //역이 4개
        int max = 0; //많은 사람수
        int now = 0; //현재 수
        for(int i=0; i<4; i++) { //4개 정거장
            int a = sc.nextInt(); //탄사람
            int b = sc.nextInt(); //내린사람
            now = now-a+b;
            max = Math.max(now, max); //많은 사람 수
        }
        System.out.println(max);
    }
}
