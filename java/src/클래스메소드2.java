class Main4 {
    //method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }
    //create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is : " + maxSpeed);
    }
}

public class 클래스메소드2 {
    public static void main(String[] args) {
        //객체 접근 방법
        //객체만들기 myCar 호출 fullThrottle()그리고 speed()에 대한 방법들 myCar객체를 지정하고
        //프로그램을 실행합니다
        Main4 Car = new Main4();
        Car.fullThrottle();
        Car.speed(250);
        //Main4 class키워드
        //fullThrottle() speed() Main4 학급
        //fullThrottle()방법 및 speed()메서드 호출될때 일부 텍스트를 호출합니다
        //speed()메서드 다음을 허용합니다
        //speed()메서드에 매개변수 호출
        //new키워드 이름으로 객체믈 만들다 Car
        //호출 메서드
        //점(.)는 객체의 속성과 메서드 엑세스 하는데 사용됩니다
        //클래스는 일치하는 파일이름을 가져야합니다

        //다줄클래스 사용
        //동일한 디렉토리에 두개의 파일을 만들었습니다
        //메인.자바
        //두번째.자바
        Main4 Cars = new Main4();
        Cars.fullThrottle();
        Cars.speed(300);

    }
}
