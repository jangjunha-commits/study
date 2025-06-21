package bronze5;

import java.util.Scanner;

public class 개수세기자바 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[201]; //배열 용량 저장 200개 정도 나열
        int N = sc.nextInt();
        for (int i=0; i<N; i++) { //개수만큼 지정해서 돌리기
            int index = sc.nextInt();
            A[index+100]++; //-100<a[]<100
        }
        int V = sc.nextInt(); //-100보다 크거나 100보다 작거나 같다
        System.out.println(A[V+100]);
    }
}
