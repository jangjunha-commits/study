package bronze5;

import java.util.Scanner;

public class 킹퀸룩비숏나이트폰 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1,1,2,2,2,8};
        int[] input = new int[6];
        for(int i=0 ; i<6; i++) {
            input[i] = sc.nextInt();
        }
        for(int i=0; i<6; i++) {
            System.out.println((a[i]-input[i])+" ");
        }
    }
}
