package bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class j {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        //1000
        int a = i.nextInt();
        int b = i.nextInt();
        System.out.println(a + b);
        //1001
        int a1 = i.nextInt();
        int b1 = i.nextInt();
        System.out.println(a1 - b1);
        //1008
        double a2 = i.nextDouble();
        double b2 = i.nextDouble();
        if (0 < a2 && b2 < 10) {
            System.out.println(a2 / b2);
        }
        //1271
        BigInteger a3 = new BigInteger(i.next());
        BigInteger b3 = new BigInteger(i.next());

        System.out.println(a3.divide(b3));
        System.out.println(a3.remainder(b3));
        //1330
        int a4 = i.nextInt();
        int b4 = i.nextInt();
        if (a4 > b4) {
            System.out.println(">");
        } else if (a4 < b4) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
        //2338
        int a5 = i.nextInt();
        int b5 = i.nextInt();
        System.out.println(a5+b5);
        System.out.println(a5-b5);
        System.out.println(a5*b5);
        //2420 사파리 월드
        long a6 = i.nextLong();
        long b6 = i.nextLong();
        System.out.println(Math.abs(a6-b6));

    }
}
