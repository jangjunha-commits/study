public class 연산자 {
    public static void main(String[] args) {
        //산술연산자
        int num1 = 20, num2=34;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
        //연산자 우선순위
        //[] . ++ -- ! ~ + - ++ -- (타입) * / % + - << >> >>> < >= instance of
        //== != & ^ | && || ?: =

        //대입연산자
        int num3 = 35-2;
        int num4 =+ 40;
        int num5 =- 29;
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);

        //증감연산자
        int num6 = 80;
        int num7 = 90;
        int result1;
        int result2;

        result1 = --num6 + 4;
        result2 = num7-- - 4;
        System.out.println("전위 감소 연산자에 의한 결과:" + result1 + "변수의값 :"  + num6);
        System.out.println("우휘 감소 연산자에 의한 결과:" + result2 + "변수의값 : " + num7);

        //증감연산자의 연산순서
        int x = 10;
        int y = x-- + 5 + --x;
        System.out.println("x:"+x+"y:"+y);

        //비교연산자
        //상대적인 크기를 판단하는 연산자
        //두개의 피연산자를 가지는 이항연산자

        char ch1= 'a';
        char ch2 = 'A';
        System.out.println(ch1 == ch2);
        System.out.println(ch1 > ch2);

        //삼항연산자
        //조건식? 반횐값1:반환값2
        int num8 = 50;
        int num9 = 70;
        int result3;

        result3 = (num8 - num9 >0) ? num8 : num9;
        System.out.println(result3);

        //instanceof연산자
        //참조변수가 참조하고 있는 인스턴스의 실제타입을 반환해줍니다
        //왼쪽 피연산자인 인스턴스가 오른쪽인 피연산자인 클래스나 인터페이스로부터 생성되었으면 true
        //아니면 false
        class A{}
        class B extends A{}
        A a = new A();
        B b = new B();
        System.out.println(a instanceof A);
        System.out.println(b instanceof A);
        System.out.println(a instanceof B);
        System.out.println(b instanceof B);
    }
}
