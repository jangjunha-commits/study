package bronze2;

import java.util.Scanner;

public class 거스름돈 {
    public static void main(String[] args) {
        int a[] = {500,100,50,10,5,1};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 1000-n;
        int count = 0;
        for(int i=0; i<a.length; i++) {
            //거스름돈 단위가 큰거부터
            count += s/a[i];
            s = s%a[i];
        }
        System.out.println(count);
    }
}
