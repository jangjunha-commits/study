public class 위드루프 {
    public static void main(String[] args) {
        /*
        루프
        지정된 조건에 도달하면 코드블록을 실행할수 있다
        자바 위드 루프
        while 지정된 조건이 다름과 같은 경우 코드블록을 루프합니다 true:
        while(condtion) {
          //code block to be exceuted
        }
        루프의 코드는 변수(i)가 5보다 작은 한 계속 반복적으로 실행됩니다
         */
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        /*
        자바 실행/진행중 루프
        do/while 루프는 다음의 변형입니다
        while루프 이루프는 조건이 참인지 확인하기 전에 코드블록을 한번 실행한 다음 조건이 참인지 확인하는
        한 루프를 반복합니다
        do {
           //code block to be executed
        } while(condtion)
        do/while루프 조건이 거짓일지라도 조건이 테스트되기 전에 코드 블록이 실행되기 때문에 루프는 항상 적어도 한번 실행됩니다
         */
        int i2 = 0;
        do {
            System.out.println(i2);
            i2++;
        } while(i2 < 5);
        //실제 사례
        //카운트 다운 프로그램을 만들기
        int countdown = 5;

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Heppy New Year!!");
    }

    //Yatzy 인쇄주사위 숫자가 6인 경우
    int dice = 1;

    /*while (dice <= 6) {
        if(dice < 6) {
            System.out.println("No Yatzy");
        } else {
            System.out.println("Yatzy");
        }
        dice = dice + 1;
    }
    */

}
