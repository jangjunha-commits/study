package bronze4;

import java.util.Scanner;

public class 줄번호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()); //5
        for(int i=1; i<n; i++) { // i.문장
            String text = sc.nextLine();
            System.out.println(i+"."+text);
        }
    }
}
