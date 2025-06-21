package bronze1;

import java.util.Scanner;

public class 유레카이론 {
    public static void main(String[] args) {
        int T[] = new int[45];
        for(int i=0; i<45; i++) {
            T[i] = i * (i+1) / 2;
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int t=0; t<n; t++) {
            int ks = sc.nextInt();
            boolean isSamGak = false;
        for(int i=1; i<45; i++) {
            for(int j=1; j<45; j++) {
                for(int k=1; k<45; k++) {
                    if (T[i] + T[j] + T[k] == ks) {
                           isSamGak = true;
                      }
                   }
                }
            }
        if(isSamGak) System.out.println(1);
        else System.out.println(0);
        }
    }
}
