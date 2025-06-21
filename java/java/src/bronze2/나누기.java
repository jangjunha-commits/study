package bronze2;

import java.util.Scanner;

public class 나누기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();

        n = n/100;
        n = n*100;

        while(true) {
            if(n%f==0) {
                break;
            }
            n++;
        }
        char[] a = String.valueOf(n).toCharArray();
        System.out.println(a[a.length-2]);
        System.out.println(a[a.length-1]);
    }
}
