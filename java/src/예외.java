public class 예외 {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
    public static void main(String[] args) {
        /*
        코딩오류 잘못 입력으로 인한 오류 또는 기타 예측할수 없는 오류 등 다양한 오류가 발생할수 있다
        오류 발생되면 java 중지 오류메세지 생성
        예외 적용
        try문 사용 실행중 오류를 테스트할 코드블록 정의
        catch문 시도 블록에서 오류가 발생할경우 실행할 코드블록을 정의할수 있다
        try 그리고 catch키워드는 쌍으로 제공됩니다
        try {
           //block of code to try
        } catch(Exception e) {
           //block of code to handle errors
        }
        이것은 오류를 생성할 것입니다
        왜냐면 myNumbers[10]가 존재하지 않기 때문입니다
        public class Main() {
          public static void main(String[] args) {
              int[] myNumbers = {1,2,3};
              System.out.println(myNumbers[10]); //error
          }
        }
        ArrayIndexOutOfBoundsException 존재하지 않는 인덱스 번호에 엑세스 하려고 할때 발생합니다
         */
        //오류가 발생하면 사용할수 잇다 try...catch 오류를 감지라고 이를 처리하기 위해 코드를 실행합니다
        try {
            int[] Numbers = {10,20,30,40};
            System.out.println(Numbers[10]);
        } catch (Exception e) {
            System.out.println("Somethong went wrong.");
        }
        //마침내 finally 문을 사용하면 같은 코드 실행 try...catch 결과 상관없이
        try {
            int[] Number = {10,20,30};
            System.out.println(Number[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("the 'try catch' is finished.");
        }
        //던지기 키워드
        //throw 문을 사용하면 사용자 지정 오류 생성할수 있다
        //예외 유형과 함께 사용됩니다
        //AirthmeticException, FileNotFoundException, ArrayIndexOutOfBoundException, SecurityException 등
        //나이가 18세 미만인 경우 예외를 적용합니다 연령이 18세이상인 경우 접근 권한 부여를 인쇄합니다
        checkAge(18);
        }
    }

