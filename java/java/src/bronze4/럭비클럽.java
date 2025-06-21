package bronze4;

import java.util.Scanner;

public class 럭비클럽 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) { //이름 나이 몸무게
            String name = sc.next();
            int age = sc.nextInt();
            int weight = sc.nextInt();

            if (name.equals("#") && age == 0 && weight == 0) {
                break; //# 0 0 종료
            }

            if (age > 17 || weight >= 80) { //17세이상 80kg이상 성인ㄴ
                System.out.println(name + " Senior");
            } else {
                System.out.println(name + " Junior");
            }
        }

    }
}

