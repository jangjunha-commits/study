class ThreadWithClass extends Thread {
    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println(getName()); //현재 실행중인 이름을 반환함
            try {
                Thread.sleep(10); //0.1 동안 스레드 멈춤
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadWithRunnable implements Runnable {
    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadWithRunnable2 implements Runnable {
    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadWithRunnable3 implements Runnable {
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class 스레드 {
    public static void main(String[] args) {
        /*
        프로세스 단순히 실행중인 프로그램이라고 할수 있다
        사용자가 작성한 프로그램이 운영체제에 의해 메모리 공간을 할당바아 실행중인것을 말합니다
        스레드
        프로세스내에서 실제로 작업을 수행하는 주체를 의미합니다
        모든프로세스에는 한개 이상의 스레드가 존재하여 작업을 수행합니다
        두개이상의 스레드를 가지는 프로세스를 멀티스레드 프로세스 라고 합니다
        1.Runnable인터페이스를 구현하는 방법
        2.Thread 클래스를 상속받는 방법
        두 가지 방법을 사용하여 스레드 생성
         */
        ThreadWithClass thread0 = new ThreadWithClass(); //Thread클래스 상속받는 방법
        Thread thread1 = new Thread(new ThreadWithRunnable()); //Runnable인터페이스 구현 방법

        thread0.start(); //스레드 실행
        thread1.start(); //스레드 실행
        /*
        스레드 우선순위
        우선순위에 관한 자신만의 필드를 가지고 있다
        우선순위에 따라 특정 스레드가 더 많은 시간동안 작업할수 있도록 설정하였습니다
        static int max_priority - 스레드가 가질수 있는 최대 우선순위 명시함
        static int min_priority - 스레드가 가질수 있는 최소 우선순위 명시함
        static int norm_priority - 스레드가 생성될때 가지는 기본우선순위 명시함
        하지만 스레드의 우선순위는 비례적인 절대값이 아닌 상대적인 값 뿐입니다
        스레드의 우선순위는 해당 스레드를 생성한 스레드의 우선순위를 상속받게 됩니다
        main()메소드를 실행하는 스레드의 우선순위는 언제나 5미으로 main()메소드내에서 생성된 스레드 Thread-0의 우선순위는 5로 설정
         */
        Thread thread2 = new Thread(new ThreadWithRunnable2());
        Thread thread3 = new Thread(new ThreadWithRunnable2());

        thread3.setPriority(10); //Thread-1의 우선순위를 10으로 변경함
        thread2.start();
        thread3.start();

        System.out.println(thread2.getPriority());
        System.out.println(thread3.getPriority());

        /*
        멀티 스레드
        하나의 프로세스는 하나의 스레드를 가지고 작업을 수행하게 됩니다
        멀티스레드는 하나의 프로세스 내에서 둘이상의 스레드가 동시에 작업을 수행하는 것을 의미합니다
        멀티프로세스는 각 스레드가 자신이 속한 프로세스의 메모리를 공유하므로 시스템의 낭비가 적습니다
        하나의 스레드가 작업할때 다른 스레드가 별도의 작업을 할수 있어 사용자의 응답성도 좋아집니다
        문맥 교환
        컴퓨터에 동시에 처리할수 있는 최대 작업수는 cpu의 코어 수와 같습니다
        각 코어가 정해진 시간 동안 여러작업을 번갈하가며 수행하게 됩니다
        각 스레드가 서로 교체될때 스레드간의 문맥 교환이발생합니다
        문맥 교환이 걸리는 시간이 커질수록 멀티 스레딩의 효율은 저하됩니다
        많은 양의 단순한 계산을 싱글 스레드로 동작하는 것이 효율적이다
        스레드 그룹
        서로 관련 있는 스레드를 하나의 그룹으로 묶어 다루기 위한 장치입니다
        ThreadGroup이라는 클래스를 제공합니다
        이러한 스레드는 자신이 포함된 스레드 그룹이나 하위 그룹엔는 접근할수 있지만 다른 그룹에는 접근할수 없다
        이렇게 스레드 그룹은 스레드가 접근할수 있는 범위를 제한하는 보안상으로 중요한 역할을 하고 있다
         */
        Thread thread4 = new Thread(new ThreadWithRunnable2());
        thread4.start(); //Thread-0실행
        System.out.println(thread4.getThreadGroup());

        ThreadGroup group = new ThreadGroup("myThread"); //mythread 스레드 그룹을 생성함
        group.setMaxPriority(7); //해당 스레드 그룹의 최대우선순위를 7로 설정함

        //스레드를 생성할때 포함될 스레드그룹을 전달할수 있음
        Thread thread5 = new Thread(group, new ThreadWithRunnable2());
        thread5.start(); //Thread-1 실행
        System.out.println(thread5.getThreadGroup());
        /*
        데몬 스레드
        다른 일반스레드의 작업을 돕는 보조적인 역할을 하는 스레드를 가집니다
        일반스레드 모두 종류 할일 없으므로 데몬 스레드 역시 자동으로 종료됩니다
        setDemon()메소드 호출하여 데몬 스레드를 설정하면 된다
        데몬스레드는 일정시간마다 자동으로 수행되는 저장 및 화면 갱신등에 이용되고 있습니다
        가비지 컬렉터
        데몬스레드 이용 예
        프로그래머가 동적으로 할당한 메모리 중 더이상 사용하지 않는 영역으로 자동으로 찾아내어 해제해 주는 데몬 스레드
        메모르게 직접 접근하지 못하게 하는 대신에 가비지 컬렉터가 자동으로 메모리를 관리해줍니다
        가비지 컬렉터 이용하면 프로그래밍하기 훨씬 쉬워지며 메모리에 관련된 버그가 발생활 확률도 낮아집니다


         */
    }
}
