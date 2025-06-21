class Parent {
    private int a = 10; //private필드
    public int b = 20; //public 필드
}
class Child extends Parent {
    public int c = 30; //public 필드
    void display() {
        //System.out.println(a); //상속받은 private 필드 참조
        System.out.println(b); //상속받은 public 필드 참조
        System.out.println(c); //자식클래스에서 선언한 public 필드 참조
    }
}

class Parent2 {
    int a = 10;
}

class Child2 extends Parent2 {
    void display() {
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}

class Parent3 {
    int a = 10;
}

class Child3 extends Parent3 {
    int a = 20;

    void display() {
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}

class hiddeninformation {
    int a;
    hiddeninformation() {a=10;}
    hiddeninformation(int n) {a=n;}
}

class inherit extends hiddeninformation {
    int b;
    inherit() {
        //super(40);
        b=20;
    }
    void display() {
        System.out.println(a);
        System.out.println(b);
    }
}

class Parents {
    void display() {
        System.out.println("부모클래스의 display()메소드입니다.");
    }
}

class Childs extends Parents {
    void display() {
        System.out.println("자식클래스의 display()메소드입니다.");
    }
}

class Parent4 {
    void displays() {
        System.out.println("부모 클래스의 displays() 메소드입니다");
    }
}

class Child4 extends Parent4 {
    void displays() { //오버라이딩된 displays()메소드
        System.out.println("자식 클래스의 displays() 메소드입니다.");
    }
    void displays(String str) { //오버로딩된 displays()메소드
        System.out.println(str);
    }
}

public class 상속 {
    public static void main(String[] args) {
        /*
        상속이란 기존의 클래스의 기능을 추가하거나 재정의하여 새로운 클래스를 정의하는 것을 의미한다
        캡슐화 추상화 더불어 객체지향프로그래밍 구성하는 중요한 특성중 하나입니다
        상속을 이용하면 기존에 정의되어 있는 클래스의 모든 필드와 메소드를 물려받아 새로운 클래스 생성할수 있다
        기존 정의되어 있는 클래스 부모클래스 또는 상위 클래스 가초 클래스
        상속을 통해 작성 자식 클래스 하위 클래스 파생 클래스
        기존에 작성된 클래스를 재활용할수 있다
        자식클래스 설계시 중복되는 멤버를 미리 부모 클래스에 작성해 놓으면 자시긐랠서는 해당맴버를 작성하지 않아도된다
        자식 클래스
        부모의 클래스의 모든 특성 물려받아 새롭게 작성된 크랠스
        class 자식 클래스 extends 부모클래스이름{...}
        부모클래스에 새로운 필드를 하나 추가하면 자식 크랠스에도 자동으로 해당 필드가 추가된것처럼 동작합니다
        부모클래스 접근 제어가 private나 default로 설정된 멤버는 자식클래스에서 상속받지만 접근할수 없다
        Object클래스
        모든클래스이 부모 클래스가 되는 클래스 입니다
        모든 필드와 메소드를 상속받게 됩니다
        extends 키워드 사용 Object 클래스의 상속을 명시하지 않아도 Object클래스의 모든 멤법를 자유롭게 사용할수 있다
        toString() 이나 clone()같은 메소드를 바로 사용할수 있는 이유 해당 메소드들이 Object크랠스이 메소드이기 때문입니다
        super 키워드
        부모클래스로부터 상속받는 필드나 메서드를 자식클래스에 참조하는 데 사용하는 참조변수 입니다
        인스턴스 변수의 이름과 지역변수의 이름이 같을 경우 인스턴스 변수 앞에 this키워드를 사용하여 구분할수 있었다
        부모클래스의 멤버와 자식 클래스의 멤버이름이 같을 경우 super키워드를 사용하여 구별할수 있다
        this와 마찬가리고 super참조 변수를 사용할수 있는대상도 인스턴스 메소드 뿐이다 크랠스 메소드에서 사용할수 없다
        지역변수 this 참조변수 그리고 super참조변수 모두 같은 같을 출력합니다
         super() 메소드
         this()메소드 같은 클래스의 다른 생성자 호출할때 사용된다면 super()메소드는 부모 클래스의 생성자는 호출할때 사용됩니다
         자식클래스의 인스턴스 생성 -> 해당 인스턴스에는 자식 클래스의 고유 멤버뿐만아니라 부모클래스의 모든 멤버까지 포함되어 있습니다
         부모 클래스의 멤버를 초기화 하기 위해서는 자식 크랠스의 생성자에서 부모 클래스의 생성자까지 호출해야만 합니다
         부모클래스의 생성자 호출에는 모든 클래스의 부모클래스인 Object클래스의 생성자까지 계속 거슬러 올라가면 수행됩니다
         super()
         class Parent {
            int a;
            Parent(int n) {a=n;}
         }
         Parent크랠스 상속받은 자식크랠스에서 super()메소드를 사용하면 부모 클래스의 기본생성자를 호출하게되면 오류가 발생하게 된다
         부모클래스인 Parent클래스에는 기본 생성자가 추가되어 있지 않기 때문입니다
         class Parent {
            int a;
            Parent (int n) {a=n;}
         }
         class Child extends Parent {
            int b;
            Child() {
              super();
              b = 20;
            }
         }
         */
         Child ch = new Child();
         ch.display();

         Child2 ch2 = new Child2();
         ch2.display();

         Child3 ch3 = new Child3();
         ch3.display();
         //super매소드가 어떻게 호출되는지를 보여주는 예제입니다
         //자바 컴파일러는 주석 처리된 super(40)이 자동으로 super()구문 삽입 따라서 변수 a는 10으로 초기화
         //해제하면 부모클래스인 hiddeninformation 클래스 두번째 생성자에 의해 초기화될것입니다
         //변수 a는 40으로 초기회 됩니다
         inherit inher = new inherit();
         inher.display();
         /*
         메소드 오버라이딩
         상속관계 있는 부모클래스에서 이미 정의된 메소드를 자식 클래스에서 같은 시크니처를 갖는 메소드를 다시 정의하는것
         이렇게 상속받는 메소드는 그래도 사용해도 되고 필요한 동작을 위해 재정의하여 사용할수 있다
         메소드 오버라이딩 -> 상속받는 부모클래스의 메서도를 제정의하여 사용하는 것을 의미합니다
         자식클래스는 부모클래스 private 멤버를 제외한 모든 메소드를 상속받습니다
         조건
         오버라이딩이란 메소드의 동작만을 재정의하는 것으로 메소드의 선언부는 기존 매소드와 완전히 같아야한다
         메소드의 반환타입은 부모클래스의 반환 타입으로 타입 변환할수 있는 타입이면 변경할수 있다
         부모클래스의 메소드보다 접근제어자를 더 좁은 범위로 변경할수 없게 됩니다
         부모클래스의 메소드보다 더 큰 범위의 예외를 선언할수 없다
          */
         //메소드 오버라이딩 - 상속받은 부모클래스의 메소드를 자식클래스에서 직접 재정의 할수 있다
         //부모클래스인 Parents 클래스의 dispaly()메소도를 자식클래스 Childs 클래스에서 오버라이딩 예제입니다
         Parents pa = new Parents();
         pa.display();
         Childs chs = new Childs();
         chs.display();
         Parents pc = new Childs();
         pc.display();
         //Child cp = new Parent();
        /*
        오버로딩과 오버라이딩
        오버로딩 - 새로운 메소드를 정의합니다
        오버라이딩 - 상속받은 기존의 메소드를 재정의하는 것입니다
         */
        //부모클래스인 Parent4 크랠스의 displays()메소드를 자식 클래스를 Child4클래스에서
        //오버라이딩과 오버로딩을 둘다 수행하는 예제입니다
        Child4 ch4 = new Child4();
        ch4.displays();
        ch4.displays("오버로딩된 displays()메소드입니다.");
    }
}
