package bronze1;

import java.util.Scanner;

public class 약수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = -1;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            int temp = sc.nextInt();
            if(max<temp) max = temp;
            if(max>temp) min = temp;
        }
        System.out.println(max*min);
    }
}
