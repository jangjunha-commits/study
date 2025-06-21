package bronze3;

import java.util.Scanner;

public class 배수와약수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==0 && b==0) break;

            if(b%a==0) System.out.println("factor"); //약수
            else if(a%b==0) System.out.println("multiple"); //배수
            else System.out.println("neither"); //약수 배수 x
        }
    }
}
