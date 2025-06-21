package bronze4;

import java.util.Scanner;

public class 특별한날 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();

        if(m<2) { //2월 이전 Before
            System.out.println("Before");
        }else if(m>2) { //이후 After
            System.out.println("After");
        }else {
            if(d<18) { //18일 이전 Befroe
                System.out.println("Before");
            }else if(d>18) { //이후 After
                System.out.println("After");
            } else { //2월18일 Special
                System.out.println("Special");
            }
        }
    }
}
