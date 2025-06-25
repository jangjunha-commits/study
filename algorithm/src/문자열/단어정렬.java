package 문자열;

import java.util.*;

public class 단어정렬 {
    public static void main(String[] args) {
        //n개로 이룬 단어
        //길이가 짧은 순
        //길이가 같으면 사전순
        //중복된 단어는 하나만 남기고 제거
        //단어의 개수 n개 주어진다
        //단어들 나열해서 적기 HashSet
        //순서대로 나열(크기) ArrayList Collection.sort()
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextLine());
        }

        //리스트로 변환후 정렬
        List<String> words = new ArrayList<>(set);
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (a.length() != b.length()) {
                    return a.length() - b.length(); //길이 짧은것 부터
                } else {
                    return a.compareTo(b);
                }
            }
        });
        for(String word : words) {
            System.out.println(word);
        }
    }
}
