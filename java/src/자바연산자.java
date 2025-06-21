public class 자바연산자 {
    public static void main(String[] args) {
        //더하는 연산자 +
        int x = 405 + 938;
        System.out.println(x);

        //변수와 값을 더하거나 다른 변수를 더하는데에도 사용 할수 있다
        int sum = 130 + 594;
        int sum1 = sum + 450;
        int sum2 = sum1 + 4589;
        System.out.println(sum2);

        //산술 연산자 + - * / % ++ --
        //할당 연산자
        int y = 30;
        y += 30;
        y += 40;
        System.out.println(y);

        //비교 연산자 == != > < >= <=
        System.out.println(x>y);

        //논리연산자 && || !
        System.out.println(x<300 || y>100);
        System.out.println(!(x > 800 && y>= 100));
    }
}
