class Parent5 {
}
class Child5 extends Parent5 {
}
class Brother extends Parent5 {
}

abstract class Animal {
    abstract void cry();
}

class Cat extends Animal {
    void cry() {
        System.out.println("냐옹냐옹!");
    }
}

class Dog extends Animal {
   void cry() {
       System.out.println("멍멍!");
   }
}

interface Animal2 {public abstract void cry();}

//클래스 상속 키워드 자식 extends 부모 / 인터페이스 상속 키워드 자식 implements 부모
class Cat2 implements Animal2 {
    public void cry() {
        System.out.println("냐옹냐옹!");
    }
}

class Dog2 implements Animal2 {
    public void cry() {
        System.out.println("멍멍!");
    }
}

interface Animal3 {public abstract void cry();}
interface Pet {public abstract void play();}

class Cat3 implements Animal3, Pet {
    public void cry() {
        System.out.println("냐용냐용!");
    }
    public void play() {
        System.out.println("나비야 쥐잡기 놀이하자~!");
    }
}

class Dog3 implements Animal3, Pet {
    public void cry() {
        System.out.println("멍멍!");
    }
    public void play() {
        System.out.println("바둑아~ 산택가자~!");
    }
}

/*
interface Animal4 {public abstract void cry();}

interface Cats extends Animal4 {
    public abstract void cry();
}

interface Dogs extends Animal4 {
    public abstract void cry();
}

class MyPet implements Cats. Dogs {
    public void cry() {
        System.out.println("멍멍! 나옹나옹!");
    }
}
*/

