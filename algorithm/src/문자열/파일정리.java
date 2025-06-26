package 문자열;

import java.util.*;

public class 파일정리 {
    public static void main(String[] args) {
        //파일을 확장자 별로 정리해서 몇 개씩 있는지 알려줘
        //보기 편하게 확장자들을 사전 순으로 정렬해 줘
        //파일개수 - n
        //파일 주어짐 -> 알파벳소문자(.)파일이름길이 최소3 최대 100
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //파일수
        sc.nextLine(); //개행처리

        Map<String, Integer> map = new TreeMap<>(); //자동정렬

        for(int i=0; i<n; i++) {
            String filename = sc.nextLine();
            String extension = filename.substring(filename.indexOf('.') + 1); //확장자 추출

            map.put(extension, map.getOrDefault(extension, 0) +1);
        }
        for(String ext : map.keySet()) {
            System.out.println(ext + " " + map.get(ext));
        }
    }
}
