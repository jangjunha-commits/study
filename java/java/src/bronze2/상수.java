package bronze2;

import java.util.Scanner;

public class 상수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();

        char temp = a[0];
        a[0] = a[2];
        a[2] = temp;

        temp = b[0];
        b[0] = b[2];
        b[2] = temp;

        int reA = Integer.parseInt(new String(a));
        int reB = Integer.parseInt(new String(b));

        System.out.println(Math.max(reA,reB));
    }
}
