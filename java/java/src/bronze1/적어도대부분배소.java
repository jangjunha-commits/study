package bronze1;

import java.util.Arrays;
import java.util.Scanner;

public class 적어도대부분배소 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for(int i=0 ; i<5; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int start = a[2];
        while(true) {
            int count = 0;
            for(int i=0 ; i<5; i++) {
                if(start%a[i]==0) count++;
            }
            if(count>2) break;
            start++;
        }
        System.out.println(start);
    }
}
