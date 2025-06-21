public class for루프 {
    public static void main(String[] args) {
        /*
        코드블록은 몇번이나 반복할지 정확히 알면 다음을 사용합니다
        for루프 대신 while루프
        for (statement1; statement2; statement3) {
           //code block to be executed
        }
        문1은 블록 실행전 실행 문2는 코드 블록 실행위한 조건 문3은 코드 블록 실행된후
        숫자 0에서 4를 출력할것입니다
         */
        for (int i=0; i<5; i++) {
            System.out.println(i);
        }
        //0에서 10사이의 짝수값많을 출력합니다
        for (int i=0; i<=10; i++) {
            System.out.println(i);
        }

        //중첩루프
        //내부루프는 외부루프의 각 반복마다 한번씩 실행됩니다
        for (int i=0; i<=2; i++) {
            System.out.println("Outer:" + i);
            for (int j=0; j<=3; j++) {
                System.out.println("Inner:" + j);
            }
        }
        //각 루프에 대하여
        //배열의 요소를 순환하는데만 사용한 각자를 위한 루프도 있다
        /*
        for (type variableName : arrayName) {
            // code block to be executed
        }
        각자를 위한 루프를 사용하여 자동차 배열의 모든 요소룰 출력합니다
         */
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i + " ");
        }

        //실제 사례
        //for루프의 실절적인 예를 보여주기 위해 100x10으로 계산되는 프로그램 만들기
        for (int i2=0; i2<100; i2+=10) {
            System.out.println(i2);
        }
        //0과 10사이의 짝수값만 출력하는 프로그램
        for (int i3 = 0; i3<=10; i3+=2) {
            System.out.println(i3);
        }
        //숫자에 대한 곱셈표를 출력하는 프로그램을 만들자
        int number = 4;
        for (int i=0; i<=10; i++) {
            System.out.println(number + "x" + i + "=" + (number*i));
        }
    }
}
