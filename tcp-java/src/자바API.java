import java.util.*;

import java.util.Random;

class Car5 {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;

    Car5(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    Car5() {
        this("아반테", 2018, "흰색", 200);
    }
    public String getModel() {
        return this.modelYear + "년식" + this.modelName + " " + this.color;
    }
}

class Car6 {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;

    Car6(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    Car6() {
        this("람보르기니", 2020, "빨간", 300);
    }

    public String getModel() {
        return this.modelYear + "년도" + this.modelName + "입니다.";
    }
}
/*
class Car7 implements Cloneable {
    private String modelName;
    private ArrayList<String> owenrs = new ArrayList<String>();

    private String getModelName() {return this.modelName;}
    public void setModelName(String modelName) {this.modelName = modelName;}

    public ArrayList getOwners() {return this.owenrs;}
    public void setOwenrs(String owenrName) {this.owenrs.add(owenrName);}

    public Object clone() {
        try {
            Car clonedCar = (Car7).super.clone();
            //clonedCar.owners = (ArrayList)oweners.clone();
        }catch(CloneNotSupportedException ex) {
            ex.printStackTrace();
            return null;
            }
    }
}
*/
public class 자바API {
    public static void main(String[] args) {
        /*
        java.lang패키지
        자바에서 가장 기본적인 동작을 수행하는 클래스들의 집합입니다
        자바에서 java.lang패키지 클래스들은 import문 사용하지 않아도 클래스
        이름만으로 바로 사용할수 있도록 하고 있습니다
        toString()메소드
        해당 인스턴스에 대한 문자열을 반환합니다
        이름과 함께 구분자로 @로 사용 뒤로 16진수 해시 코드 추가
        16진수 해시 코드값은 인스턴스 주소를 가리키는 값으로 인스턴스마다 모두 다르게 반환됩니다
         */
        //인스턴스 정보를 출력하는 예제입니다
        Car5 car01 = new Car5();
        Car5 car02 = new Car5();

        System.out.println(car01.toString());
        System.out.println(car02.toString());
        //equals 메소드
        //해당인스턴스를 매개변수로 전달받는 참조변수와 비교하여 그결과를 반환합니다
        //참조변수가 가리키는 값을 비교하므로 서로 다른 두 객체는 언제나 false를 반환하게 됩니다
        //두인스턴스를 비교하는 예제
        Car6 car03 = new Car6();
        Car6 car04 = new Car6();
        System.out.println(car03.equals(car04));
        car03 = car04; //두 참조 변수가 같은 주소를 가리킴
        System.out.println(car03.equals(car04));
        /*
        clone()메소드
        해당인스턴스를 복제하여 새로운 인스턴스를 생성해 반환합니다
        필드이 값만 복사하므로 필드의 값의 배열이나 인스턴스면 제데로 복제할수 없다
        clone()메소드 오버라이딩하며 복제가 제데로 이루어지도록 재정의해야합니다
        clone()메소드를 이용하여 인스턴스를 복제하는 예제
         */
        /*
        Car7 car05 = new Car7();

        car05.setModelName("아반테");
        car05.setOwenrs("홍길동");
        System.out.println("Car05 : " + "," + car05.getOwners() + "\n");

        Car7 car06 = new Car7();
        car06.setOwenrs("이순신");
        System.out.println("Car05 : " + car05.getOwners());
        System.out.println("Car06 : " + car06.getOwners());
        */
        /*
        자바 jaba.lang.string클래스
        char형 배열을 표현하지만 자바에서는 문자열을 위한 string이라는 클래스 별도 제공
        string클래스 문자열과 관련된 작업을 할때 유용하게 사용할수 있는 다양한 메소드가 포함되고 있다
        string크랠슨느 java.lang 패키지에 포함되어 있다
        불볍객체라고 합니다
         */
        //chatAt메소드
        //해당 문자열 특지어 인덱스 해당하는 문자열 반환
        //헤당문자열길이보다 큰인덱스나 음수 전달하면 indexOutOfBoundException오류
        String str = new String("Java");
        System.out.println("원본문자열 : " + str);

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " ");
        }
        System.out.println("\nchartAt() 메소도 호출 후 묹열 : " + str);
        /*
        compareTo()메소드
        해당문자열을 인수로 전달된 문자열과 사전편찬 순으로 비교합니다
        대소문자 구분하여 비교합니다
        두문자열이 같아면 0이 반환하여 해당문자열이 인수로 전달된 문자열보다 작으면 음수를 크면 양수를
        반환합니다
        문자열 비교할때 대소문자 구분하지 않기 => compareTolognoreCase()메소드
         */
        String str1 = new String("absc");
        System.out.println("원본문자열 : " + str1);

