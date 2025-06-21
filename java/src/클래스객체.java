class Constructer {
    int xy = 35;
    int yx = 75;
}

class javaCompiers {
    String javaSE = "17";
    String javaSE2 = "23";
    int conect = 345;
    char mesard = 'b';
}
public class 클래스객체 {
    int x = 10;
    public static void main(String[] args) {
        /*
        클래스/객체
        java 객체지향프로그래밍 언어입니다
        클래스와 객체 그리고 그 속성과 메서드와 연관되어 있다
        자동차 (물건 클래스)
        무게 색상 드라이브및브레이크 (속성 메소드)
        클래스 객체 생성자 또는 객체를 생성하기 위한 블루프린트 입니다
        클래스 만들기
        class
         */
        //메인 자바 Mains변수 cs
        //publuc class Mains{
        // int cs = 4;
        //}
        //객체 만들기
        //java에서는 클래스라는 객체가 생성됩니다
        //같은 클래스를 만들었습니다
        //객체를 만들려면 Mains 클래스 이름을 지정한 다음 객체 이름을 지정하고 키워드를 사용합니다 new
        //object 객체 그리고 x값 출력
        클래스객체 object = new 클래스객체();
        System.out.println(object.x);
        //다중객체
        //한 클래스에서 여러개체를 만들수 있습니다
        //두개의 객체 생성
        Constructer Object1 = new Constructer();
        Constructer Object2 = new Constructer();
        System.out.println(Object1.xy);
        System.out.println(Object2.yx);
        //다중클래스 사용
        //클래스의 객체를 생성하고 다른 클래스에서 엑세스 할수 있습니다
        //클래스 구성을 위해 사용됩니다
        //메인.자바
        //두번째.자바
        javaCompiers myjava = new javaCompiers();
        System.out.println(myjava.javaSE2);
        System.out.println(myjava.conect);
        System.out.println((int)myjava.mesard);
    }
}
