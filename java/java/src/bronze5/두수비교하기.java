package bronze5;
import java.util.*;

public class 두수비교하기 {
    public static void main(String[] args) {
        //나머지
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.println((A+B)%C);
        System.out.println(((A%C)+(B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);
        //두수 비교하기
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b) { //a가 b보다 크면 >
            System.out.println(">");
        }else if(a<b) { //a가 b보다 작으면 <
            System.out.println("<");
        }else { //같으면 ==
            System.out.println("==");
        }
    }
}
