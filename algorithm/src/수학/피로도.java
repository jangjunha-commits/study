package 수학;

import java.util.Scanner;

public class 피로도 {
    public static void main(String[] args) {
        //하루에 한 시간 일하면 피로도는
        //A만큼 쌓이고 일은
        //B만큼 처리할 수 있다.
        //한시간 쉬면 c만큼 피로도가 줄인다
        //피로도가 음수로 내려가면 0으로 바꾼다
        //피로도 최대한 m넘지 않게
        //번아웃 오지 않도록 최대 얼마나 일할수 있는지
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //증가 피로도
        int b = sc.nextInt(); //증가 일의양
        int c = sc.nextInt(); //쉴때 줄어드는 피로도
        int m = sc.nextInt(); //최대 피로도

        int fatigue = 0; //현재피로도
        int work = 0; //총 일의 양

        for(int i=0; i<24; i++) {
            if(fatigue + a <= m) {
                fatigue += a;
                work += b;
            }else {
                fatigue -= c;
                if(fatigue < 0) {
                    fatigue = 0;
                }
            }
        }
        System.out.println(work);
    }
}
