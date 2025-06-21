package bronze1;

import java.util.Scanner;
import java.util.Arrays;

public class 일곱난쟁이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p[] = new int[9];
        int sum = 0;
        for(int i=0; i<9; i++){
            p[i] = sc.nextInt();
            sum += p[i];
        }

        Arrays.sort(p);
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if(sum-p[i]-p[j]==100) {
                    for(int k=0; k<9; k++) {
                        if(k!=i&&k!=j) {
                            System.out.println(p[k]);
                        }
                    }
                    return;
                }
            }
        }
    }
}
