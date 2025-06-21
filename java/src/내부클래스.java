class OuterClass {
    int x = 100;

    class InnerClass {
        int y = 500;
    }
}

class Outer {
    int x = 340;
    class Inner {
        int y = 560;
    }
}

class outer {
    int x = 200;
    static class inner {
        int y = 400;
    }
}

class Outers {
    int x = 300;
    class Inners {
        public int myInnerMethod() {
            return x;
        }
    }
}

public class 내부클래스 {
    public static void main(String[] args) {
        /*
        자바 내부 클래스 - 중첩하는것도 가능합니다
        중첩된 클래스의 목적은 함께 속한 클래스를 그룹화하여 코드를 더 읽고 싶고 유지관리할수 있다
        내부클래스에 엑세스 하려면 외부 클래스의 객체를 만든 다음 내부클래스의 객체를 만듭니다
         */
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
        //프라이빗 이너클래스
        //private 또는 protected 외부 객체가 내부 클래스에 접근하지 않으려면 크랠스를 다음과 같이 선언합니다 private
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        System.out.println(outer.x + inner.y);
        //정적내부클래스
        //static 즉 외부클래스의 객체를 만들지 않고도 엑세스 할수 있다
        outer.inner myinner = new outer.inner();
        System.out.println(myinner.y);
        //내부클래스에서 외부클래스 접근
        Outers out = new Outers();
        Outers.Inners in = out.new Inners();
        System.out.println(in.myInnerMethod());


    }
}
