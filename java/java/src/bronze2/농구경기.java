package bronze2;

import java.util.Scanner;

public class 농구경기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[130];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            char index = sc.nextLine().toCharArray()[0];
            a[(int) index]++;
        }
        boolean check = false;
        for(int i=0; i<130; i++) {
            if(a[i]>4) {
                check = true;
                System.out.print((char)i);
            }
        }
        if(!check) System.out.println("PREDAJA");
    }
}
