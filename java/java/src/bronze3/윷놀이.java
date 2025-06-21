package bronze3;

import java.util.Scanner;

public class 윷놀이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++) { //0101 1110 0011
            int b = 0;
            for(int j=0; j<4; j++) {
                int temp = sc.nextInt(); //입력이 최대 4개
                if(temp==0)b++; //0101
            }
            switch (b) { //0의 개수
                case 1: //도
                    System.out.println("A");
                    break;
                case 2: //개
                    System.out.println("B");
                    break;
                case 3: //걸
                    System.out.println("C");
                    break;
                case 4: //윷
                    System.out.println("D");
                    break;
                case 0: //모
                    System.out.println("E");
                    break;
            }
        }
    }
}
