class Field {
    static int classVar = 10; //클래스 변수 선언
    int instanceVar = 20; //인스턴스 변수 선언
}

class Method {
    int a = 10, b =20; //인스턴스 변수
    int add() {return a + b;} //인스턴스 메소드
    static int add(int x, int y) {return x+y;} //클래스 메소드
}

class Cars {
   private String modelName;
   private int modelYear;
   private String color;
   private int maxSpeed;
   private int currentSpeed;
    {
        //인스턴스 초기화 블록
        this.currentSpeed = 0;
    }
    Cars() {}
    Cars(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    public int getSpeed() {
        return currentSpeed;
    }
}

class InitBlock {
    static int classVar; //클래스 변수
    int instanceVar; //인스턴스 변수
    static { //클래스 초기화 블록 이용
        classVar = 10;
    }
}

class InitBlock2 {
    static int classVar = 10; //클래스 변수 명시적 초기화
    int instanceVar = 10; //인스턴스 변수의 명시적 초기화
    static { //클래스 초기화 블록 이용한 초기화 static{ 필드명 }
        classVar = 10;
    }
    { instanceVar = 20;} //인스턴스 초기화 블록을 이용한 초기화
    InitBlock2() {instanceVar = 30;} //생성자를 이용한 초기화
}

public class 클래스멤버 {
    public static void main(String[] args) {
        /*
        필드의 구분
        필드 - 클래스에 포함된 변수
        class Car {
          static int modelOutput; //클래스 변수
          String modelName; //인스턴스 변수
          void method() {
            int something = 10; //지역변수
          }
        }
        변수           생성시가               소멸시기         저장메모리   사용방법
        클래스 변수 - 클래스 메모기가 올라올때 프로그램 종료될때 메소드 영역     클래스이름.변수이름
        인스턴스 변수 -                      인스턴스 생성     인스턴스 소명   힙영역
        지역 변수 -    블록내에서 변수의 선언문이 실행될때 벗어날때   스택영역    변수이름
         */
        /*
        int var = 30; //지역변수 선언
        System.out.println(var + "\n"); //지역변수 참조

        Field.myField1 = new Field(); //인스턴스 생성
        Field.myField2 = new Field(); //인스턴스 생성

        System.out.println(Field.classVar); //클래스 변수 참조
        System.out.println(myField1.classVar);
        System.out.println(myField2.classVar + "\n");

        myFiled1.classVar = 100; //클래스 변수의 값을 변경

        System.out.println(Field.classVar); //클래스 변수 참조
        System.out.println(myField1.classVar);
        System.out.println(myField2.classVar + "\n");

        System.out.println(myField1.instanceVar); //인스턴스 변수 참조
        System.out.println(myField2.instanceVar + "\n");

        myField1.instanceVar = 200; //인스턴스 변수 값을 변경
        System.out.println(myField1.instanceVar); //인스턴스 변수 참조
        System.out.println(myField2.instanceVar);
        */
        /*
        메소드의 구분
        어떠한 작업을 수행하기 위한 명령문의 집합
        클래스내에서 메소드는 static키워드의 여부에 따라
        class Car {
           boolean door; //인스턴스 변수
           void openDoor() { //인스턴스 메소드
              door=true;
           }
           static void toggleDoor(boolean d) { //클래스 메소드
              return !d;
           }
        }
        static키워드를 지기는 메소드 - 클래스 메소드
        static키워드를 가지고 있지 않는 메소드를 인스턴스 메소드
        클래스 메소드 클래스 변수 마찬가리고 인스턴스 생성하지 않고도 바로 사용할수 있다
        클래스 메소드는 메소드 내부에서 인스턴스 변수를 사용합수 없다
        메소드 내부에는 인스턴스 변수나 인스턴스 메소드 사용하지 않고 클래스 메소드 정의하는 것이 일반적이다
         */
        //클래스의 메소드를 종류별로 생성하고 접근하는 예제
        System.out.println(Method.add(20,30)); //클래스 메소드 호출
        Method myMethod = new Method(); //인스턴스 생성
        System.out.println(myMethod.add()); //인스턴스 메소드 호출
        /*
        초기화 블록
        필드의 초기화
        필드는 초기화 하지 않아도 변수의 타입에 맞는 초깃값르로 자동으로 초기화됩니다
        지역변수와 마찬가지로 적절한 값을 초기화한후에 사용하는 것이 좋습니다
        필드는 지역변수 달리 여러가지 방법으로 초기화

        명시적 초기화
        지역변수를 초기화하는 방법과 마찬가리고 필드를 선언과 동시에 초기화
        class Field {
           static int classvar = 10; //클래스 뱐수의 명시적 초기화
           int instanceVar = 20; //인스턴스 변수의 명시적 초기화ㅈ
        생성자를 이용한 초기화는 객체의 생성과 동시에 필드에 초기화하는 방법이다
        초기화 블록
        클래스 필드의 초기화만 담당하는 중괄호로 둘러싸인 블록
         */
        //인스턴스 초기화 블록
        //단순히 중괄호만 사용하여 정의할수 있다
        //생성자와 마찬가지로 인스턴스가 생성될때마다 실행됩니다
        //여러개 생성자 있으면 모든 생성자에서 공통으로 수행되어야할 코드를 인스턴스 초기화 블록에 포함하여 코드의 중복을
        //막을수 있다
        //인스턴스 초기화 블록 이용하여 여러 생성자에서 공통된 부분을 분리하는 예제
        Cars myCar = new Cars(); //인스턴스 셍성
        System.out.println(myCar.getSpeed()); //인스턴스 메소드 호출
        //클래스 초기화 블록
        //인스턴스 초기화 블록에 static키워드 추가하여 정의할수 있다
        //클래스 초기화 블록은 클래스가 처음으로 메모리에 로딩될때 단 한번만 실행됩니다
        //클래스 초기화 블록을 이용하여 클래스 변수를 초기화 하는 예제
        System.out.println(InitBlock.classVar); //클래스 변수에 접근
        //필드의 초기화 순서
        //같은 필드가 여러번 초기화 될 가능성이 있다
        //클래스 변수 : 기본값 -> 명시적 초기화 -> 클래스 초기화 블록
        //인스턴스 변수 : 기본값 -> 명시적 초기화 -> 인스턴스 츠기화블록 -> 생성자
        //클래스 변수와 인스턴스 변수가 초기화되는 순서를 보여주는 예제
        System.out.println(InitBlock2.classVar);
        InitBlock2 myInit = new InitBlock2();
        System.out.println(myInit.instanceVar);
    }
}
