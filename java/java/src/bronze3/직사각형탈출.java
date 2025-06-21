package bronze3;

import java.util.Scanner;

public class 직사각형탈출 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //직사각형의 x y w h 좌표
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        //직사각형 경계선의 거리의 최솟값
        int min = x; //x값 기준
        if(min > y) { //x값이 더크면
            min = y; //y로 반환
        }else if(min > h-y) { //높이에서 y값뺐을때 x좌표가 높으면
            min = h-y;
        }else if(min > w-x) { //가로 길이가 x보다 작으면
            min = w-x;
        }
        System.out.println(min);
    }
}
