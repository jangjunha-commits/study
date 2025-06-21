class Car {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    Car(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }
    public String getModel() {
        return this.modelYear + "년식" + this.modelName + " " + this.color;
    }
}
//Car2 클래스 생성자를 정의하지 않고 기본생성자를 호출하는 예제
class Car2 {
    private String modelName = "소나타";
    private int modelYear = 2017;
    private String color = "흰색";

    public String getModel() {
        return this.modelYear + "년식" + this.color + " " + this.modelName;
    }
}

class Car3 {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    Car3(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color= color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }
    public String getModel() {
        return this.modelName + "차는" + this.modelYear + "년도 입니다." + this.color;
    }
}

//Car4클래스 생성자 나타낸 예제
//생성자의 매개변수 이름과 인스턴스 변수의 이름이 같을 경우에는 인스턴스 변수 앞에 this 키워드를 붙여 구분해야합니다
//이렇게 자바 this 참조 변수를 사용하여 인스턴스 변수에 접근할수 있다
//this 참조 변수를 사용할수 있는 영역은 인스턴스 메소드뿐이며 클래스 메소드에는 사용할수 없다
//모든 인스턴스 메소드에는 this 참조변수가 숨겨진 지역변수로 존재하고 있다
//this()메소드 생성자 내부에서만 사용할수 있으며 같은 클래스의 다른 생성자를 호출할때 사용합니다
//this()메소드에 인수를 전달하면 생성자 중에서 메소드 시그니처가 일치하는 다른 생성자를 찾아 호출해줍니다

class Car4 {
   private String modelName;
   private int modelYear;
   private String color;
   private int maxSpeed;
   private int currentSpeed;

   Car4(String modelName, int modelYear, String color, int maxSpeed) {
       this.modelName = modelName;
       this.modelYear = modelYear;
       this.color = color;
       this.maxSpeed = maxSpeed;
       this.currentSpeed = 0;
   }
}

//this참조변수와 this() 메소드를 사용한 예제
class Area {
    private String cityName;
    private int loacalNumber;
    private String location;
    private int countrynumber;
    private int currentnumber;

    Area(String cityName, int loacalNumber, String location, int countrynumber) {
        this.cityName = cityName;
        this.loacalNumber = loacalNumber;
        this.location = location;
        this.countrynumber = countrynumber;
        this.currentnumber = 0;
    }
    Area() {
        this("파리", 82, "프랑스", 84); //다른 생성자를 호출함
    }
    public String getArea() {
        return this.cityName + "도시는" + this.loacalNumber + "지역번호이며" + " " + this.countrynumber;
    }
 }

//display()메소드 다양한 시그니처로 오버로딩하는 예제
class Test {
    static void display(int num1) {
        System.out.println(num1);
    }
    static void display(int num1, int num2) {
        System.out.println(num1 * num2);
    }
    static void display(int num1, double num2) {
        System.out.println(num1 + num2);
    }
}

