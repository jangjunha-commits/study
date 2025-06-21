public class 생성자 {
    int x;
    public 생성자() {
        x=5;
    }
    //public 클래스이름(동일) {}
    public 생성자(int y) {
        x = y;
    }
    int modelTime;
    String modelName;

    public 생성자(int time, String name) {
        modelTime = time;
        modelName = name;
    }

    public static void main(String[] args) {
        /*
        자바 생성자
        사용되는 특별한 방법입니다
        클래스의 객체가 생성될때까지 생성자가 호출됩니다
        객체 속성의 초기값을 설정하는데 사용할수 있다
        생성자 만들기
         */
        생성자 object = new 생성자();
        System.out.println(object.x);
        //생성자 매개변수
        //속성을 초기화하는 데 사용하는 매개변수를 취할수 있다
        //int y 생성자에 대한 매개변수 생성자 내부에서 우리는 x를 y로 설정합니다
        //생성자 (5)에게 매개변수를 전달합니다
        //매개변수는 x값을 5로 설정합니다
        생성자 object2 = new 생성자(10);
        System.out.println(object2.x);
        //원하는 만큼의 매개변수를 가질수 있다
        생성자 Car = new 생성자(2000, "Audi");
        System.out.println(Car.modelTime + " " + Car.modelName);
    }
}
