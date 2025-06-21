package bronze5;
import java.util.*;

public class 별찍기1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i=1; i<=a; i++) { //a번 반복열
            for (int j=1; j<i; j++) { //1, 2, 3 순차적으로
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
