public class 매서드매개변수 {
    static void myMethod(String firstName) {
        System.out.println(firstName + "References");
    }
    static void MultiMethod(String fisrtname, int age) {
        System.out.println(fisrtname + " " + "and" + " "+ age);
    }

    static void checkAge(int age) {
        if (age < 19) {
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access grented - You are old enough!");
        }
    }

    static int number(int x) {
        return 10 + x;
    }
    //return 값 반환에서 연산할때 int형 void는 초기화 변수로 사용한다

    static int merge_add(int x, int y) {
        return x +y;
    }

    static int add(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        /*
        매개변수및 인수
        매개변수로서 메서드에 전달될수 있습니다
        매개변수는 메서드 내부에서 변수로 작용합니다
        매개변수는 이름뒤 괄호안에 지정됩니다
         */
       myMethod("Jully");
       myMethod("James");
       //다중 매개변수
       MultiMethod("Allenans" ,30);
       MultiMethod("Antalia", 34);
       MultiMethod("Weriks", 40);

       //if-else사용하는 방법
       checkAge(20);

       //반환값
       //void모든 예제에서 키워드는 메서드가 값을 반환해서는 안된다
       //메서드 값을 반환하려면 원시 데이터 유형을 사용할수 있다
       //int char등 대신 void를 사용합니다 return메서드 내부 키워드
        System.out.println(number(10));
        //두매개변수의 합을 반환홥니다
        System.out.println(merge_add(300, 590));
        //예 결과 변수 저장
        int z = add(1000,1000);
        System.out.println(z);
    }
}
