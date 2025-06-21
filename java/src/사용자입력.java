import java.util.Scanner;

public class 사용자입력 {
    public static void main(String[] args) {
        /*
        Scanner클래스는 사용자 입력을 받는데 사용되면 java.util 패키지
        Scanner클래스 클래스의 객체를 생성하고 다음에서 찾을수 있는 모든 방법을 사용합니다
        nextLine() 문자열을 읽는데 사용되는 메서드
         */
        Scanner object = new Scanner(System.in);
        String name;

        System.out.println("Enter username");
        name = object.nextLine();
        System.out.println("name is : " + name);
        //다양한 유형의 데이터 읽기 위해 다양한 방법을 사용합니다
        Scanner object2 = new Scanner(System.in);
        System.out.println("Enter your name : , age and salary : ");
        String name2 = object2.nextLine();

        int age = object2.nextInt();
        double salary = object2.nextDouble();

        System.out.println("Name : " + name2);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
        //잘못된 입력 (숫자 입력 텍스트)입력하면 예외/오류메세지
        //InputMismatchException 표시됩니다
        /*
        input types
        nextBoolean()
        nextByte()
        nextDouble()
        nextFloat()
        nextInt()
        nextLine()
        nextLong()
        nextShort()
         */
    }
}
