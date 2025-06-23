package 수학;

import java.util.Scanner;

public class 소수찾기 {
    public static void main(String[] args) {
        //주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
        //입력하면 소수의 개수를 찾는다
        // N은 100이하이다
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=0; i<n; i++) {
            int temp = sc.nextInt();
            boolean IsTrue = true;
            if(temp == 1) {
                IsTrue = false;
            }
            else {
                for(int j=2; j<temp; j++) {
                    if(temp % j == 0) {
                        IsTrue = false;
                        break;
                    }
                }
            }
            if(IsTrue) count++;
        }
        System.out.println(count);
    }
}