public class 다형성 {
    public static void main(String[] args) {
        /*
        다형성
        하나의객체가 여러가지 타입을 가질수 있는 것 의미한다
        부모크랠스 타입과 자식크랠스 타입의 인스턴스를 참조할수 있도록 구현
        다형성은 상속 추상화 더불어 객체 지향 프로그래밍 구성하는 중요한 특징
        참조변수의 다형성
        부모 클래스타입의 참조 변수로 자식클래스 타입의 인스턴스를 참조할수 있도록 하고 있다
        이때 참조변수가 사용할수 있는 멤버의 개수가 실제 인스턴스의 멤버 개수보다 같거나 적어야참조할수 있다
        class parent {...}
        class child extends parent {...}
        parent pa = new parent(); //허용
        child ch = new child(); //허용
        parent pc = new child(); //허용
        child cp = nrw parent(); //오류발생
        특정타입의 참조변수로 당연히 같은 타입의 인스턴스를 참조할수 있다
        참조변수가 사용할수 있는 멤버의 개수가 실제 인스턴스의 맴버개수와 같기 때문이다
        부모클래스 타입의 참조변수로도 자식 클래스 타입의 인스턴스를 참조할수 있다
        참조변수가 사용할수 있는 멤버의 개수가 실제 인스턴스의 멤버개수보다 적기 때문이다
        자식클래스 타입의 참조변수로는 부모클래스타입의 인스턴스를 참조할수 없다
        참조변수가 사용할수 있는 멤버의 개수가 실제 인스턴스의 멤버개수보다 많기 때문이다
        참조변수의 타입 변환
        자바에서는 참조변수도 조건 타입 변환
        서로 상속관계 있는 클래스사이에서만 타입 변환할수 있다
        자식 클래스타입에서 부모클래스 타입이므로 타입 변환을 생략할수 있다
        하지만 부모클래스 타입에서 자식크랠스 타입으로의 타입변환은 반드시 명시합니다
        참조변수의 타입변환도 기본타입의 변환과 마찬가지로 타입 캐스트 연산자를 사용합니다
        참조 변수의 타입 변환을 보여주는 예제
        class Parent {...}
        class Child extends Parent {...}
        class Brother extends Parent {...}
        Parent pa01 = null;
        Child ch - new Child();
        Parent pa02 = new Parent();
        Brother br = null;

        pa01 = ch; //pa01= (Parent)ch; 와 같으며 타입 변환을 생략할수 있음
        br = (Brother)pa02; //타입변환을 생략할수 없음
        br= (Brother)ch; //직접적인 상속관계가 아니므로 오류발생

        instanceof연사낮
        다형성으로 인해 런타임 참조변수가 실제로 참조하고 있는 인스턴스의 타입을 확인한 필요성이 생깁니다
        instanceof연산자를 제공하며 참조변수가 참조하고 있는 인스턴스의 실제 타입을 확인할수 있도록 해줍니다
        instanceof연산자는
        참조변수 instanceof 클래스이름
        참조 변수가 실제로 참조하고 있는 인스턴스의 타입이 오른쪽에 전달된 크랠스 타입이면 true반환하고 아니면 false를 반환합니다
        참조변수가 null가리키고 있으면 false반환
         */
        //참조변수가 실제로 가리키고 있는 인스턴스 타입을 instanceof연산자로 확인하는 예제
        Parent5 p = new Parent5();
        System.out.println(p instanceof Object); //true
        System.out.println(p instanceof Parent5); //true
        System.out.println(p instanceof Child5); //false
        System.out.println();

        Parent5 c = new Child5();
        System.out.println(c instanceof Object); //true
        System.out.println(c instanceof Parent5); //true
        System.out.println(c instanceof Child5); //true
        /*
        추상클래스
        추상메소드 - 자식클래스에서 반드시 오버라이딩해야만사용할수 있는 메소드
        추상메소드가 포함된 클래스를 상속받는 자식클래스가 반드시 추상메소드를 구현하도록 하기 위해서 입니다
        예)모듈처럼 중복되는 부분이나 공통적인 부분을 미리 다 만들어진것을 사용하고
        이를 받아 사용하는 쪽에서 자신에게 필요한 부분만을 제정의하여 사용함으로써 생산성이 향상되고 배포등이 쉬워지기 때문이다
        문법
        abstruct 반환된 메소드 타입 이름();
        추상 클래스
        abstruct class 클래스 이름 {
           abstruct 반환타입 클래스이름();
        };
        추상클래스는 동작이 정의되지 않는 추상메소드를 포함하고 있으므로 인스턴스틑 생성할수 없다
        추상 클래스는 먼저 상속을 통해 자식 클래스를 만들고 만든 자식 크랠스에서 추상크랠스의 모든 추상메소드를 오버라이딩하고
        나서야비로소 자식 클래스의 인스턴스를 생성할수 있게 됩니다
        사용 목적
        추상메소드를 선언하여 사용하는 목적은 추상메소드가 포함된 클래스를 상속받는 자식 클래스가 반드시 추상메소드를 구현하기 위함이다
        일반메소드 구현 -> 사용자에 따라 해당 메소드를 구현할수 있고 안할수 도 있다
        추상메소드 포함된 추상 클래스를 상속받는 모든 자식 클래스는 추상메소드를 구현해야만 인스턴스를 생성할수 있으므로
        반드시 구현하게 됩니다
         */
        //Animal a = new Animal(); //추상클래스 인스턴스 생성할수 없음
        Cat2 c1 = new Cat2();
        Dog d = new Dog();
        c1.cry();
        d.cry();
       }
       /*
       인터페이스
       자식클래스가 여러 부모클래스 상속 받을수 있다면, 다양한 동작을 수행할수 있다
       클래스 이용하여 다중 상속을 할 경우 메소드 출처의 모호성등 여러가지 문제가 발생할수 있어
       자바에서 클래스를 통한 다중상속을 지원하지 않는다
       인터페이스 - 다른 클래스 작성 할때 기본이 되는 틀을 제공하면서 다른 클래스 사이의 중간 매개역할까지
       담당하는 일종의 추상클래스를 의미합니다
       추상 클래스는 추상메소드뿐만아니라 생성자 필드 일반 메소드도 포함할수 있다
       인터페이스 오로지 추상메소드와 상수만 포함할수 있다
       인터페이스 선언
       클래스 작성하는 방법과 같다
       접근제어자와 함께 interface키워드 사용
       접근제어자 interface 인터페이스이름 {
         public static final 타입상수이름 = 값;
         public abstract 메소드이름(매개변수목록);
       }

       클래스와 달리 인터페이스는 모든 필드는 public static final이어야 하며
       모든 메소드는 public abstract
       인터페이스 구현
       추상클래스와 마찬기지로 자신이 직접 인스턴스를 생성할수 없다
       인터페이스가 포함하고 있는 추상메소드를 구현해 줄 클래스를 작성해야합니다
       class 클래스 이름 inplements 인터페이스 이름 {...}
       모든 추상메소도를 구현하지 않는다면, abstract 키워드 사용하여 추상클래스로 선언해야합니다
        */
       //인터페이스 구현 예제
       Cat2 c2 = new Cat2();
       Dog2 d2 = new Dog2();
       //c2.cry();
       //d2.cry();
       //자바에서는 상속과 구현을 동시에 할수 있다
       //class 클래스 이름 extends 상위클래스이름 implements 인터페이스 이름 {...}
       //인터페이스를 사용한 다중 상속의 예제
       Cat3 cats = new Cat3();
       Dog3 dogs = new Dog3();
       //cats.cry();
       //cats.play();
       //dogs.cry();
       //dogs.play();
       //클래스를 이용한 다중상속의 문제점
       //클래스를 이용하여 다중상속을 하면 다음 예제와 같은 메소드 출처의 모호성 등의 문제가 발생한다
       //cat과 dog클래스 각각 부모클레스에 상속받에 cry()메소드로 오버라이딩 하고 있다
       //새로 클래스 만들때 cat dog클래스 동시 상속받으면 문제가 발생한다
       //cry메소드 호출하면 다중상속을 지원하지 않는다
      //상속받은 클래스는 cry메소드인지 dog클래스 상속받은 메소드인지 구분할수 없는 모호성을 갖게 됩니다
      //인터페이스에 다중상속을 하게되면 위에 같은 메소트 호출의 모호성을 방지할수 있다
      //대규모 프로젝트 일관되고 정형되된 개발 표준화
      //클래스 작성과 인터페이스 구현 동시 진행할수 있다 개발시간 단축
      //클래스와 클래스간의 관계 인터페이스 연결하면 클래스마다 독립적인 프로그래밍 가능하다
      //MyPet p2 = new MyPet();
      //p2.cry();
    /*
    내부 클래스
    하나의 클래스 내부에 선언된 또 다른 클래스를 의미합니다
    이러한 내부 클래스는 외부클래스에 대해 두개의 클래스가 서로 긴밀한 관계를 맺고 있을때 선언할수 있다
    class Outer {//외부클래스 ...}
    내부클래스 장점
    내부 클래스에서 외부 클래스의 멤버에 손쉽게 접근 할수 있게 됩니다
    서로 관련 있는 클래스를 논리적으로 묶어서 표현함으로써 코드의 캡슐화를 증가시킵니다
    외부에서는 내부 클래스를 접근할수 없으므로 코드의 복잡성을 줄일수 있다
    중류
    정적 클래스
    인스턴스 클래스
    지역 클래스
    익명 클래스
    외부 클래스 영역에 선언된 클래스 중에서 static 키워드 가지는 클래스를 정적클래스라고 합니다
    정적 클래스는 주로 외부 클래스의 클래스 메소드에 사용될 목적을 선언됩니다
    인스턴스 클래스 - 외부 클래스 영역에 선언된 클래스 중에서 static 키워드를 가지고 있지 않는 클래스
    인스턴스 클래스 - 외부 클래스의 인스턴스 변수나 인스턴스 메소드에 사용될 목적으로 선언됩니다
    지역클래스 - 외부클래스의 메소드나 초기화 블록에 선언된 클래스를 의미합니다
    익먕 클래스
    다른 내부 클래스와는 달리 이름을 가지징 낳는 클래스를 의미합니다
    클래스선언과 동시에 객체를 생성하므로, 단 하나의 객체만 생성하는 일화용 클래스입니다
    생성자를 선언할수도 없으며 오로지 단 하나의 클래스나 단 하나의 인터페이스를 상속받거나 구현할수 있을뿐입니다
    매우 제한적인 용도사용되며 구현해야할메소드 매우 적은 클래스 구현할때 사용됩니다
    //익명크랠스는 선언돠 동시에 생성하여 참조변수에 대입함
    클래스이름 참조변수이름 = new 클래스 이름() {//메소드 선언 };
     */
}

