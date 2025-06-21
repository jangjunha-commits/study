package bronze4;

import java.util.Scanner;

public class 삼각형외우기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a==60 && b==60 && c==60) { //세각의 합의 크기가 같을 때
            System.out.println("Equilateral");
        }else if((a+b+c == 180)&& (a==b || b==c || c==a)) { //세각의 합이 180도이면서 두각이 같을때
            System.out.println("Isosceles");
        } else if ((a+b+c == 180)&& (a!=b && b!=c && c!=a)) { //세각으 합이 180도이면서 두각이 다를때
            System.out.println("Scalene");
        } else if (a+b+c != 180) { //세각의 합이 180 아닐때
            System.out.println("Error");
        }
    }
}
