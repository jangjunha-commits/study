package bronze2;

import java.util.Scanner;

public class 백설공주와일곱난쟁이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a[] = new int[9];
        for(int i=0; i<9; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if(sum-a[i]-a[j]==100) {
                    for(int k=0; k<9; k++) {
                        if(k!=i && k!=j) {
                            System.out.println(a[k]);
                        }
                    }
                    return;
                }
            }
        }
    }
}
