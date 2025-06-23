package 수학;

import java.util.Scanner;

public class 더하기사이클 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Ori = sc.nextInt();
        int next = Ori;
        int count = 1;
        while(true) {
            int first, second;
            if(next < 10) {
                first = 0;
                second = next;
            }else {
                first = next/10;
                second = next % 10;
            }
            int sum = first + second;
            next = (next%10*10) + (sum%10);
            if(Ori == next) {
                break;
            }else {
                count++;
            }
        }
        System.out.println(count);
    }
}
