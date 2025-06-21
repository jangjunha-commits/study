package bronze1;

import java.util.ArrayList;
import java.util.Scanner;

public class 싸이클 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int temp = n;

        ArrayList<Integer> myarr = new ArrayList<>();
        myarr.add(n);
        int mysize = 0;

        while(true) {
            System.out.println(temp);
            temp = (temp*n)%p;
            //싸이클이 생길때 까지 반복하고 싶어
            if(myarr.contains(temp)) {
                for(int i=0; i<myarr.size(); i++) {
                    if(myarr.get(i)==temp) {
                        mysize = myarr.size() - i;
                        break;
                    }
                }
                break;
            }else {
                myarr.add(temp);
            }
        }
        System.out.println("test");
    }
}
