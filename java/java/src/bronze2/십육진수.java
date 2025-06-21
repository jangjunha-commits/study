package bronze2;

import java.util.Scanner;

public class 십육진수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        char[] temp = sc.nextLine().toCharArray();
        for(int i = temp.length-1; i>=0; i--) {
            char now = temp[i];
            int index = (int)Math.pow(16,temp.length-1-i);
            if(now >= 'A') {
                result += (now - 55) * index;
            }else {
                result += (now - '0') * index;
            }
        }
        System.out.println(result);
    }
}
