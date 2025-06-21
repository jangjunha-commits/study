package bronze2;

import java.util.Scanner;

public class 진법변환 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] text = sc.next().toCharArray();
        int n = sc.nextInt();
        int a[] = new int[text.length];

        for(int i=0; i<text.length; i++) {
            if(47<text[i] && text[i] < 58) {
                a[i] = Integer.parseInt(String.valueOf(text[i]));
            }else {
                a[i] = text[i] - 55;
            }
        }

        int result = a[a.length-1];
        int temp = n;
        for(int i=a.length-2; i>=0; i--) {
            result += a[i] * temp;
            temp = temp * n;
        }
        System.out.println(result);
    }
}
