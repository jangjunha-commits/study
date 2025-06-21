package bronze1;

import java.util.ArrayList;
import java.util.Scanner;

public class 약수들의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            if(n==-1)break;
            ArrayList<Integer>temp = new ArrayList<>();
            int sum = 0;
            for(int i=1; i<n; i++) {
                if(n%i==0) { //i가n의 약수이면
                    temp.add(i);
                    sum += i;
                }
            }
            if(sum == n) {
                //완전수 이면
                System.out.print(n+" = ");
                for(int i=0; i<temp.size()-1; i++) {
                    System.out.print(temp.get(i) + " + ");
                }
                System.out.println(temp.get(temp.size()-1));
            }else {
                System.out.println(n+ " is Not perfect ");
            }
        }
    }
}
