public class 메서드오버로드 {
    static int plus(int x, int y) {
        return x + y;
    }

    static double plue_double(double x, double y) {
        return x + y;
    }

    static int same(int x, int y) {
        return x - y;
    }

    static double same(double x, double y) {
        return x - y;
    }

    public static void main(String[] args) {
        /*
        메서드 오버로드
        여러 메서드가 매개변수가 다른 동일한 이름을 가질수 있음
        int method(int x)
        float method2(float x)
        double method3(double x, double y)
        두가지 방법 서로 다른 유형의 숫자를 더하는 방법
         */
        int Intnum = plus(10,30);
        double Doublenum = plue_double(3.34, 5.48);
        System.out.println("int : " + Intnum);
        System.out.println("Double : " + Doublenum);

        //둘다 작동
        int Inum = same(40,20);
        double Dnum = same(4.9, 2.0);
        System.out.println(Inum);
        System.out.println(Dnum);
    }
}
