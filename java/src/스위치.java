public class 스위치 {
    public static void main(String[] args) {
        /*
        if..else문장 사용
        switch 진술
        seitch(expression) {
           case x:
              //code block
           case y:
              //code block
           break:
         default:
            //code block
        }
        switch 표현은 평가됩니다
        식의 값은 각각의 값과 비교됩니다 case
        일치하는 코드가 있으면 관련된 코드블록이 실행됩니다
        break 그리고 default키워드는 선택 사항입니다
         */
        int days = 5;
        switch (days) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        //브레이크 키워드
        //java가 a도달할때 break키워드 스위치 블록에서 벗어납니다
        //더 많은 코드 및 케이스 실행이 중단됩니다
        //기본 키워드
        int days1 = 3;
        switch (days1) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }

    }
}
