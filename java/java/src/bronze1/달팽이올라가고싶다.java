package bronze1;

import java.util.Scanner;

public class 달팽이올라가고싶다 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();

        int c = a-b;
        int day = (v-b)/c;
        if((v-b)%c != 0) day++;

        System.out.println(day);
    }
}
