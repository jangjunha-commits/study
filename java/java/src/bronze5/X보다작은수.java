package bronze5;

import java.util.Scanner;

public class X보다작은수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        for(int i=0; i<N; i++) {
            int temp = sc.nextInt();
            if(temp <X) {
                System.out.print(temp + " "); //공백으로 구분 출력 입력받은 순서대로
            }
        }
    }
}
