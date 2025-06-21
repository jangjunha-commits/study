public class ifelse문 {
    public static void main(String[] args) {
        /*
        <미만 <= 이하 >크다 >=크거나같음
        == 같다 != 같지 않다
        if지정된 조건 참 -> 코드블록 지정
        else 동일한 조건 거짓 -> 실행 코드블록 지정
        else if 테스트할 새로건 지정 첫번째 거짓
        switch실행할 코드의 여러대체 블록 지정
        if문
        if(condition) {}
        예시 우리는 20이 18보다 큰지 알아보기 위해 두가지 테스트합니다
        조건이 같은 경우 true 텍스를 인쇄합니다
        */
        if (20 > 18) {
            System.out.println("20 is greeter than 18");
        }
        //변수를 테스트할수도 있다
        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("20 is greeter than 18");
        }

        /*
        구문
        if (condtion) {
            //실행문
        } else {
           //condtion 아니면 실행문
        }
         */
        int time = 18;
        if (time < 16) {
            System.out.println("Afternoon");
        } else {
            System.out.println("Dinner");
        }
        //다른 if문
        //else if 첫번째 조건이 다음과 같은 경우 새로건을 지정하는 문장
        /*
        구문
        if (condtion) {
            //실행문
        } else if {
           //condtion 아니면 실행문
        } else {
           //어느것도 속하지 않음
        }
         */
        int world_time = 20;
        if (world_time < 13) {
            System.out.println("The West is the EU");
        } else if(world_time < 15) {
            System.out.println("The Middle of Asia");
        } else {
            System.out.println("The korea is Time");
        }
        //삼항 연산자
        //variable = (condtion)? Expressiontrue : Expressionfalse;
        int time2 = 17;
        String world = (time2 > 16) ? "Soon Dinner" : "Before time";
        System.out.println(world);
        //실제 사례
        //사용자가 올바른 코드를 입력하면 문을 열다 메세지가 표시됩니다
        int doorsignal = 1457;

        if (doorsignal == 1457) {
            System.out.println("Correct signal. the door is open");
        } else {
            System.out.println("Worng signal the door remains closed");
        }
        //숫자가 양수인지 음수인지
        int Num = 10;

        if (Num > 0) {
            System.out.println("The valus is a positive number.");
        } else if (Num < 0) {
            System.out.println("The value is a negative number");
        } else {
            System.out.println("The value is 0.");
        }

        //투표할수 있는 나이
        int age = 30;
        int voteage = 18;

        if (age > voteage) {
            System.out.println("Old enough to vote");
        } else {
            System.out.println("Not old enough to vote");
        }

        //숫자가 짝수인지 홀수인지 알아보세요
        int Number = 7;

        if(Number % 2 == 0) {
            System.out.println(Number + "is even");
        } else {
            System.out.println(Number + "is odd");
        }

    }
}
