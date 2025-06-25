package 문자열;

import java.util.Scanner;

public class 세로읽기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = new String[5];
        for(int i=0; i<5; i++) {
            lines[i] = sc.nextLine();
        }
        for(int col=0; col<15; col++) {
            for(int row=0; row<5; row++) {
                if(col < lines[row].length()) {
                    System.out.println(lines[row].charAt(col));
                }
            }
        }
    }
}
