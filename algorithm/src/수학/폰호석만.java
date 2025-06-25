package 수학;

import java.math.BigInteger;
import java.util.Scanner;

public class 폰호석만{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        long foundX = -1;
        int foundA = -1, foundB = -1;
        int count = 0;

        int minBaseS = minBase(s);
        int minBaseT = minBase(t);

        for (int A = minBaseS; A <= 36; A++) {
            BigInteger xA = parse(s, A);
            if (xA == null || xA.bitLength() >= 63) continue;

            for (int B = minBaseT; B <= 36; B++) {
                if (A == B) continue;
                BigInteger xB = parse(t, B);
                if (xB == null || xB.bitLength() >= 63) continue;

                if (xA.equals(xB)) {
                    count++;
                    if (count == 1) {
                        foundX = xA.longValue();
                        foundA = A;
                        foundB = B;
                    }
                }
                if (count > 1) break;
            }
            if (count > 1) break;
        }

        if (count == 0) {
            System.out.println("Impossible");
        } else if (count > 1) {
            System.out.println("Multiple");
        } else {
            System.out.printf("%d %d %d\n", foundX, foundA, foundB);
        }
    }

    // 문자열에서 사용된 문자 중 최대값 기반 최소 진법 계산
    private static int minBase(String s) {
        int max = 0;
        for (char c : s.toCharArray()) {
            int v = Character.isDigit(c) ? c - '0' : c - 'a' + 10;
            if (v > max) max = v;
        }
        return Math.max(2, max + 1);
    }

    // 진법 변환: overflow 검증 포함
    private static BigInteger parse(String s, int base) {
        try {
            return new BigInteger(s, base);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}

