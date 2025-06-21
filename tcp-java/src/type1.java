public class type1 {
    public static void main(String[] args) {
        /*
        변수 - 데이터를 저장하기 위해 프로그램에 의해 이름을 할당받는 메모리 공간을 의미합니다
        데이터를 저장할수 있는 메모리 공강이며 저장된값을 변경할수 있습니다
        기본형 변수는 실제 연산에 사용되는 변수 입니다
        정수형 byte short int long
        실수형 float double
        문자형 char
        논리형 boolean
        변수 선언
        먼저 변수를 선언하고 초기화 해야합니다
        int num; 변수 선언
        System.out.println(num); //오류 발생
        num = 20; //변수 초기화
        System.out.println(num); //20
        타입 변수이름[, 변수이음];
        타입 변수이름 = 초깃값[,변수이름=초깃값];
        선언하고자 하는 변수 타팁이 서로 다르면 동시에 선언할수 없습니다
         */
        int num = 20;
        System.out.println(num);
        //같은 타입 통시에 변수 선언함
        //int num1, num2;
        //선언과 동시에 초기화함
        //double num3 = 3.14;
        //캍은 타입의 변수를 동시에 선언하면서 초기화함
        //double num4 = 1.25, num5 = 5.5;
        //여러변수를 동시에 초기화할수 없다
        //double num1, num2;
        //num1 = 1.45, num2 = 4.56;
        //이미 선언된 여러변수를 동시에 초기화할수 없음
        /*
        정수형 리터럴 논리형 실수형 문자형 문자열 null 리터럴
        기본타입
        byte 1바이트
        short 2바이트
        int 4바이트
        long 8바이트
        오버플로우 - 최대범위보다 큰수를 지정할때 발생하는 현살
        최상위 비트를 벗어나 데이터가 인접비트를 덮어쓰므로 잘못된 결과를 얻을수 있다
        언더플로우 - 최대범위보다 작은 수를 저장할때 발생하는 현상
         */
        byte num1 = 127;
        byte num2 = -128;
        //증감연산자
        num1++; //127 + 1
        num2--; //-128 - 1
        System.out.println(num1);
        System.out.println(num2);
        //실수형 타입
        //float - 8bit 4byte
        //double - 11bit 8byte
        //문자형 타입
        //char - 2byte
        //논리형 타입
        //boolean - 1byte - true 또는 false
        /*
        실수의 표현 방식
        2진수 표현
        고정소수점 방식
        정수부와 소수부로 나눌수 있다
        32비트 실수를 고정 소수점 방식으로 표현한다
        32비트 - 1비트(부호) 15비트(정수부) 16비트(소수부)
        부동 소수점 방식
        실수는 보통 정수부와 소수부 -> 가수부와 지수부로 나누어 표현하는 방식입니다
        살펴본 곡정 소수점 방식 제한된 자릿수 인해 표현할수 있는 범위가 매우 작다
        IEEE 부동 소수점 방식
        부호(1비트) 지수부(8비트) 가수부(23비트) = 32비트
        float형 은 6자리 정확하기 표현
        double형 타입 가장높은 자리수 15자리까지 오차없이 표현할수 있습니다
        타입 변환
        할당받는 바이트의크기가 큰 타입에서 작읍 타입으로 타입변환은 데이터 손실이 발생합니다.
         */
        double num3 = 0.1;
        for (int i = 0; i < 1000; i++) {
            num3 += 0.1;
        }
        System.out.println(num3);

        float num4 = 1.23456789f;
        double num5 = 1.233456789;

        System.out.println(num4);
        System.out.println(num5);

        //묵시적 타입 변환(자동타입변환)
        //명시적 타입 변환(강제타입변환)
        //(변환할 타입) 변환할 데이터
        //변환시키고자 하는 데이터앞의 괄호를 넣고(()) 넣고, 그 괄호안에 변환할 타입을 넣는다
        //대입연산과 산술연산에서 일어나는 묵시적 타입
        double num6 = 10;
        //int num2 = 3.14;
        double num7 = 7.0f + 3.14;
        System.out.println(num6);
        System.out.println(num7);

        int num8=7, num9=10;
        double result = num8 / num9;
        double result2 = (double) num8 / num9;

        System.out.println(result);
        System.out.println(result2);

        //int num11 = 9876543210L;
        //long num12 = 9876543210L;
        
    }
}

