package bronze3;

import java.util.Scanner;

public class AB6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++) {
            String[] text = sc.nextLine().split(",");
            int a = Integer.parseInt(text[0]);
            int b = Integer.parseInt(text[1]);
            System.out.println(a+b);
        }
    }
}
