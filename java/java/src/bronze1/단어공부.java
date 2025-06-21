package bronze1;

import java.util.Scanner;

public class 단어공부 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[26];
        char[] text = sc.nextLine().toCharArray();
        for(int i=0; i<text.length; i++) {
            char now = text[i];
            int index = -1;
            if('a'<=now && now <='z') {
                index = now - 'a';
            }else {
                index = now - 'A';
            }
            cnt[index]++;
        }
        int max = -1;
        int max_cnt = 0;
        int max_index = -1;
        for(int i=0; i<26; i++) {
            if(max < cnt[i]) {
                max = cnt[i];
                max_cnt = 1;
                max_index = i;
            }else if(max == cnt[i]) {
                max_cnt++;
            }
        }
        if(max_cnt==1) {
            System.out.println((char)('A'+max_index));
        }else {
            System.out.println("?");
        }
    }
}
