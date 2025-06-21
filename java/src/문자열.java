public class 문자열 {
    public static void main(String[] args) {
        //String값 할당
        String greet = "String";
        System.out.println(greet);
        //문자열 길이
        String txt1 = "ABCDEFGHIJKLMOPRSTUVWSWZ";
        System.out.println("The string length is " + txt1.length());

        //더많은 문장려 메서드
        System.out.println(txt1.toUpperCase());
        System.out.println(txt1.toLowerCase());

        //문자열에서 문자 찾기
        //indexOf() 문자열에서 지정된 텍스트의 첫번째 발생에 대한 인덱스(위치)를 반환합니다
        System.out.println(txt1.indexOf("EFGH"));

        //문자열 연결
        //+ 문자열 결합
        String fname = "Las";
        String lname = "Vegas";
        System.out.println(fname + lname);

        //두줄연결
        System.out.println(fname.concat(lname));

        //연결 n
        //+ 문자열 간에 연산자를 사용하여 결합할수 있다 연결이라고합니다
        String firstN = "Jhonada";
        String lastN = "Names";
        System.out.println(firstN + " " + lastN);

        //두줄연결
        System.out.println(firstN.concat(lastN));

        //숫자와 문자열 추가하기
        //두 숫자를 더하면 숫자가 됩니다
        int x = 300;
        int y = 500;
        int z = x + y;
        System.out.println(z);

        String x_str = "30";
        int y_int = 50;
        String z_str = x_str + y_int;
        System.out.println(z_str);

        //문자열 - 특수문자
        //문자열은 따옴표 안에 작성 java는 이문자열을 오해하며 오류를 발생할수 있다
        //String txt10 = "We are the called "Ankess" from the south"; 백슬래시 이스케이프 문자 반환
        //백슬래시 \" 두개의 따옴표 삽입합니다
        String txt12 = "We are 'storage' is \"byte \" is meories";
        System.out.println(txt12);
        //문자열 하나의 따옴표 삽입
        String txt13 = "It \'s insert the string";
        System.out.println(txt13);
        //문자열에 단일 백슬래시 \\ 삽입
        String txt14 = "the chracter \\ is call";
        System.out.println(txt14);
        // \n \r \t \b \f

        //수학
        //Math.max(x,y) 방법을 사용하여 x와 y의 최대값을 찾을수 있다
        System.out.println(Math.max(550,130));
        //최솟값 min()
        System.out.println(Math.min(50,10));
        //제곱근
        System.out.println(Math.sqrt(25));
        //절대값
        System.out.println(Math.abs(-5.2));
        //난수
        //0에서 1사이 반환
        System.out.println(Math.random());
        //0에서 100사이 난수 반환
        int randNum = (int)(Math.random() * 101);
        System.out.println(randNum);

    }
}
