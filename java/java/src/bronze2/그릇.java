package bronze2;

import java.util.Scanner;

public class 그릇 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.nextLine().toCharArray();
        int sum = 10;
        char before = a[0];
        for(int i=1; i<a.length; i++) {
            char now = a[i];
            if(before == now) {
                sum += 5;
            }else {
                sum += 10;
                before = now;
            }
            System.out.println(sum);
        }
    }
}
