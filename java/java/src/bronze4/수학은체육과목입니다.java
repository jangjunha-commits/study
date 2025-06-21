package bronze4;

import java.util.Scanner;

public class 수학은체육과목입니다 {
    public static void main(String[] args) {
        //1 2 3 4 5
        //9 8 7 6
        //  10 11 12 14
        //17 16 15 14
        //   18 19 20 21
        //나머지 연산을 풀어야한다
        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%8==1) {
            System.out.println(1);
        }else if(n%8==0 || n%8==2) {
            System.out.println(2);
        }else if(n%8==3 || n%8==7) {
            System.out.println(3);
        }else if(n%8==4 || n%8==6) {
            System.out.println(4);
        }else {
            System.out.println(5);
        }
        */
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();  // long 타입으로 받아야 함 (최대 20억)

        int[] fingers = {1, 2, 3, 4, 5, 4, 3, 2};  // 주기 8
        int index = (int)((n - 1) % 8);  // 0-based index

        System.out.println(fingers[index]);
    }
}
