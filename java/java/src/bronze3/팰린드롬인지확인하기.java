package bronze3;

import java.util.Scanner;

public class 팰린드롬인지확인하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] text = sc.nextLine().toCharArray();
        int start_index = 0;
        int end_index = text.length-1;
        boolean isF = true;
        while(start_index<end_index) {
            if(text[start_index]!=text[end_index]) {
                isF = false;
                break;
            }
            start_index++;
            end_index--;
        }
        if(isF) System.out.println(1);
        else System.out.println(0);
    }
}
