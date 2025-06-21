package bronze2;

import java.util.Scanner;

public class Hasthing {
    public static void main(String[] args) {
        int r = 31;
        int m = 1234567891;
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        char[] text = sc.next().toCharArray();

        long sum = 0;
        for(int i=0; i<l; i++) {
            long v = text[i] -'a' + 1;
            long a = 1;
            for(int j=0; j<i; j++) {
                a = (a*r)%m;
            }

            long temp = (v*a)%m;
            sum += temp;
            sum %= m;
        }
        System.out.println(sum%m);
    }
}
