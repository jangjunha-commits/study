package bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class 긴자리계산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //BibInter를 사용할때 연산할때 add multiple divide remain 사용
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
    }
}