class Math {
    static int recursiveSum(int n) {
        if(n==1) { //n이 1이면 그냥 1을 반환함
            return 1;
        }
        return n + recursiveSum(n-1); //n이 1아니면 n을 1무터 (n-1)까지 합과 더한값을 반환함
    }
}
public class 메소드 {
    public static void main(String[] args) {
        /*
       주의 클래스 선언시 자바 파일 만드는 위에 변수로 클래스 만들어서 전역변수 안에 지역변수에
       만들 클래스 속성안에 생성자 부르도록

       생성자 인스턴스 변수초기화
       클래스를 가지고 객체를 생성하면 해당객체는 메모리 즉시 생성됩니다
       클래스 변수와 인스턴스 변수 별도 초기화히지 않는다면 자동으로 조기화
       인스턴스변수 private변수 이러한 private변수 사용자나 프로그램 접근할수 없다
       생성자(constructor)
       객체 생성동시 초기화 -> 생성자 메소드
       자바에서 생성자의 이름은 해당클래스 이름과 같아야합니다
       생성자 특징
       1.생성자는 반환값 없지만 반환타입 void로 선언하지 않습니다
       2.생성자는 초기화 위한 데이터를 인수로 전달받기
       3.객체초기화 -> 여러개 존재 -> 하나의 클래스 여러개 생성자 가질수 있다
       Car클래스 선언 여러개 생성자 선언하는 메서드
       Car(String modelName) {}
       Car(String modelName, int modelYear) {}
       Car(String modelName, int modelYear, String color) {}
       생성자의 선언
       클래스 생성자 선언하는문법
       1.클래스 이름() {...} //매개변수가 없는 생성자 선언
       2.클래스 이름(인수1, 인수2, ....) {.....} //매개변수가 있는 생성자 선언
         */
       //Car클래스 생성자를 선언하는 예제
       /*class Car {
           Car(String modelName, int modelYear, String color, int maxSpeeds) {
               this.modelName = modelName;
               this.modelYear = modelYear;
               this.color = color;
               this.maxSpeeds = maxSpeeds;
               this.currentSpeed = 0;
           }*/
           // 클래스의 생성자는 어떤 반환값도 명시하지 않음에 주의해야합니다
           //생성자 호출
           //new키워드 사용하여 객체를 생성할때 자동으로 호출합니다
           Car myCar = new Car("아반테", 2016, "검정색", 200); //생성자의 호출
           System.out.println(myCar.getModel()); //생성자에 의해 초기화 되었는지 확인
        /*
        기본 생성자
        자바의 모든 클래스에는 하나이상의 생성자가 정의되어야 합니다
        특별히 생성자를 정의하지 않고도 인스턴스를 생성할수 있다
        컴파일러 -> 기본생성자라는 것을 기본적으로 제공해주게 때문이다
        기본생성자 -> 매개변수 하나도 가지지 않으며 아무런 명령어도 포함하고 있지 않다
        자바 컴파일러 컴파일시 클래스에 생성자가 하나도 정의되어 있지 않으면, 자동으로 다음과 같은 기본생성자를 추가합니다
        클래스 이름() {}
        자바 컴파일러가 Car클래스 자동으로 추가해주는 기본 생성자의 예제
        Car() {}
         */
        Car2 myCar2 = new Car2();
        System.out.println(myCar2.getModel());
        /*
        Car2클래스의 인스턴스인 myCar2는 기본생성자를 사용하여 생성됩니다
        기본생성자는 아무런 동작도 하지 않으므로 인스턴수 변수를 클래스 필드에서 바로 초기화하고 있다
        인스턴스 변수의 초기화는 생성자를 사용하여 수핼할수 있지만 클래스 필드에서 바로 수행할수 있습니다
        매개변수를 가지는 생성자를 하나라도 정의 했다면 기본생성자는 자동으로 추가되지 않습니다
        따라서 매개변수를 가지는 생성자를 하나의상으로 정의한후 기본생성자를 호출하면 오류가 발생한다
         */
        //Car3 myCar3 = new Car3(); //기본생성자 호출
        //Car3 myCar3 = new Car3("소나타", 2017, "흰색", 200); //생성자 호출
        //System.out.println(myCar3.getModel()); //생성자 의해 초기화 되었는지 학인
        /*
        this참조 변수
        인스턴스가 바로 자기 자신을 참조하는데 사용하는 변수
        이러한 this참조변수는 해당 인스턴스의 주소를 가키리고 있다
         */
        Area France = new Area();
        System.out.println(France.getArea());
        /*
        매개변수를 가지는 첫번째 생성자는 this 참조변수를 사용하여 인스턴스 변수에 접근하고 있다
        매개변수를 가지지 않는 두번째 생성자는 내부에서 this()메소드를 이용하여 첫번째 생성자를 호출합니다
        내부적으로 다른 생성자를 호출하여 인스턴스 변수를 초기화 할수 있다
         */
        /*
        메소드 오버로딩
        핵심은 메소드 시그니처에 있다
        메소드의 선언부에 명시되는 매개변수 리스트를 기리킵니다
        두 메소드가 매개변수의 개수와 타입, 그 순서까지 모두 같다면 이 두메소드의 시고니처는 같다고 할수 있다
        오버로딩 -> 같은 이름의 메소드를 중복하는 정의한다
        원래 한 클래스 내에서 같은 이름의 메소드를 둘이상 가질수 없다
        하지만 매개변수 타입을 다르게 하면 하나의 이름을 메소드로 작성할수 있다
        서로 다른 시그치너를 갖는 여러 메소드를 같은 이름으로 정의하는 것
        메소드에 사용되는 이름을 절약(메소드 오버로딩)
        메소도 호출 할때 전달해야할 매개변수의 타입이나 개수에 대해 신경쓰지 않고 호출할수 있다
        다형성
        매소드의 대표적인 예로 println()메소드 들수 있다
        println()메소드는 전달받는 매개변수의 타입에 따라 적절한 원형 호출
        println()
        println(boolean x)
        println(char x)
        println(char[] x)
        println(double x)
        println(float x)
        println(int x)
        println(long x)
        println(Object x)
        println(String x)
        오버로딩의 조건
        1.메소드의 이름이 같아야합니다
        2.메소드의 시그니처, 즉 매개변수의 타입이 달아야합니다
        메소드의 시그니처는 같은데 반환타입만이 다른경우 오버로딩이 성립되지 않습니다
        예제
        void display(int num1) //전달받은 num1을 그래도 출력함
        void display(int num1, int num2) //전달받은 두정수의 곱을 출력함
        void display(int num1, double num2) //전달받은 정수와 실수의 합을 출력함
        //display()메소드 호출하면 컴파일러는 자동으로 같은 시그니처를 가지는 메소드 찾아 호출
        display(10); //1번 display()메소드 호출 -> 10
        display(10,20); //2번 display()메소드 호출 -> 10 20
        display(10, 3.14); //3번 display()메소드 호출 -> 13.14
        display(10, 'a'); //2번 3번 모두 호출가능 'a'는 아스키코드 번호 의해 2번 3번 가능 65번
         */
        Test myfunc = new Test();
         myfunc.display(10);
         myfunc.display(10,20);
         myfunc.display(10,3.14);
         myfunc.display(10,'a');
         /*
         재귀호출
         매소드 내부에서 해당매소드가 또다서 호출되는 것의미합니다
         자기가 자신을 계속해서 호출하므로 끝없이 반복될것입니다
         매소드내에서 재위 호출을 중단하도록 조건이 변경될 명령문을 반드시 포함
          */
         //재귀호출 사용하지 않고 1부터 n까지의 합 구하는 메서드 만들기
        /*int sum(int n) {
            int result = 0;
            for (int i=0; i<=n; i++) {
                result += i;
            }
            return result;
        }
        sum()메소드는 재귀호출사용하지 않고 만든 메소드
        재귀 호출을 사용하여 1부터 n까지의 합을 구하는 recursiveSum() 메소드 만들기
        1부터 4까지의 합을 구하는 알고리즘
        n이 1이아니면 n과 1부터 (n-1)까지의 합을 더한값을 반환함
        n이 1이면 그냥 1을 반환함
         */
        //논리적인 재귀알고리즘을 구상하고 의사코드를 작성하면 재귀 호출을 이용해 바로 코드로 옮길수 있다
        System.out.println(Math.recursiveSum(10));
    }
}
