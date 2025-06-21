package bronze1;

import java.util.Scanner;

public class 소가길을건너간이유 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int count = 0;
        for(int i=0; i<n; i++) { //관찰이력을 탐색을 한다
            int num = sc.nextInt();
            int s = sc.nextInt();
            //처음 관찰된 소가 아닌데, 이전 위치와 이번에 관찰된 위치가 다르면
            //소가 이동한 것이기 때문에 이동 횟수를 1 늘려본다.
            if(a[num] != -1 && a[num]!=s) {
                count++;
            }
            //이쨋든 마지막에는 관찰도니 소의 위치를 입데이트한다
            a[num]=s;
        }
        System.out.println(count);
    }
}
