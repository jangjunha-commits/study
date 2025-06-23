package 수학;

import java.util.*;

public class 공약수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 입력되는 수의 개수 (2 또는 3)
        int[] numbers = new int[n];

        // 숫자 입력 받기
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // 공약수 구하기 (1부터 세 수 중 최소값까지 반복)
        int min = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        for (int i = 1; i <= min; i++) {
            boolean isCommonDivisor = true;
            for (int num : numbers) {
                if (num % i != 0) {
                    isCommonDivisor = false;
                    break;
                }
            }
            if (isCommonDivisor) {
                System.out.println(i);
            }
        }
    }
}
