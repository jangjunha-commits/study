package bronze4;

import java.util.Scanner;

public class 히스토그램 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) { //개수 입력 3
            int k = sc.nextInt();
            for(int j=0; j<k; j++) { // == 개수 출력  2 5 2
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
