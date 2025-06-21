package bronze4;

import java.util.Scanner;

public class 파티가끝나고난뒤 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(); //1
        int p = sc.nextInt(); //10
        for(int i=0; i<5; i++) { //10 10 10 10 10
            int temp = sc.nextInt();
            System.out.println(temp-(l*p)+" "); //0 0 0 0 0
        }
    }
}
