package bronze5;

import java.util.Scanner;

public class 아스키코드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char textCtr = text.charAt(0);
        System.out.println((int)textCtr);
    }
}