        System.out.println(str1.compareTo("bcef"));
        System.out.println(str1.compareTo("abcd"));

        System.out.println(str1.compareTo("Abac"));
        System.out.println(str.compareToIgnoreCase("Abcd"));
        System.out.println("compareTo()메소드 호출 후 원본문자열 : " + str1);

        //concat()메소드
        //해당문자열뒤에 인수로 전달된 문자열을 추가한 새로운 문자열을 반환합니다
        //인수로 전달된 문자열 길이가 0이면 해당문자열을 그대로 반환합니다
        //두 문자열을 연결하는 예제
        String str2 = new String("Java");
        System.out.println("원본문자열 : " + str2);

        System.out.println(str2.concat("수업"));
        System.out.println("concat() 메소드 호출 후 원본 문자열 : " + str2);

        //indexOf메서드
        //해당 문자열에서 특정 문자나 문자열이 처름으로 등장하는 위치인덱스
        //문자열 포함되지 않으면 -1 반환
        String str3 = new String("Oracle Java");

        System.out.println(str3.indexOf('o'));
        System.out.println(str3.indexOf('a'));
        //System.out.println(str3.indexOf('Java'));
        System.out.println("indexOf() 메소드 호출 후 원본문자열:" + str3);

        //trim()메소드
        //해당문자열의 맨맢과 맨뒤에 포함된 모든 공백을 제거해줍니다
        //문자열에 포함되는 띄어쓰기와 탭문자를 제거하는 예제
        String str4 = new String("  Java   ");
        System.out.println("원본문자열 : " + str4);
        System.out.println(str4 + "|");
        System.out.println(str4.trim() + "|");
        System.out.println("trim()메소드 호출후 원본문자열 : " + str4);

        //toLower toUpper 메소드
        System.out.println(str3.toLowerCase());
        System.out.println(str3.toUpperCase());
        /*
        java.lang.StringBuffer클래스
        String클래스는 인스턴스는 한번 생성되면 그 값을 읽기만 할수 있고 변경할수 없다
        인스턴스는 그값을 변경할수 있고 추가할수 있다
        클래스는 내부적으로 버퍼라고 하는 독립적인 공간을 가집니다
        버퍼크기는 기본값은 16개의 문자를 저장할수 있는 크기 생성자 통해 그크기를 별도로 설정할수 있다
        인스턴스 생성시 사용자가 설정한 크기보다 언제나 16개의 문자를 더 저장할수 있는 여유있는 크기를 생성됩나다
        문자열결합하면 내용이 합쳐진 새로운 string인스턴스 생성
        문자열 결합 -> 공간 낭비뿐만아니라 속도 또한 매우 느려짐
        문자열 바로 추가 공간의 낭비 없으며 속도가 매우 빨라진다
        불변 클래스
        클래스와 같이 한번 생성되면 그 값을 변경할수 없는 클래스 불변클래스
        가변 클래스
        클래스와 같이 자유롭게 인스턴스의값을 변경할수 있는 클래스
        불변클래스 stringBuffer 클래스의 append() insert()메소드 같이 값을 변경하는 set메소드 포함되지 않는다
        하나의 객체에 접근하면서 각각의 겍체가 서로 영향을 주어서는 안되는 경우 불변 인스턴스 사용하면 값이 변하지 않는다
        append()메소드
        인수로 전달된 값이 문자열로 변환한 후 해당 문자열이 하지막에 추가합니다
        string클래스의 concat() 메소드 같은 결과 반환하지만 내부적인 처리 속도가 훨씬 빠릅니다
        한문자열을 다른 문자열을 추가하는 예제입니다
         */
        StringBuffer str5 = new StringBuffer("Java");
        System.out.println("원본문자열 : " + str5);
        System.out.println(str5.append("수업"));
        System.out.println("append()메소드 호출후 원본 문자열 : " + str5);
        //capacity메소드 StringBuffer인스턴스의 현재 버퍼의 크기를 반환합니다
        StringBuffer str6 = new StringBuffer();
        StringBuffer str7 = new StringBuffer("Java");

        System.out.println(str6.capacity());
        System.out.println(str7.capacity());
        //기본적으로 16
        //16에 4을 더하면 20

        //delete()메소드
        //해당문자열을 제거합니다
        StringBuffer str8 = new StringBuffer("Java Oracle");
        System.out.println(str8.delete(4, 8));
        System.out.println(str8.deleteCharAt(1));
        System.out.println("deleteChartAt() 메소드 호출 후 원본 문자열 : " + str8);

