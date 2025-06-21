package bronze5;

import java.util.Scanner;

public class AB57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == 0 && b == 0) break;
            System.out.println(a+b);
        }

        int T = sc.nextInt();
        for(int i=1; i<=T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int sum = A+B;
            System.out.println("Case #" + i + " : "+ sum);
        }
    }
}
