import java.util.function.*;

@FunctionalInterface
interface Calc {
    //함수형 인터페이스 선언
    public int min(int x, int y);
}

public class 람다표현식 {
    public static void main(String[] args) {
        /*
        람다표현식
        메소드를 하나의 식으로 표현한 것입니다
        int min(int x, int y) {
          return x<y? x:y;
        }
        (x,y) -> x<y ? x:y
        클래스를 작성하고 객체를 생성하지 않아도 메소드를 사용할수 있다
        크랠스 선언과 동시에 객체를 생성하므로 단 하나의 객체만을 생성할수 있는 클래스를 익명클래스라고 한다
        익명크랠스
        new Object() {
           int min(int x, int y) {
             return x<y? x:y;
           }
        }
        람다표현식작성
        화살표(->) 기호를 사용해 람다표현식을 작성할수 있다
        (매개변수목록) -> {함수몸체}
        매개변수의 타입을 추론할수 있는 경우에는 타입을 생략할수 있다
        매개변수가 하나인 경우에 괄호를 생략할수 있다
        함수의 몸체가 하나의 명령문만으로 이루어진 경우네는 중괄호를 생략할수 있다
        함수의 몸체가 하나의 return문으로만 이루어진 경우에는 중괄호 생략할수 없다
        return문 대신 표현식을 사용할수 있으며 이때 반환값은 표현식의 결괏값이 됩니다
        전통적인 방식인 스레드 생성과 람다표현식을 사용한 스레드 생성을 비교하는 예제
         */
        new Thread(new Runnable() {
            public void run() {
                System.out.println("전통적인 방식의 일회용 스레드 생성");
            }
        }).start();

        new Thread(()-> {
            System.out.println("람다 표현식을 사용한 일회용 스레드 생성");
        }).start();
        /*
        함수형 인터페이스
        람다 표현식을 사용할때 람다표현식을 저장하기 위한 참조 변수의 타입을 결정해야합니다
        참조변수의 타입 참조변수의이름 = 람다표현식
        참조변수의 타입을 함수형 인터페이스라고 부릅니다
        어노테이션을 사용하여 함수형 인터페이스를 명시할수 있다
        @Functionallnterface
        어노테이션을 인터페이스의 선언앞에 붙이면 컴파일러는 해당 인터페이스를 함수형 인터페이스로 인식합니다
        함수형 인터페이스를 선언하고 사용하는 예제
         */
        Calc minNum = (x,y) -> x<y? x:y; //추상메소드 구현
        System.out.println(minNum.min(3,4)); //함수형 인터페이스 사용
        /*
        메소드 참조
        람다표현식의 단 하나의 메소드만 호출하는 경우
        해당 람다표현식에서 불필요한 매개변수를 제거하고 사용할수 있도록 해줍니다
        불필요한 매개변수를 제거하고 다음과 같이 '::'기호 사용 표현
        클래스이름::메소드이름
        또는
        참조변수이름::메소드이름
        예제 두개의 값을 전달받아 제곱연산을 수행하는Math클래스의 클래스메소드인 pow()메소드를 호출하는 람다 표현식입니다
        (base, export) -> Math.pow(base, exponent)
        Math클래스의 pow()메소드로 인수를 전달하는 역할만 하므로 메소드 참조를 사용하여 다음과 같이 표현
        Math::pow
        특정인스턴스의 메소드를 참조할때에도 참조변수의 이름을 통해 메소드참조를 사용할수 있다
        MyClass obj = new MyClass;
        Function<String, Boolean> func = (a) -> obj.equals(a); //람다표현식
        Function<String, Boolean> func = obj::equals(a); //메소드 참조
        배열을 생성ㅎ라때도 다음과 같이 생성자 참조를 할수 있다
        Function<Integer, double[]> func1 = a -> new double[a]; //람다표현식
        Function<Integer, double[]> func2 = double[]::new; //생성자 참조
        객체를 생성하고 반환하는 람다표현식입니다
        (a) -> {return new Object(a);}
        생성자 참조
        Object클래스의 인스턴스를 생성하고 반환하기만 하므로 생성자 참조를 사용하여 다음과 같이 표현
        Object::new
         */
        //람다표현식과 메소드 참조를 비교하는 예제
        /*
        DoubleUnaryOperator oper;

        oper = (n) -> Math.abs(n); //람다표현식
        System.out.println(oper.applyAsDouble(-5));

        oper = Math::abs; //메소드 참조
        System.out.println(oper.applyAsDouble(-5));
        */
    }
}
