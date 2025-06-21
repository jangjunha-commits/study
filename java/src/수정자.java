class finals {
    final int x = 100;
    final float PI = 35.48f;
}

class Main7 {
    static void StaticMethod() {
        System.out.println("Static method");
    }
    //public method
    public void PublicMethod() {
        System.out.println("Public method");
    }
}

abstract class abstract_main {
    public String firstName = "John";
    public int age = 29;
    public abstract void study();
}

class Person extends abstract_main {
    public int grduationYear = 2020;
    public void study() {
        System.out.println("Studying all day long");
    }
}

public class 수정자 {
    static void StaticMethod() {
        System.out.println("Static method");
    }
    public static void main(String[] args) {
        /*
        수정자
        public 거의 모든 예제를 나타내는 키워드
        public class Main
        public 키워드 접근 수정자로 클래스 속성 메서드 및 생성자의 접근 수준을 설정하는데 사용
        접근 수정자 - 접근 수준을 제어합니다
        비접근 수정자 - 접근 수준을 제어하지 않고 다른 기능을 제공합니다
        접근 수정자
        public
        default
        속성 및 메서드 및 생성자의 경우
        public
        private
        default
        protected
        비접근 수정자
        final
        abstract
        속성및 메서드의 경우 다음 중 하나를 사용할수 있다
        final
        static
        abstract
        transint
        synchornized
        volatile
         */
        //최종
        //기존 속성값을 재정의하지 않으려면 속성르 다음과 같인 선업합니다
        finals fin = new finals();
        System.out.println(fin.x);
        System.out.println(fin.PI);
        //fin.x = 200; error
        //fin.PI = 45.67f; error
        //정적
        //static메서드는 클래스의 객체를 만들지 않고도 엑세스 할수 있다 public
        StaticMethod(); //call the static method
        Main7 object = new Main7();
        object.PublicMethod();
        //추상적인
        //abstract 메서드는 클래스 본체가 없습니다
        //본문은 하위클래스에 의해 제공됩니다
        Person object2 = new Person();
        System.out.println("Name : " + object2.firstName);
        System.out.println("Age : " + object2.age);
        System.out.println("Graduation Year : " + object2.grduationYear);
        object2.study();
    }
}
