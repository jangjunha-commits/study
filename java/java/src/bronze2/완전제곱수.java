package bronze2;

import java.util.Scanner;

public class 완전제곱수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int min = -1;
        boolean find_min = false;
        for(int i=1; i*i<=n; i++) {
            int temp = i*i;
            if(temp >= m) {
                if(!find_min) {
                    min = temp;
                    find_min = true;
                }
                sum += temp;
            }
        }
        if (min == -1) {
            System.out.println(min);
        }else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
