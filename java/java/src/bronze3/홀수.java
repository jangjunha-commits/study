package bronze3;

import java.util.Scanner;

public class 홀수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i=0; i<7; i++) {
            int temp = sc.nextInt();
            if(temp%2!=0) { //홀수면 더하기
                sum += temp;
                if(min > temp) {
                    min = temp;
                }
            }
        }
        if(sum==0) { //홀수가 없다면 -1
            System.out.println(-1);
        } else {
            System.out.println(sum); //홀수합
            System.out.println(min); //최소값
        }
    }
}
