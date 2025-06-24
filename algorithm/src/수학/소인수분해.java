package 수학;

import java.util.Scanner;

public class 소인수분해 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //72
        if(n>1) {
            for(int i=2; i<=Math.sqrt(n); i++) {
                while(n%i==0) {
                    System.out.println(i);
                    n = n/i;
                }
            }
        }
        if(n>1) {
            System.out.println(n); //2 2 2 3 3
        }
    }
}
