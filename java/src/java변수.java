public class java변수 {
    public static void main(String[] args) {
        /*
        String int float char boolean
         */
        //변수 선언 생성
        //type variableName = value;
        //성 변수 만들기
        String fname = "Joss";
        System.out.println(fname);

        //숫자 변수 만들기
        int Num = 20;
        System.out.println(Num);

        //값을 할당받지 않고 변수를 선언하고 나중에 값을 할당할수도 있습니다
        int Nums;
        Nums = 30;
        System.out.println(Nums);

        //기존변수에 새값을 할당하면 이전값을 덮어쓰게 됩니다
        int Nums2 = 25;
        Nums2 = 35;
        System.out.println(Nums2);

        //최종변수
        //덮어쓰는것 원하지 않으면 final키워드(최종 또는 constrant으로 선언하여 이는 변경 불가능하고 읽기 전용을 의미합니다)
        final int const_number = 32;
        //const_number = 34; will generate an error
        System.out.println(const_number);

        //기타 유형
        int Number = 85;
        float sosu = 80.22f; //소수뒤에 f붙이기
        char Letter = 'B';
        boolean bool = true;
        String java = "Java";
        System.out.println(Number);
        System.out.println(sosu);
        System.out.println(Letter);
        System.out.println(bool);
        System.out.println(java);

        //변수 표시
        //println()메소드 변수 표시
        //결합 + 캐릭터
        String lname = "Hons";
        System.out.println("Hello" + lname);
        String fnames = "Willom";
        System.out.println(fnames + lname);

        //숫자인 경우 + 수학적 연산
        System.out.println(Nums + Number);

        //다중변수
        System.out.println(Nums2 + Number + Nums);

        //간단히 쓰기
        int x = 10, y = 200, z = 350;
        System.out.println(x + y + z);

        //여러번수에 단일값
        int x1,y1,z1;
        x1=y1=z1 = 500;
        System.out.println(x1 + y1 + z1);

        //식별자
        //고유이름으로 식별되어야합니다
        //고류이름을 식별자 -> 이름(나이 합계 총 볼륨)
        int setNumber = 70;
        //but not so easy to understand whhat s actually is
        int s = 70;

        System.out.println(setNumber);
        System.out.println(s);

        /*
        변수이름 지정
        이름 문자 숫자 밑줄 달러 기호 포함
        이름은 문자 시작
        이름은 소문자 시작 공백 포함할수 없다
        $로 시작할수 있습니다
        대소문자 구분합니다 my != mY
        예약어 사용할수 없다
         */
        //실제 사례
        //변수이름을 데이터 유형 단순화
        String Name = "James John";
        int ID = 25;
        int age = 25;
        float Fee = 78.23f;
        char Grade = 'A';

        System.out.println("StudentName" + " : "+Name);
        System.out.println("StudentID" +" : " +ID);
        System.out.println("StudentAge" +" : " +age);
        System.out.println("StudentFee" +" : " +Fee);
        System.out.println("StudentGrade" +" : "+ Grade);

        //작사각형 면적 계산
        //길이너비 곱하기
        int length = 40;
        int height = 60;
        int area;

        area = length * height;
        System.out.println("Area of the rectangle is " + " : " + area);
    }
}
