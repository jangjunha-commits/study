public class 제어문 {
    public static void main(String[] args) {
        //조검문
        //조건식의 결과가 참 주어진 명령문 실행 거짓이면 실행하지 않음
        //if(조건식) {조건 참 명령문 }
        //if문 사용하여 해당문자가 영어문자인지 확인합니다
        //if/else문 else문은 if문과 반대로 주어진 조건식과 결과가 거짓이면 주어진 명령문을 실행합니다
        //if(조건식) {조건식 참 명령문} else {조건식 거짓인 명령문}
        char ch = 'h';
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("해당문자는 영어 문자입니다");
        }

        char one_str = 'i';
        if (one_str >= 'a' && one_str <= 'z') {
            System.out.println("해당 영문자는 소문자");
        }
        else {
            System.out.println("해당 영문자는 대문자");
        }
        //else if 조건식 여러개
        char cha_1 = 'K';
        if (cha_1 >= 'a' && cha_1 <= 'z') {
            System.out.println("해당영문자는 소문자");
        }
        else if(cha_1 >= 'A' && cha_1 <='Z') {
            System.out.println("해당영문자는 대문자 ");
        }else {
            System.out.println("해당문자는 영문자 아니다.");
        }
        //switch문
        //int형으로 승격할수 있다
        //byte형 short형 char형 int향 변수나 리터럴을 사용할수 있다
        //데이터를 객체를 포장해주는 래퍼 클래스
        //byte short charater integer 클래스의 객체도 사용할수 있다
        //if else문과 주어진 조건값을 주어지면 결과에 따라 프로그램 명령을 수행하도록 하는 조건문 입니다
        //enum 열커체와 string 클래스의 객체도 사용할수 있다
        //switch(조건값) {
        // case 값1:
        //  조건값 실행하고하는 명령문;
        // break;
        // case 값2:
        // ''
        // break;
        //default:
        //조건값 어떠한 case 절에대 해당하지 않을때 실행하고자하는 명령문
        //break;
        char ch_2 = 'r';

        switch(ch_2) {
            case 'a':
                System.out.println("해당문자는 'A'입니다");
                break;
            case 'e':
                System.out.println("해당문자는 'E'입니다");
                break;
            case 'i':
                System.out.println("해당문자는 'I'입니다");
                break;
            case 'o':
                System.out.println("해당문자는 'O'입니다");
                break;
            case 'u':
                System.out.println("해당문자는 'U'입니다");
                break;
            default:
                System.out.println("해당문자는 모음이 아닙니다");
                break;
        }
        char ch_3 = 'u';

        switch(ch_3) {
            case 'a':
                System.out.println("해당문자는 'A'입니다");
                break;
            case 'e':
                System.out.println("해당문자는 'E'입니다");
                break;
            case 'i':
                System.out.println("해당문자는 'I'입니다");
                break;
            case 'o':
                System.out.println("해당문자는 'O'입니다");
                break;
            case 'u':
                System.out.println("해당문자는 'U'입니다");
                break;
            default:
                System.out.println("해당문자는 모음이 아닙니다");
                break;
        }

        char ch_4 = 'E';

        switch (ch_4) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("해당문자는 소문자 모음입니다");
                break;
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("헤당문자는 대문자 모음입니다");
                break;
            default:
                System.out.println("해당문자는 모음이 아닙니다");
                break;
        }
        //반복문
        //프로그램내에서 똑같은 명령을 일정횟수만큼 반복하여 수행해도록 하는 제어문입니다
        //반복적인 형태가 많으므로 가장 많이 사용되는 제어문입니다
        //while문 do/while문 for문 Enhanced for문
        //while(조건식) {조건실 결과가 참인동안 반복적으로 실행하는 반복문}
        //초기식 while(조건식) {참인 동안 반복적으로 실행하는 반복문 -> 조건식을 결과를 변경하는 반복문};
        //while문을 5번 반복해서 실행하는 예제
        //무한루프에 빠졌다 하며 무한루프에 빠진 프로그램은 영원히 종료되지 않습니다
        //while문을 작성할때 조건식의 결과가 어느 순간 거짓을 갖도록 조건식의 결과를 변경하는 명령문을 반드시 포함시켜야합니다
        //조건식의 결과를 변경하는 명령문인 i++를 제거하면 변수i의 값은 언제나 1이기 때문에 무한루프에 빠집니다
        int i = 0;
        while(i < 5) {
            System.out.println("while문은" + (i+1) + "실행중입니다");
            i++; //이 부분 삭제하면 무한로프 빠지게 됨
        }
        System.out.println("while문이 종료된 후 변수 i의 값은" + i + "입니다.");
        //do/while문
        //먼저 루프를 한번 실행한 후에 조건식을 검사합니다
        //조건식의 결과 상관없이 무조건 한번은 루프에 실행합니다
        //do{ 조건식 결과가 참인 동안 반복적으로 실행 명령문 ;} while(조건식);
        //초기식; do{조건실결과 참인동안 반복 실행하고자하는 명령문; -> 조건식의 결과를 변경하는 명령문} while(조건식);
        //do-while문은 조건식의 결과 상관없이 무조건 한번은 루프를 실행해줍니다
        int is =-1, j=1;
        while (is < 1) {
            System.out.println("while문이" + is + "번째 반복됩니다.");
            is++;
        }
        System.out.println("while문이 종료된 후 변수 is의 값은" + is + "입니다.");

        do {
            System.out.println("do/while문이" + j + "번째 반복 실행중입니다.");
            j++;
        }while (j<1);
        System.out.println("do/while문이 종료된후 변수 j의 값은" + j + "입니다.");
        //for문
        //초기식 조건식 증감식 모두 포함하고 있는 반복문입니다
        //while문보다 좀더 간격하게 반복문 표현
        //for(초기식; 조건식; 증감식) {조건식의 결과가 참인 동안 반복적으로 실행하고자하는 명령문;}
        //for(초기식; 조건식; 증감식) {조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 명령문;}
        int it;
        for(it=0; it<5; it++) {
            System.out.println("for문이" + (it+2) + "번째 반복실행중입니다.");
        }
        System.out.println("for문이 종료된후 변수 i의 값은" + it + "입니다");

        //자바에서 for문 안에서만 사용하는 변수를 초기식에서 직업 선언할수 있다
        //for문에서 직접 선언된 변수는 for문이 종료되면 같이 소멸합니다
        //변수로는 i2라는 이름의 int형 변수를 한 프로그램을 두번선언하고 있다
        //이렇게 두번선언해도 컴파일오류가 발생하지 않는 이유는?
        //for문이 종료되면 for문 초기식에서 사용된 변수를 자동으로 소명되기 때문입니다

        for (int i2=0; i2<7; i2++) {
            System.out.println("for문이" + (i2+1) + "번째 반복실행중입니다.");
        }
        for (int i2=0; i2<7; i2++) {
            System.out.println("for문이" + (i2+1) + "번째 반복실행중입니다.");
        }
        //루프의 제어
        //조검식의 검사를 통해 루프를 진입하면 다음 조건식을 검사하기 전까지 루프안에 있는
        //모든 명령문을 실행합니다
        //continue문과 break문은 이러한 일반적인 후프의 흐름을 사용자가 직접제어할수 있도록 도와줍니다
        //continue문은 루프에서 사용하여 해당루프의 나머지 부분을 건너뛰고 바로 다음 조건식의 판단을 넘어가게 해줍니다
        //1부터 100까지의 정수 중에서 5의 배수와 7의 배수를 모두 출력하는 예제
        for (int i3=1; i3<=100; i3++) {
            if(i3 % 5 == 0 || i3 % 7 == 0) {
                System.out.println(i3);
            }else {
                continue;
            }
        }
        //1부터 100까지의 합을 무한 루프를 통해 구하는 예제
        int num=1, sum=0;

        while(true) { //무한루프
            sum += num;
            if (num == 100) {
                break;
            }
            num++;
        }
        System.out.println(sum);
        //여러반복문이 중첩된 상황에서 한번에 모든 반복문을 빠져나가거나 특정 반복문까지만
        //빠져나가고 싶을대 는 다른 방법 사용
        //사용할수 있는 방법은 반복문에 이름을 설정한 것입니다
        //가장 바깥쪽 반목문이 빠져나가고 싶은 특정 반복문에 이름을 설정한후, break키워드
        //해당이름 명시 -> 해당 break키워드 현재 반복문이 아닌 해당 이름의 반복문이 바로 다음으로 프로그램의 실행을
        //옮겨줍니다
        //이름은 가리키고자 하는 반복문의 키워드 바로 앞에 위치해야합니다
        //이름과 반복문 키워드 사이에 명령문에 존재하면 자바 컴파일러 오류 발생
        //구구단 중에서 2단부터 4단끼지 출력하는 예제
        /*for(int i2=2; i<10; i++) {
            for (int j2=2; j<10; j++) {
                if(i2 == 5) {
                    break allLoop;
                }
                System.out.println(i+"*"+j+"="+(i*j));
            }
        }*/
    }
}
