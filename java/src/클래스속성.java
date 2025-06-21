class Mains {
    int x;
}

class Maintains {
    final int xs = 100;
}

class Mas {
    int x = 45;
}

class object {
    String first_name = "Jas";
    String last_name = "Name";
    int age = 25;
}
public class 클래스속성 {
    int classes = 20;
    public static void main(String[] args) {
        /*
        java클래스 속성
        변수라는 용어 사용 x예시
        클래스 속성이 클래스내의 변수
        클래스 만들기 Main 두가지 속성으로 x와 y
        public class Main {
          int x = 50;
          int y = 30;
        }
        속성 엑세스
        클래스의 객체를 생성하고 점 구문을 사용하여 속성을 접근할수 있다
         */
        클래스속성 object = new 클래스속성();
        System.out.println(object.classes);
        /*
        속성 수정
        속성값을 수정할수도 있습니다
        값설정은 x는 400까지
         */
        Mains objects = new Mains();
        objects.x = 400;
        System.out.println(objects.x);

        //기존값 재정의합니다
        //값변경 까지 x는 250까지
        Mains objects2 = new Mains();
        objects2.x = 250;
        System.out.println(objects2.x);

        //기존값을 제정의하지 않으려면 속성을 선업합니다 final
        Maintains xss = new Maintains();
        //xss.xs = 200; error
        System.out.println(xss.xs);
        //다중객체
        //값변경은 x25i까지
        //x in myobj1 변경
        Mas main = new Mas();
        Mas main2 = new Mas();
        main2.x = 30;
        System.out.println(main.x);
        System.out.println(main2.x);

        //다중속성
        object mn = new object();
        System.out.println("Name" + mn.first_name + " " + mn.last_name);
        System.out.println("Age : " + mn.age);
    }
}
