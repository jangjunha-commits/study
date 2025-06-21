import java.util.ArrayList;
import java.util.Collections;

public class 목록정렬 {
    public static void main(String[] args) {
        /*
        자바 정렬 목록
        java.util 패키지
        Collections 클래스 포함 -> srot()목록
        Collections.sort(메서드값);
        알파벳 순또는 숫자 순 정렬
        배열 목록 정렬
         */
        ArrayList<String> Country = new ArrayList<String>();
        Country.add("France");
        Country.add("Germany");
        Country.add("UK");
        Country.add("Norway");

        Collections.sort(Country);
        for (String i : Country) {
            System.out.println(i);
        }
        //정수 배열 목록을 오름차순 정렬
        ArrayList<Integer> int_arrays = new ArrayList<Integer>();
        int_arrays.add(45);
        int_arrays.add(50);
        int_arrays.add(90);
        int_arrays.add(3);
        int_arrays.add(75);
        System.out.println(int_arrays);
        Collections.sort(int_arrays);
        for (int i : int_arrays) {
            System.out.println(i);
        }
        //순서를 뒤집기
        //역순으로 몱록을 정렬할수 있다 reverseOrder()
        Collections.sort(Country, Collections.reverseOrder()); //reverse Country

        for (String i : Country) {
            System.out.println(i);
        }
        //정수 배열 목록을 역/하행순서로 숫자를 정렬합니다
        ArrayList<Integer> Numbers = new ArrayList<Integer>();
        Numbers.add(45);
        Numbers.add(50);
        Numbers.add(60);
        Numbers.add(23);
        Numbers.add(40);
        Numbers.add(29);
        Numbers.add(78);
        Collections.sort(Numbers, Collections.reverseOrder());
        for (int i : Numbers) {
            System.out.println(i);
        }

    }
}
