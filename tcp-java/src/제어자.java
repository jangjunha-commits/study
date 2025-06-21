public class 제어자 {
    public static void main(String[] args) {
        /*
        패키지
        클래스와 인터페이스의 집합
        클래스나 인터페이스 함께 묶음으로써 파일을 효율적으로 관리
        충돈문제 까지도 패키지 이용 피할수 있다
        물리적은 하나의 디렉터리
        하나의 패키지 속한 클래스나 인터페이스 파일 -> 해당 패키지의 이름의 디렉터리 포함
        패키지 -> 다른 패키지  포함 -> 디렉터리의 계층구조는 점으로 구분
        String클래스의 패키지 이름
        java.lang.String
        자바의 String 클래스는 java.lang패키지에 속한 클래스
        패키지의 선언
        package 패키지 이름
        이름없는 패키지
        모든 클래스 반드시 하나 이상의 패키지 포함
        자바 컴파일러 -> 이름 없는 패키지 포함 컴파일한다
        패키지 명시하지 않는 모든 클래스와 인터페이스는 모두 같은 패키지에 포함
        import문은 자바 컴파일러 코드에서 사용할 클래스의 패키지에 대한 정보를 미리 제공하는 역할을 합니다
        import문 사용하면 다른패키지에 속한 클래스를 패키지 이름을 제외한 클래스 이름만으로 사용할수 있게 됩니다
        import문 선언
        import 패키지이름.클래스이름;
        import 패키지이름.*;
        패키지 이름은 패키지 경로까지 포함한 풀네임 명시
        첫번째 방법은 해당패키지의 특정 클래스만 사용하고자 할때 사용
        두번째 방법은 해당패키지의 모든 클래스 이름만으로 사용하고 싶을때 사용
        import문 특징
        import문 선언 별포 * 사용하는 것 해당패키지에 포함된 다른 모든 하위 패키지 클래스까지 포함해주는 것은 아닙니다
        import java.awt.*;
        import java.util.*;
        두개의 import문을 사용하여 하나의 import문으로 표햔할수 없다
        import java.*;
         */
        /*
        접근 제어자
        제어자 - 클래스와 클래스 멥버의 선언시 사용하여 부가적인 의미를 부여하는 키워드를 의미한다
        접근 제어자
        객체지향에서 정보은닉 -> 사용자가 궅이 알핑요 없는 정보를 사용자로부터 숨겨야한다는 개념입니다
        그렇게 함으로써 사용자는 언제나 최소한의 정보만으로 프로그램을 손쉽게 사용할수 있다
        정보은닉을 위해 접근제어자를 제공하고 있다
        클래스 외부에서의 직접적인 접근을 허용하지 않는 멤버를 설정하여 정보은닉을 구체화할수 있다
        private public default protected

        private접근 제어자
        선언된 클래스 맴버는 외부에 공개되지 않으며 외부에서는 직접 접근할수 없다
        클래스 내부의 세부적인 동작을 구현하는데 사용
        해당 맴버를 선언한 클래스에서만 접근할수 있다
        public class SameClass {
           private String var = "같은 클래스만 허용"; //private필드
           private String getVar() { //private메소드
             return this.var;
           }
        }
        public 접근 제어자
        선언된 클래스 멥버는 외부로 공개되며 해당 객체를 사용하는 프로그램 어디에서나 직접접근할수 있다
        자바 프로그램 public메소드 통해서만 해당 객체의 private 멤버에 접근할수 있다
        public메소드는 private 멤버와 프로그램 사이의 인터페이스역할을 수행한다고 할수 있다
        public class Everywhere {
           public String var = "누구든지허용"; //public 필드
           public String getVar() { //public 메소드
             return this.var;
           }
        }
        default 접근 제어
        클래스및 클래스 맴버의 접근제어의 기본값으로 default 접근 제어를 별도로 명시하고 있다
        접근제어자가 지정되지 않으면 자동적으로 default 접근 제어를 가지게 된다
        default접근 제어를 가지는 멥버는 같은 클래스의 멤버와 같은 같은 패키지에 속하는 멤버에서만 접근할수 있다
        package test;
        public class SamePackage {
           String sameVar = "같은 패키지는 허용"; //default필드
        }
        같은 클래스도 접근 허용
        package test;
        public class SameClass {
           String var = "다른패키지 접근 불가"; //default필드
           public static void main(String[] args) {
             SamePackage sp = new SamPackage();
             System.out.println(sp.sameVar); //같은 패키지는 허용
           }
        }
        protected 접근 제어자
        private 맵버로 정보 은닉하고 public 멤버로 사용자나 프로그램 인터페이스 구축합니다
        부모클래스와 관련된 접근 제어자가 하나 더 존재합니다
        protected 멥버는 부모클래스에 대해서 public멥버처럼 취급되며 외부에서 private멥버처럼 취급된다
        1.맴버선언한 클래스의 멥버
        2.이 멥버를 선언한 클래스가 속한 패키지의 멥버
        3.이 멤버를 선언한 클래스를 상속받는 자식 클래스의 멥버
        package test;
        public class SameClass {
           protected String sameVar = "다른 패키지에 속하는 자식 클래스 까지 허용"; //protected필드
        }
        pacakege test.other;
        import test.SameClass; //test패ㅣ지의 SaneClass클래스를 불러들여 포함시킴

        public class ChildClass extends SameClass {
          public static void main(String[] args) {
             SameClass = new SameClass();
             System.out.println(sp.sameVar); //다른패키지에 속하는 자식클래스 까지 허용
          }
        }
        접근 제어자의 접근 범위
        public은 같은 클래스 멤버이며 같은 패키지의 맵버이며 자식클래스의 맴버이며 그외 영엉역 허용된다
        protected는 캍은 클래스 영역이며 같은 패키지 맴버이며 자식크랠스 맴버이며 그외 영역은 허용되지 않는다
        default는 같은 클래스 영역이며 같은 패키지 영역이며 자식클래스 맴버는 아니며 그외 영역은 아니다
        private는 같은 클래스 멤버이면 같은 패키지 자식클래스 맵버 그외 영역은 아닙니다
         */
        /*
        final 제어자
        변경할수 없다는 의미이다
        필드나 지역변수에 사용하면 값을 변경할수 업슨 상수사 됩니다
        클래스 사용하면 다른 클래스가 상속받을수 없다
        메소드 사용-> 오버라이딩 재정의 할수 없다
        static 제어자
        공통적인 의미
        static 제어자는 변수 사용하면 해당변수를 클래스 변수로 만들어 준다
        메소드를 사용하면 해당 메소드를 클래스 메소드를 만들어준다
        static제어자는 초기화 블록 사용
        1.프로그램 시작시 최소에 단 한번만 생성되고 초기화된다
        2.인스턴스를 생성하지 않고도 바로 사용할수 있다
        3.해당 클래스의 모든 인스턴스가 공유합니다
        class Car {
          static int car; //클래스 필드
          static {
            //보통 클래스 필드의 초기화를 진행함
          }
          static void brake() {
            //클래스 메소드(static메소드)
          }
          //abstruct 제어자
          추상적인
          선언부만 있고 구현부가 없는 메소드를 추상메소드라고 합니다 반드시 abstruct제어자를 붙여야합니다
          하나이상의 추상메소드가 포함하고 있는 추상클래스도 반드시 abstruct제어자를 붙어야합니다
          abstruct class Car { //추상 클래스
            abstruct void brake(); //추상 메소드
          }
        }
        클래스 public (default) final abstruct
        메소드 모든 접근제어자 final static abstruct
        필드 모든 접근제어자 final static
        지역변수 final
        초기화 블록 static

        클래스에는 final과 abstruct 함께 사용할수 없다
        메소드에 static과 abstruct는 함께 사용할수 없다
        메소드에 private과 abstruct는 함께 사용할수 없다
        메소드에 private과 final은 함께 사용할 필요 없다
         */
    }
}
