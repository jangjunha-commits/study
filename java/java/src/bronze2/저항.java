package bronze2;

import java.util.Scanner;

public class 저항 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "viole", "gray", "white"};
        int[] v = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        StringBuffer Vstr = new StringBuffer();
        for(int i=0; i<2; i++) {
            String temp = sc.nextLine();
            for(int j=0; j<color.length; j++) {
                if(temp.equals(color[j])) {
                    Vstr.append(String.valueOf(j));
                    break;
                }
            }
        }
        String temp = sc.nextLine();
        for(int j=0; j<color.length; j++) {
            if(temp.equals(color[j])) {
                System.out.println(Long.parseLong(String.valueOf(Vstr))*v[j]);
            }
        }
    }
}
