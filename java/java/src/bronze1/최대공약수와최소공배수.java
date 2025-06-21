package bronze1;

import java.util.Scanner;

public class 최대공약수와최소공배수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int gcd = gcd(a, b);
        System.out.println(gcd);
        System.out.println(gcd * a / gcd * b / gcd);
    }

    private static int gcd(int a, int b) {
      if(a%b!=0) {
          return gcd(b, a%b);
      }else {
          return b;
      }
    }
}



