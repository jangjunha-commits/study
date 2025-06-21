package bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class 엄청난부자2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //BigInteger (1 ≤ m ≤ n ≤ 101000, m과 n은 10진수 정수) 사용합니다
        BigInteger n = new BigInteger(sc.next());
        BigInteger m = new BigInteger(sc.next());
        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
    }
}
