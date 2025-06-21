package bronze1;

import java.util.Scanner;

public class ROT13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] text = sc.nextLine().toCharArray();
        for(int i=0; i<text.length; i++) {
            char now = text[i];
            if('a' <= now && now <= 'z') {
                now = (char) (now + 13);
                if(now > 'z') {
                    now = (char) (now%122+96);
                }
            }
            else if('A' <= now && now <= 'Z') {
                now = (char) (now + 13);
                if(now > 'Z') {
                    now = (char) (now%90+64);
                }
            }
            System.out.println(now);
        }
    }
}
