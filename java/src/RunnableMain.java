public class RunnableMain implements Runnable {
    public static void main(String[] args) {
        RunnableMain object = new RunnableMain();
        Thread thread = new Thread(object);
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
    //Runnable 인터페이스, 스레드는 클래스의 인스턴스를 다음과 같이 전달하여 실행할수 있다
    //Thread객체의 생성자롤 호출한다음 스레드를 start() 방법
    //확장 스레드와 구현스레드의 차이점
    //스레드를 클래스 확장할때 다른 클래스를 확장할수 없지만 Runnable 인터페이스를 구현하면 다른 클래스에서도 확잘할수 있다
    //MyClass extends ObjectClass implrmrnts Runnable
}
