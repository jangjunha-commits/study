package bronze4;

import java.util.Scanner;

public class 심부름가는길 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0; //이동하는 시간 나타는 것
        for(int i=0; i<4; i++) { //나타내는 초가 주어집니다
            s += sc.nextInt(); //다 더한다
        }
        System.out.println(s/60); //분단위 더한값를 나눈다
        System.out.println(s%60); //초단위
    }
}
