package bronze3;

import java.util.Scanner;

public class 열개씩끊어출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        for(int i=0; i<text.length(); i=i+10) {
            String temp;
            if (i + 10 < text.length()) {
                temp = text.substring(1, i + 10);
                //System.out.println(temp);
            } else {
              temp = text.substring(i);
            }
            System.out.println(temp);
        }
    }
}
