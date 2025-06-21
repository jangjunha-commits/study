package bronze3;

import java.util.Scanner;

public class 나는요리사다 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int max_num = 0;
        for(int i=1; i<=5; i++) {
            int temp_sum = 0;
            for(int j=0; j<4; j++) {
                temp_sum += sc.nextInt();
            }
            if(max < temp_sum) {
                max = temp_sum;
                max_num = i;
            }
        }
        System.out.println(max_num+" "+max);
    }
}
