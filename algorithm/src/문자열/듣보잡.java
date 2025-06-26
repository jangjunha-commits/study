package 문자열;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

public class 듣보잡 {
    public static void main(String[] args) {
        //듣도못한사람수 n
        //보도못한사람수 m
        //듣도못한사람 명단 없다
        //보도못한사람도 마찬가지
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        HashSet<String> unhead = new HashSet<>();
        ArrayList<String> result = new ArrayList<>();

        //듣도못한 사람 목록
        for(int i=0; i<n; i++) {
            unhead.add(sc.next());
        }

        //보도못한사람중 듣도못한사람 있는지 확인
        for(int i=0; i<m; i++) {
            String name = sc.next();
            if (unhead.contains(name)) {
                result.add(name);
            }
        }
        Collections.sort(result); //사전순 정렬

        //출력
        System.out.println(result.size());
        for(String name : result) {
            System.out.println(name);
        }
    }
}
