package bronze4;

import java.util.Scanner;

public class 타임카드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++) {
            int sh = sc.nextInt(); //12
            int sm = sc.nextInt(); //14
            int ss = sc.nextInt(); //52
            int eh = sc.nextInt(); //12
            int em = sc.nextInt(); //15
            int es = sc.nextInt(); //30

            if(ss>es) {
                es+=60;
                em--;
            }
            es -= ss;

            if(sm>em) {
                em+=60;
                eh--;
            }
            em-=sm;
            eh-=sh;
            System.out.println(eh+" "+em+" "+es);
        }
    }
}
