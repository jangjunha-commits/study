package bronze4;

import java.util.Scanner;
import java.util.Arrays;

public class 세수정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[3];
        A[0] = sc.nextInt();
        A[1] = sc.nextInt();
        A[2] = sc.nextInt();
        Arrays.sort(A);
        System.out.println(A[0]+ " " + A[1] + " " + A[2]);
    }
}
