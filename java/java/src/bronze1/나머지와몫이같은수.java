package bronze1;

import java.util.Scanner;

public class 나머지와몫이같은수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for(int i=1; i<n; i++) {
            long temp = (long) n *i*i;
            sum += temp;
        }
        System.out.println(sum);
    }
}
