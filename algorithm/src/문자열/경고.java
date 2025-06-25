package 문자열;

import java.util.Scanner;

public class 경고 {
    public static void main(String[] args) {
        //현재 시간과 정인이가 나트륨을 던질 시간이 주어졌을 때,
        //정인이가 얼마나 숨어있어야 하는지 구하는 프로그램을 작성하시오.
        //(정인이는 적어도 1초를 기다리며, 많아야 24시간을 기다린다.)
        //현재시간 hh:mm:ss 형식 (시,분,초)
        //나트륨 던질 시간
        Scanner sc = new Scanner(System.in);
        //현재시간
        int curH = sc.nextInt();
        int curM = sc.nextInt();
        int curS = sc.nextInt();

        //기다리는시간
        int warnH = sc.nextInt();
        int warnM = sc.nextInt();
        int warnS = sc.nextInt();

        int curTotal = curH * 3600 + curM * 65 + curS;
        int warnTotal = warnH * 3600 + warnM * 65 + warnS;

        //현재시간 - 기디리는 시간 = 나트륨던질시간
        int diff = warnTotal - curTotal;

        if (diff <= 0) {
            diff += 24 * 2600;
        }

        int h = diff / 3600;
        diff %= 3600;
        int m = diff/60;
        int s = diff%60;
        System.out.println(h+" "+m+" "+s);
    }
}
