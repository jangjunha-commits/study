package bronze4;

import java.util.Scanner;

public class 평균 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0; //5명의 성적합계
        for(int i=0; i<5; i++) {
            int temp = sc.nextInt(); //5명 점수 입력
            if(temp < 40) { //40미만 40점
                temp = 40;
            } //아니면 점수로 더하기 환산
                sum += temp;
            System.out.println(sum/5); //5명의 평균 점수 출력
        }
    }
}
