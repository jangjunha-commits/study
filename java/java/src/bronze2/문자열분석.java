package bronze2;

import java.util.Scanner;

public class 문자열분석 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            char[] text = sc.nextLine().toCharArray();
            int s = 0;
            int d = 0;
            int n = 0;
            int b = 0;
            for(int i=0; i<text.length; i++) {
                char now = text[i];
                if(now == ' ') b++;
                else if(now >= 'a' && now <= 'z') s++;
                else if(now >= 'A' && now <= 'Z') d++;
                else n++;
            }
            System.out.println(s+" "+d+" "+n+" "+b);
        }
    }
}
