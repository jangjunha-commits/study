package bronze3;

import java.util.Scanner;

public class 최댓값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;       // 최댓값 저장
        int index = 0;     // 최댓값의 위치 저장

        for (int i = 1; i <= 9; i++) {
            int num = sc.nextInt();
            if (num > max) {
                max = num;
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}

