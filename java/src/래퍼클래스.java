public class 래퍼클래스 {
    public static void main(String[] args) {
        /*
        래퍼클래스는 원시데이터 유형을 사용하는 방법을 제공합니다 (int, boolean) 객체로서
        byte short int long float double boolean char
        때때로 다음과 같은 컬렉션 객체를 다둘때 래퍼클래스를 사용해야합니다 ArrayList
        원시유형을 사용할수 없는 경우 (목록에는 객체만 저장할수 있다)
        ArrayList<int> numbers = new ArrayList<int>(); //Invalid
        ArrayList<Integer> numbers = new ArrayList<Integer>(); //Valid
        래퍼 객체 만들기
        래퍼객체를 만들려면 원시 유형대신 래퍼클래스를 사용합니다
        값을 얻으려면 객체를 인쇄하기만 하면됩니다
         */
        Integer myInt = 50;
        Double myDouble = 4.58;
        Character myChar = 'B';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);
        //해당 래퍼 객체와 관련된 값을 얻기 위해 다음 방법 사용
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());
        //toString() 래퍼객체를 문자열로 변환하는데 사용되는 메서드 입니다
        //Integer a까지 String, 를 사용합니다 length()방법
        //String문자열의 길이를 출력하는 클래스
        Integer myInt2 = 200;
        String myString = myInt2.toString();
        System.out.println(myString.length());


    }
}
