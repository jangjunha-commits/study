package bronze5;

import java.util.Scanner;

public class 검증수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i=0; i<5; i++) {
            int temp = sc.nextInt();
            //각각 제곱해서 더한다
            sum += temp*temp;
        }
        //검증수
        System.out.println(sum%10);
    }
}
