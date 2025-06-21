package bronze2;

import java.util.Scanner;

public class 팔진수2진수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] number = sc.next().toCharArray();
        for (int i = 0; i < number.length; i++) {
            if (i == 0) {
                if (number[i] == '0') {
                    System.out.println('0');
                } else if (number[i] == '1') {
                    System.out.println("1");
                } else if (number[i] == '2') {
                    System.out.println("10");
                } else if (number[i] == '3') {
                    System.out.println("11");
                } else {
                    if (number[i] == '0') {
                        System.out.println("000");
                    } else if (number[i] == '1') {
                        System.out.println("001");
                    } else if (number[i] == '2') {
                        System.out.println("010");
                    } else if (number[i] == '3') {
                        System.out.println("011");
                    }
                }
                if (number[i] == '4') {
                    System.out.println("100");
                } else if (number[i] == '5') {
                    System.out.println("101");
                } else if (number[i] == '6') {
                    System.out.println("110");
                } else if (number[i] == '7') {
                    System.out.println("111");
                }
            }
        }
    }
}