        //insert()메소드
        StringBuffer str9 = new StringBuffer("java 만세");
        System.out.println("원본 문자열 : " + str9);

        System.out.println(str9.insert(4, "script"));
        System.out.println("insert()메소드 호출 후 원본문자열 : " + str9);

        //Math메소드
        //random메소드 0.0이상 1.0미만의 범위에서 임의의 double형값을 하나 생성하여 반환합니다
        //0부터 99까지의 난수를 생성하는 예제
        //System.out.println((int)(Math.random() * 100)); //0~99
        Random ran = new Random();
        System.out.println(ran.nextInt(100)); //0~99
        //범위 조절
        //(int)(Math.random() * 6) //0~5
        //System.out.println(Math.abs(-10)); //10
        //System.out.println(Math.ceil(10.1)); //11
        //System.out.println(Math.floor(10.9)); //10.0
        //max() min() 메소드
        //System.out.println(Math.max(3.14, 3.14159)); //3.14159
        //System.out.println(Math.min(3,14, 3.14159)); //3.14
        //pow()메소드 전달된 두개의 double향 값을 가지고 제곱 연산을 수행한다
        //sqrt()제곱근 값
        //System.out.println((int).Math.pow(5,2)); //25
        //System.out.println((int).Math.sqrt(25)); //5
        /*
        sin cos tan메소드
        System.out.println(Math.sin(Math.PI/6));
        System.out.println(Math.cos(Math.PI/6));
        System.out.println(Math.tan(Math.PI/6));
         */
        /*
        wrapper클래스
        래퍼 클래스 - 기본타입의 데이터를 객체로 취급한다
        예)메소드 인수 객체타입만 요구 기본타입의 데이터를 그대로 사용할수 없습니다
        기본타입의 데이터를 먼저 객체로 변환된후 작업을 수행해야합니다
        기본타입 byte short int long float double char boolean
        래퍼 클래스 byte short integer long float double char boolean
        박싱과 언박싱
        래퍼클래스는 산술연산을 위해 정의된 클래스가 아니므로 인스턴스에 저장딘 값을 변경할수 없다
        값을 참조하기 위해 새로운 인스턴스를 생성하고 생성된 인스턴스의 값만을 참조할수 있다
        기본타입 데이터 래퍼클래스의 인스턴스 변환과정 (박싱)
        래퍼클래스의 인스턴스에 저장된 값을 다시 기본타입의 데이터로 꺼내는 과정을 언박싱
         */
        //오토 박싱과 오트 언박싱
        /*
        Integer num = new Integer(17); //박싱
        int n = num.intValue(); //언박싱
        System.out.println(n);

        character ch = 'X'; //Chracter ch = new Chracter('X'); //오토박싱
        char c = ch; //char c = ch.charValue(); //오토언박싱
        System.out.println(c);
        오토박싱을 이용하면 new키워드 사용하지 않고도 자동으로 Chracter인스턴스를 생성할수 있다
        반대로 charValue() 메소도 사용하지 않고도 오토언박싱을 이용하여 인스턴스에 저장된 값을 바로 참조할수 있습니다
        오토박싱과 오토언박싱을 통해 기본 타입과 래퍼클래스 간의 다양한 연산도 가능해집니다
        오토박싱과 오토언박싱을 통해 기본 타입과 래퍼클래스 간의 다양한 연산도 가능해집니다
        */
        Integer num1 = new Integer(7); //박싱
        Integer num2 = new Integer(3); //박싱

        int int1 = num1.intValue(); //언박싱
        int int2 = num2.intValue(); //언박싱

        Integer result1 = int1 - int2;
        System.out.println(result1);

        Integer result2 = int1 + int2;
        System.out.println(result2);

        int result3 = num1 * num2;
        System.out.println(result3);
        /*
        래퍼클래스의 비교 연산도 오토언박싱을 통해 가능해지지만 인스턴스에 저장된 값이 동등 여부 반단 동등연산자 ==를 사용해서
        안되며 equals메소드 사용
        두인스턴스값을 비교하는 것이 아니라 두 인스턴스 주소값을 비교하게됩니다
        그러므로 인스턴스에 저장된 값의 동등여부를 정확히 판단하려면 equals()메소드 사용
         */
        Integer num3 = new Integer(10);
        Integer num4 = new Integer(20);
        Integer num5 = new Integer(30);

