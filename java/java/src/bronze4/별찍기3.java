package bronze4;

import java.util.Scanner;

public class 별찍기3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n; i>0; i--) {
            for (int j=0; j<i; j++) {
                System.out.println("*"); //i 역순 내리기 ***** **** *** ** *
            }
            System.out.println(); //공백 j
        }
    }
}
