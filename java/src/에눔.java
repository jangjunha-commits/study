enum Level{
    LOW,
    MEDIUM,
    HIGH
        }

enum Level2 {
    LOW,
    MEDIUM,
    HIGH
}

public class 에눔 {
    public static void main(String[] args) {
        /*
        에눔
        enum상수(가변 변수 등) 나타내는 클래스 입니다
        final변수
        만들기 enum 사용
        사용하여 쉼표로 대문자로 작성해야한다는 점을 유의하세요
        enum Level {
          LOW,
          MEDIUM,
          HIGH
        }
        enum점 구문을 가진 상수
         */
        Level Var = Level.MEDIUM;
        System.out.println(Var);
        //클래스 내부열거
        //enum수업안에서
        Level2 Var2 = Level2.LOW;
        System.out.println(Var2);
        //스위치 명세서의 열거
        //종종다음과 같은 용도 사용됩니다 switch 해당값을 확인하는 문장
        Level myVar = Level.MEDIUM;
        switch (myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium Level");
                break;
            case HIGH:
                System.out.println("High Level");
                break;
        }
        //열거형 루프스루
        /*
        values() 메서드는 모든 열거 상수 배열을 반환합니다
        열거형 상수를 반복해서 살펴보고 유용합니다
         */
        for (Level myVar2 : Level.values()) {
            System.out.println(myVar2);
        }
    }
}