        System.out.println(num3 < num4);
        System.out.println(num3 == num5);
        System.out.println(num3.equals(num5));
        /*
        열거체
        실제값 뿐만아니라 타입까지도 체크합니다
        열거체 상숫값 재정의되더라도 다시 컴파일 할필요없다
        열거체 정의및 사용
        enum
        enum 열거체이름{상수1이름, 상수2이름,...}
        enum Rainbow {Red, Orange, Yellow, Green, Blue, Indigo, Violet}
        열거체 사용하는 방법
        열거체이름.상수이름
        Rainbow.Red
        enum Rainbow {
           Red(3), Orange(10), Yellow(21), Green(5), Blue(1), Indigo(-1), Violet(-11);
           private final int value;
           Rainbow(int value) {this.value = value;}
           public int getValue() {return value;}
        }
        values()메소드
        해당 열거체의 모든 상수에 저장한 배열을 생성하여 반환합니다
        이 메소드는 자바 모든 열거체의 컴파일러가 자동으로 추가해주는 메소드입니다
        enum Rainbow{RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET}
        public class Enum01 {
           public static void main(String[] args) {
              Rainbow[] arr = Rainbow.values();
              for (Rainbow rb : arr) {
                System,out.println(rb);
              }
           }
        }
        valueOf()메소드
        전달된 문자열과 일치하는 해당열거체의 상수를 반환합니다
        enum Rainbow{RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET}
        public class Enum01 {
           public static void main(String[] args) {
              Rainbow rb = Rainbow.valueOf("GREEN");
              System.out.println(rb);
           }
        }
        ordinal()메소드
        해당 열거체 상수가 열거체정의해서 정의된 순서를 반환합니다
        반환되는 값은 열거체 정의에서 해당 열거체에서 상수가 정의된 순서이며 상숫값 자체가 아님을 명심해야합니다
        enum Rainbow{RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET}
        public class Enum01 {
           public static void main(String[] args) {
              Rainbow idx = Rainbow.YELLOW.ordinal();
              System.out.println(rb);
           }
        }
         */
        /*
        Arrays클래스
        java.util 패키지
        java.lang패키지 다음으로 가장 많이 사용되는 패키지
        java.util패키지는 import문으로 패키지를 불러오고 나서야 클래스 이름만 사용할수 있다
        java.util.Arrays클래스
        Arrays클래스에는 배열을 다루기 위한 다양한 메소드를 포함하고 있다
        이클래슨느 java.util패키지에 포함되므로 반드시 import문으로 java.util패키지 불러오고 나서야 사용해야합니다
        binarySearch()메소드
        전달받은 배열에서 특정 객체의 위치를 이진검색 알고리즘을 사용하여 검색한후 해당위치를 반환합니다
        이 메소드는 이진 검색알고리즘으로 사용하므로 매개변수를 전달되는 배열에 sort()메소드등을 사용하여 미리 정렬되어있어야만
        작동합니다
         */
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.binarySearch(arr, 437));
        /*
        copyOf()메소드
        전달받은 배열의 특정 길이 만큼을 새로운 배열로 복사하여 반환합니다
        메소드는 첫번째 매개변수로 원본배열을 전달받고 두번째 매개변수로 원본배열에서 새로은 배열로 복사할요소의 개수를 전달받습니다
        그리고 원본 배열과 같은 타입의 복사된 새로운 배열을 반환하빈다
        새로운 배열의 길이가 원본 배열 보다 길면 나머지 요소는 배열 요소의 타입에 맞게 다음과 같은 기본값으로 채워집니다
         copyOf()메소드를 사용하여 배열 arr1의 첫번째 배열요소부터 3개의 요소를 복사하여 배열 arr2대입
         arr1에서 10개 배열 요소 복사하여 arr3에 대입합니다
         */
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = Arrays.copyOf(arr1, 3);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + " ");
        }
        System.out.println();

        int[] arr3 = Arrays.copyOf(arr1, 10);
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i] + " ");
        }
        /*
        copyOfRange()메소드
        전달받은 배열의 특정 범위에 해당하는 묘소만을 새로운 배열로 복사하여 반환합니다
        첫번째 매개변수로 복사의 대상이 될 원본배열을 전달받습니다
        원본배열과 같은 타입의 복사된 새로운 배열을 반환합니다
         */
        int[] arr4 = {1, 2, 3, 4, 5};
        int[] arr5 = Arrays.copyOfRange(arr4, 2, 4);
        for (int i = 0; i < arr5.length; i++) {
            System.out.println(arr5[i] + " ");
        } //3 4
        /*
        fill()메소드
        전달받은 배열의 모든 요소를 득정값을 초기화해줍니다
        첫번째 매개변수로 초기화할 배열을 전달받고 두번째 매개변수로 초기값을 전달받습니다
        이 메소드는 전달받은 원본 배열의 값을 변경하게 됩니다
         */
        int[] arr6 = new int[10];

        Arrays.fill(arr6, 7);
        for (int i = 0; i < arr6.length; i++) {
            System.out.println(arr6[i] + "");
        } //7777777777
        //sort()메소드
        int[] arr7 = {5, 3, 4, 1, 2};
        Arrays.sort(arr7);
        for (int i = 0; i < arr7.length; i++) {
            System.out.println(arr7[i] + "");
        } //1 2 3 4 5
        /*
        Calender클래스
        자바에서의 날짜및 시간 처리
        Calender인스턴스는 불변객체가 아니라서 값이 수정될수 있습니다
        윤초와 같은 특별한 상황을 고려하지 않습니다
        Calender클래스는 월을 나타낼때 1월부터 12월을 0부터 11까지로 표현한다
        java.util.Calender클래스
        날짜와 시간에 관한 데이터를 손쉽게 처리할수 있도록 제공해주는 추상클래스
        이클래스가 추상클래스로 선언된 이유는 나라마다 사용하는 달력 체게가 조금씩 다를수 있다
        이러한 Calender 클래스에는 날짜와 시간을 처리하기 위한 다양한 필드와 메소드가 포함되어 있다
        Calender크랠스의 모든필드는 크랠스변수이므로 객체를 생성하지 않고 바로 사용할수 있다
        java.util.GergorianCalendar클래스
        Calender클래스는 추상클래스이므로 직성 인스턴스를 생성할수 없다
        GregorianCalendar클래스는 이러한 Calendar클래스를 상속받아 드레고리오 달력 완전 구현 하위 클래스입니다
        add()메소드
        전달된 Calendar필드에서 일정시간만큼 더하거나 빼준다
         */
        //add()메소드를 이용하여 현재 시각에 120초를 더하는 예제입니다
        Calendar time = Calendar.getInstance();
        System.out.println(time.getTime());

        time.add(Calendar.SECOND, 120);
        System.out.println(time.getTime());
        //before와 after메소드
        //두시간상의 전후 관계만 알고 싶을 경우 before와 after메소드 사용할수 있다
        //before메소드는 현제 calendar인스턴스가 전달된 객체가 나타내는 시간보다 앞서는지 판단합니다
        //반대로 after 메소드는 연재 Calendar 인스턴스가 전달된 객체가 나태내는 시간보다 나중인지를 판단합니다
        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();
        Calendar time3 = Calendar.getInstance();

        time2.set(1982, 2, 19);
        time2.set(2020, 2, 19);

        System.out.println(time1.before(time2));
        System.out.println(time1.before(time3));

        //get메소드
        //Calendar필드에 저장된 값을 반환합니다
        Calendar time5 = Calendar.getInstance();

        System.out.println(time5.getTime());
        System.out.println(time5.get(Calendar.DAY_OF_WEEK));
        System.out.println(time5.get(Calendar.MONTH) + 1);
        System.out.println(time5.get(Calendar.DAY_OF_MONTH));
        System.out.println(time5.get(Calendar.HOUR_OF_DAY));
        System.out.println(time5.get(Calendar.MINUTE));
        System.out.println(time5.get(Calendar.SECOND));
        System.out.println(time5.get(Calendar.YEAR));
    //roll메소드
    //전달된 Calendar 필드에서 일정시간 만큼 더하거나 빼줍니다
    //add()메소드와 달리 Calendar필드는 영향을 주지 않습니다
    //게산결과가 해당필드의 최댓값이나 최솟값을 넘어가도 다른 필드에 영향을 주지 않습니다
    Calendar time6 = Calendar.getInstance();
    Calendar time7 = Calendar.getInstance();
    System.out.println(time6.getTime());

    time6.add(Calendar.SECOND, 60);
    System.out.println(time6.getTime());

    time7.roll(Calendar.SECOND, 60);
    System.out.println(time7.getTime());

    //set메소드
    //값 설정
    Calendar setTime = Calendar.getInstance();
    System.out.println(setTime.getTime());

    setTime.set(Calendar.YEAR, 2020);
    System.out.println(setTime.getTime());

    setTime.set(1982, 1, 19);
    System.out.println(setTime.getTime());

    setTime.set(1982, 1, 19, 12, 34, 56);
    System.out.println(setTime.getTime());
    }
}
