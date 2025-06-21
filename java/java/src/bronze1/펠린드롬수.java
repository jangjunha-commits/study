package bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 펠린드롬수 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String Number = br.readLine();
            if(Number.equals("0")) break;
            if(isP(Number)) {
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }

    private static boolean isP(String number) {
        char[] number_text = number.toCharArray();
        int start_index = 0;
        int end_index = number_text.length-1;
        while(start_index<=end_index) {
            if(number_text[start_index]!=number_text[end_index]) {
                return false;
            }
            start_index++;
            end_index--;
        }
        return true;
    }
}
