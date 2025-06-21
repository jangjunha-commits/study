package bronze1;

import java.util.Scanner;

public class 나무조각 {
    static int a[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = new int[5];
        for(int i=0; i<5; i++) {
            a[i] = sc.nextInt();
        }
        while(true) {
            for(int i=0; i<4; i++) {
                if(a[i]>a[i+1]) {
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    printA();
                }
            }
            if(a[0]==1 && a[1]==2 && a[2]==3 && a[3]==4 && a[4]==5) {
                break;
            }
        }
    }

    private static void printA() {
        for(int i=0; i<5; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
