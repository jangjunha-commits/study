import java.util.*;
public class 해시셋 {
    public static void main(String[] args) {
        /*
        HashSet 끈을 저장할 자동차 객체
        HashSet<String> cars = new HashSet<String>();
        항목 추가
        add()방법
         */
        HashSet<String> brand = new HashSet<String>();
        brand.add("aidas");
        brand.add("nikey");
        brand.add("discovery");
        brand.add("umbro");
        System.out.println(brand);
        //항목이 존재하는지 확인
        System.out.println(brand.contains("spyder"));
        //항목제거 remove()
        //모두제거 clear()
        //해시셋 크기
        System.out.println(brand.size());
        //루프 항목 반복 각 루프미다
        for (String i : brand) {
            System.out.println(i);
        }
        //기타 유형
        //헤시셋은 실제 객체
        //int와 같은 다른 유형을 상요하려면 동등한 레퍼클래스를 지정해야한다
        //Integer 다른 원시 유형의 경우 Boolean 부울의 경우 Chracter char의 경우
        //Double 더블등을 위해
        HashSet<Integer> num = new HashSet<Integer>();
        num.add(34);
        num.add(3450);
        num.add(567);
        num.add(983);

        for(int i=0; i<=1000; i++) {
            if(num.contains(i)) {
                System.out.println(i + "was found in the set.");
            } else {
                System.out.println(i + "was not found in the set");
            }
        }
    }
}
