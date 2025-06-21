interface Bird {
    public void bridsound();
    public void sleep();
}

class brids implements Bird {
    public void bridsound() {
        System.out.println("chick chick");
    }
    public void sleep() {
        System.out.println("zzz");
    }
}

interface FirstInterface {
    public void myMethod();
}

interface SecondInterface {
    public void myOtherMethod();
}

class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some text...");
    }
    public void myOtherMethod() {
        System.out.println("Some other text ....");
    }
}


public class 인터페이스 {
    public static void main(String[] args) {
        /*
        인터페이스
        추상화를 달성하는 또 다른 방법은 인터페이스 사용
        interface는 빈 물체와 관련된 방법을 그룹화 하는데 사용되는 완전히 abstract 클래스
        interface Animal {
           public void animalSound(); //interfacemethod
           public void run(); //interfacemethod
        }
        인터페이스 메서드에 엑세스 하려면 인터페이스가 다른 클래스에 의해 상속된것 처럼
        구현되어야합니다
        implements 키워드 (instaed의 extends) 인터페이스 메서드의 본문은 구현 클래스에 의해 제공됩니다
        추상클래스와 마찬가지로 인터페이스를 사용하여 객체를 만들수 없습니다
        인터페이스 메서드에는 본문이 없습니다
        인터페이스 구현할때 모든 메서드를 무시해야합니다
        abstract 그리고 public
        인터페이스는 생성자를 포함할수 없다
         */
        brids mybrids = new brids();
        mybrids.bridsound();
        mybrids.sleep();
        //다중인터페이스
        //여러 인터페이스 구현하려면 쉽표로 구분합니다
        DemoClass demo = new DemoClass();
        demo.myMethod();
        demo.myOtherMethod();
    }
}
