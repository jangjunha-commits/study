public class 타입casting {
    public static void main(String[] args) {
        /*
        두가지 유형 캐스팅이 있습니다
        확대 주소(자동) - 작은 유형을 더 큰 유형을 반환
        byte -> short -> char -> int -> long -> float -> double
        협착 주소(수동) - 더 큰유형은 더 작은 유형으로 반환
        double -> float -> long -> int -> char -> short -> byte
         */
        //확대 주조
        //더 작은 크기의 타입을 더 큰크기의 타입으로 옮길때 자동으로 이루어집니다
        int Ints = 123;
        double Doubles = Ints; //Automatic casting: int to double

        System.out.println(Ints);
        System.out.println(Doubles);

        //좁은 캐스팅
        //좁은 주조는 유형을 괄호안에 넣어 수동으로 수행해야합니다 ()가치 잎에서
        double Doubles2 = 5.89d;
        int Ints2 = (int)Doubles2; //Manual casting : double to int

        System.out.println(Doubles2);
        System.out.println(Ints2);

        //실제 사례
        //최대 점수와 관련된 사용자 점수의 비율을 계산하는 프로그램 실제 유형 캐스팅예
        //부동소수점이 값인지 확인하기 위해 타입 캐스팅을 사용합니다
        int max = 550;
        int user = 450;
        float percentage = (float) user / max * 100.0f;
        System.out.println("User's Percentage is " + percentage + "점입니다");
    }
}
