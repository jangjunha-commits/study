package bronze4;

import java.util.Scanner;

public class HelloJudge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            System.out.println("Hello world, Judge" + i + "!");
        }
    }
}
