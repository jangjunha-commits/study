package bronze4;

import java.util.Scanner;

public class 입실관리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 이름의 수
        sc.nextLine(); // 개행 문자 제거

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            System.out.println(name.toLowerCase()); // 소문자로 변환하여 출력
        }
    }
}

