public class 데이터type {
    public static void main(String[] args) {
        //데이터 유형
        //원시데이터 포함 - byte short int long float double boolean 그리고 char
        //비원시적 데이터 유형 - String 배열 및 클래스 확인할수 있다

        //자바 숫자
        //정수형 - 소수없이 양수 또는 음수
        //byte short int 그리고 long
        //부동 소수점 - 분수 부분이 있는 숫자 하나이상의 소수 포함합니다
        //float 그리고 double

        //정수유형
        byte bytes = 126; //byte -128에서 127까지 저장할수 있다
        System.out.println(bytes);

        //short
        //-32768에서 32767까지의 정수를 저장할수 있다
        short shorts = 32000;
        System.out.println(shorts);

        //int
        //-2147483648에서 2147483647까지의 정수를 저장할수 있다
        int integer = 2100000000;
        System.out.println(integer);

        //long
        //-900경에서 920경까지 정수를 저장할수 있다
        //값은 L로 끝나는 것이 좋다
        long longNumber = 15000000000L;
        System.out.println(longNumber);

        /*
        부동 소수점 유형
        소주점이 9.99또는 3.14515와 같은 숫자가 필요할때 부동 소수점 타입을 사용해야합니다
        float그리고 double데이터 유형은 분수 숫자를 저장할수 있다
         */
        float fnumber = 5.68f;
        System.out.println(fnumber);
        //이중 예제
        double dnumber = 19.390d;
        System.out.println(dnumber);

        //float또는 double?
        //float는 소수점이하 여섯자리 또는 일곱자리 숫자에 불과합니다
        //double변수의 정밀도는 16자리입니다

        //부동소수점 숫자는 10의 거듭제곱을 나태나는 e를 가진 과학적 숫자
        float fnum = 45e6f;
        double dnum = 43E9d;
        System.out.println(fnum);
        System.out.println(dnum);

        //불리언
        //예/아니오
        //켜짐/꺼짐
        //참/거짓
        //true 또는 false
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        //성격
        //char데이터 유형은 단일 문자를 저장하는데 문자 'A'또는 'c'와 같은 단일 따옴표로 둘러싸여 있다
        char oneString = 'a';
        System.out.println(oneString);

        //ascll값이 익숙한 경우 특정 문자를 표시하는데 사용할수 있다
        char ascll = 65, ascll2 = 120, ascll3 = 67, asclls = 87;
        System.out.println(ascll);
        System.out.println(ascll2);
        System.out.println(ascll3);
        System.out.println(asclls);

        //줄들
        //String데이터 유형은 일련의 문자(텍스트)를 저장하는데 사용됩니다
        //문자열 값은 큰따옴표롤 둘러싸여 있다
        String greet = "Hello Java";
        System.out.println(greet);

        //사례
        //여러 항목의 총비용을 계산하고 출력하는 실제 사례 입니다
        int item = 40;
        float Peritem = 9.345f;
        float totalCost = item * Peritem;
        char currencys = '$';

        System.out.println("total cost = " + totalCost + currencys);

        //비원시적 데이터 유형
        /*
        비원시적 데이터 유형은 객체를 참조하기 때문에 참조유형이라고 합니다
        원시 데이터 비원시적 유형
        원시 유형 - 미리 정의되어 언어에 내장되어 있으며, 비원시 유형은 프로그래머에 의해 생성됩니다(에외 String)
        비원시적 유형 - 특정 작업 수행 메서드 호출 사용할수 있는 반면 원시적 유형은 호출할수 없습니다
        원시 유형 소문자로 시작합니다 비primitive 타입은 일반적으로 대문자로 시작합니다 (String)
        원시 유형은 항상 값을 가지는 반면 비원시 유형은 다음과 같다 null
         */
    }
}
