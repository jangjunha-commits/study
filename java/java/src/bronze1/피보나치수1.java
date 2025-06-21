package bronze1;

import java.util.Scanner;

public class 피보나치수1 {

    static int count1, count2;
    static int f[] = new int[41];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        count1 = count2 = 0;
        fib(n);
        fibonacci(n);
        System.out.println(count1 + " " + count2);
    }
    static int fib(int n) {
        if(n == 1 || n == 2) {
            count1++;
            return 1;}
        else return (fib(n-1)+fib(n-2));
      }
      static int fibonacci(int n) {
        f[1] = f[2] = 1;
        for(int i=3; i<=n; i++) {
            count2++;
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
      }
    }


