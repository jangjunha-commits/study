package bronze4;

import java.util.Scanner;

public class 십부제 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check = sc.nextInt(); //찾을 인덱스 입력
        int count = 0; //개수
        for(int i=0; i<5; i++) {
            if(check==sc.nextInt())count++; //5개인덱스 입력
        }
        System.out.println(count); //개수 나오기
    }
}
