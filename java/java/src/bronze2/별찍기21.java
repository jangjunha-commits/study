package bronze2;

import java.util.Scanner;

public class 별찍기21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<2*n; i++) {
            for(int j=0; j<n; j++) {
                if((i*j)%2==0) System.out.println("*");
                else System.out.println(" ");
            }
            System.out.println();
        }
    }
}
