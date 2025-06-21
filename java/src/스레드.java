public class 스레드 extends Thread {
    public static void main(String[] args) {

        /*
        자바 스레드
        여러작업을 동시에 수행하여 프로그램을 더 효율적으로 운영할수 있게 해줍니다
        스레드는 메인 프로그램을 중단하지 않고 백그다운드에서 복잡한 작업을 수행하는데 사용할수 있다
        스레드 만들기
        Thread 클래스 및 그 우순순위 지정 run()방법
        구문확장
        public class Main extends Thread {
           public void run() {
             System.out.println("This code is running in a thread");
           }
        }
        스레드를 만드는 또 다른 방법을 구현하는 것이다 Runnable 인터페이스
        public class Main implements Runnable {
          public void run() {
             System.out.println("This code id running in a thread");
            }
         }
         스레드 실행
         클래스가 확장되면 Thread클래스, 스레드는 클래스의 인스턴스를 생성하여 실행할수 있습니다 start()방법
         예제 확장
         */
        스레드 Thread = new 스레드();
        Thread.start();
        System.out.println("The code is outside of the thread");
    }

    public void run() {
        System.out.println("This code is running in a thread");
    }
    //클래스가 다음을 구혀하는 경우 Runnable 인터페이스, 스레드는 클래스의 인스턴스를 다음과 같이 전달하여 실행할수 있습니다
    //Thread 객체의 생성자를 호촐한 다음 스레드의 start()방법

    }

