class Vehicle{
    protected String brand = "Ford"; //vehicle attribute
    public void hock() { //vehicle method
        System.out.println("Tunt, tuut!");
    }
}

//class Car extends Vehicle {
//    private String modelName = "Mustang";
//}

public class 상속 extends Vehicle{
    private String modelName = "Mustang";
    public static void main(String[] args) {
        /*
        하위클래스(자식) - 다른 클래스에서 상속되는 클래스
        슈퍼클래스(부모) - 상속되는 클래스
        클래스에서 상속하려면 extends 키워드
        예시에서 Car클래스(하위 클래스)는 다음속성에서 메서드를 상속합니다
        Vehicle클래스(슈퍼 클래스)
        protected
        차량의 브랜드 속성을 설정합니다
        protected 접근 수정자 다음과같이 설정된 이유 private 카 클래스는 엑세스 할수 없다
        최종키워드
        다른클래스가 클래스에서 상속되는 것을 원하지 않는다면 final키워드
        final class Vehicle {}
        class Car extends Vehicle {}
         */
        상속 mycar = new 상속();
        mycar.hock();
        System.out.println(mycar.brand + " " + mycar.modelName);
    }
}
