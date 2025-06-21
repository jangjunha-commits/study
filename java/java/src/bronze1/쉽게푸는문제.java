package bronze1;

import java.util.Scanner;

public class 쉽게푸는문제 {
    public static void main(String[] args) {
        int t[] = new int[1001];
        int index = 1;
        for(int i=1; index<1001; i++) {
            for(int j=0; j<i&&index<1001; j++) {
                t[index++] = i;
            }
        }

        int s[] = new int[1001];
        for(int i=1; index<1001; i++) {
            s[i] = s[i-1] + t[i];
        }

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(s[b]-s[a-1]);
    }
}
