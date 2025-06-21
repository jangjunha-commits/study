package bronze1;

import java.util.Scanner;

public class 슈퍼마리오 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for(int i=0; i<10; i++) {
            int temp = sc.nextInt();
            sum += temp;
            if(sum > 100) {
                int x = sum - 100;
                int y = 100 - (sum - temp);
                if(y < x) sum -= temp;
                break;
            }
        }
        System.out.println(sum);
    }
}
