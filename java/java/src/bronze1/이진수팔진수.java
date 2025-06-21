package bronze1;

import java.util.ArrayList;
import java.util.Scanner;

public class 이진수팔진수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] text = sc.nextLine().toCharArray();
        ArrayList<Integer>arr = new ArrayList<>();
        for(int i=text.length-1; i>=0; i--) {
            int temp = 0;
            for(int j=1; j<=4&&i>=0; j=j*2) {
                temp += j*Integer.parseInt(String.valueOf(text[i--]));
            }
            arr.add(temp);
        }
        for(int i=arr.size()-1; i>=0; i--) {
            System.out.println(arr.get(i));
        }
    }
}
