package bronze2;

import java.util.Scanner;

public class 숫자의개수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = a*b*c;
        char[] arr = Integer.toString(result).toCharArray();
        int []count = new int[10];
        for (int i=0; i<arr.length; i++) {
            int temp = Integer.parseInt(String.valueOf(arr[i]));
            count[temp]++;
        }
        for(int i=0; i<10; i++) {
            System.out.println(count[i]);
        }
    }
}
