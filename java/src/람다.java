import java.util.ArrayList;
import java.util.function.Consumer;

interface StringFunction {
    String run(String str);
}

public class 람다 {
    public static void main(String[] args) {
        /*
        자바 람다 표현식
        매개변수를 가져와서 값을 반환하는 짦은 코드 블록입니다
        람다표현식은 메서드와 유사하지만 이름이 필요하지 않으며 메서드 본문에서 구현할수 있다
        구문
        parameter -> expression
        여러매개변수를 사용하려면 괄호 안에 묶습니다
        (parameter1, parameter2) -> expression
        표현이 제한되어 있습니다 값은 즉시 반환해야하머 다음과 같은 변수 할당 또눈 문을 표함할수 없다
        if for 더 복잡한 작업을 수행하기 위해 코드 블록을 컬리 브레이스와 함께 사용할수 있다
        람다표현식 값 반환하는 경우
        return 진술
        (parameter1, parameter2) -> {code block}
        람다표현식 사용
        일반적으로 함수에 매개변수로 전달됩니다
        람다표현식 사용 ArrayList와 forEach() 목록에 모든 항목을 인쇄하는 방법
         */
        ArrayList<Integer> int_num = new ArrayList<Integer>();
        int_num.add(40);
        int_num.add(20);
        int_num.add(23);
        int_num.add(56);
        int_num.forEach((n) -> {
            System.out.println(n);
        });
        //변수의 유형의 하나의 메서드만 있는 인터페이스인 경우 람다 표현식을 변수에 저장할수 있다
        //람다표현식을 해당방법과 동일한 수의 매개변수와 동일한 반환 유형을 가져야합니다
        //많은 종류의 인터페이스가 내장되어 있다
        //Consumer인터페이스 java.util목록에서 사용됩니다
        //Consumer변수에 람다표현식을 저장하는 인터페이스
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(40);
        number.add(30);
        number.add(20);
        number.add(10);
        Consumer<Integer> method = (n) -> {
            System.out.println(n);

        };
        number.forEach(method);
        //메서드에서 람다표현식을 사용하려면 메서드 유형에 단일 메서드 인터페이스를 가진 매개변수가 있어야합니다
        //인터페이스 메서드를 호출하려면 람다 표현식이 실행됩니다
        //람다표현식을 매개변수로 사용하는 메서드를 만듭니다
        StringFunction excliam = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", excliam);
        printFormatted("Hello", ask);
        }
        public static void printFormatted(String str, StringFunction format) {
            String result = format.run(str);
            System.out.println(result);
    }
}
