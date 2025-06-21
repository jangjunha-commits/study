package bronze5;

import java.util.Scanner;

public class 크냐 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            //두수 입력
            int N = sc.nextInt();
            int M = sc.nextInt();
            // 0 0 입력하면 종료
            if(N==0 && M==0) break;
            //n이 m보다 크면 Yes 아니면 No
            else if(N>M) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
