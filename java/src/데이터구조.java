import java.lang.reflect.Array;
import java.util.*;

public class 데이터구조 {
    public static void main(String[] args) {
        /*
        데이터 구조는 효율적으로 사용할수 있도록 저장하고 정리하는 방법이다
        배열은 하나의 변수에 여러 요소를 저장할수 있게 해주는 데이터 구조의 에입니다
        ArrayList
        LinkedList
        HashMap
        HashSet
        배열 목록
        ArrayList 필요에 따라 확장할수 있는 크기 조정 가능한 배열 입니다
        요소를 저장하고 인덱스를 엑세스 할수 있습니다
         */
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Ford");
        System.out.println(cars);

        //링크 리스트
        //LinkedList 그것들의 요소들을 연쇄적으로 저장합니다
        //자추항목을 추가하거나 제거할때 좋습니다
        LinkedList<String> link = new LinkedList<String>();
        link.add("a");
        link.add("b");
        link.add("c");
        System.out.println(link);

        //해시맵
        //HashMap 키-값 쌍을 저장합니다 값을 저장하고 키찾을때 매우 유용합니다
        HashMap<String, String> captialCities = new HashMap<String, String>();
        captialCities.put("Eegland", "London");
        captialCities.put("Germany", "Berlin");
        captialCities.put("Norway", "Oslo");
        System.out.println(captialCities);

        //헤시셋
        //HashSet 모든 요소가 고유하여 중복이 허용되지 않는 컬력션입니다
        HashSet<String> load = new HashSet<String>();
        load.add("youndong");
        load.add("west-cloast");
        load.add("gyeounbu");
        load.add("middle");
        System.out.println(load);

        /*
        데이터 구조 개요
        데이터 구조 상점들 질서유지? 중복 허용? 최적의 위치
        비열 목록   정렬요소 네      네         인덱스별 요소 인덱스
        링크드리스트 정렬요소 네     네          중간에 추가/제거하기
        해시맵      키-값 쌍  아니요   예(키 고유)   키빠른 조회
        해시셋      고유 요소    아니요   아니요    중복방지, 빠른검사

        반복자
        데이터 구조 배울때 반족자에 대해서도 자주 듣게 된다
        데이터 구조의 요소들을 순환시키는 방법입니다
        반복 이라는 용어 반복의미 반복아라고 불립니다
        ArrayList 함께 반복기 사용
         */
        ArrayList<String> germany_locals = new ArrayList<String>();
        germany_locals.add("프랑크푸르트");
        germany_locals.add("잘츠부르크");
        germany_locals.add("뮌헨");
        germany_locals.add("뉘른베르크");

        Iterator<String> iter = germany_locals.iterator();
        while(iter.hasNext()) {
            //hasNext()다음요소가 존재하는 지
            System.out.println(iter.next());
            //next()는 다음요소를 반환하도 커서를 다음으로 이동합니다
        }
        /*
        자바 배열 목록
        ArrayList 클래스는 다음에서 찾을수 있는 크기 조정 가능한 배열 입니다
        java.util패키지
        내장 배열과 차이점 ArrayList Java에서는 배열의 크기를 수정할수 없습니다
        만들기 ArrayList 끈을 저장할 자동차라는 객체
        import java.util.ArrayList;
        ArrayList<String> cars = new ArrayList<String>();
        항목 추가
         */
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("Java");
        languages.add("Sql");
        languages.add("Kotlin");
        languages.add("spring");
        languages.add("docker");
        System.out.println(languages);
        //인덱스 번호를 참조하여 지정된 위치에 항목을 추가할수 있다
        ArrayList<String> arrays = new ArrayList<String>();
        arrays.add("as");
        arrays.add("aws");
        arrays.add("bcd");
        arrays.add("nfg");

        arrays.add(0, "asm");
        System.out.println(arrays);

        //항목 엑세스
        System.out.println(arrays.get(2));

        //항목 변경
        arrays.set(1,"awnswer");
        System.out.println(arrays);

        //항목제거
        arrays.remove(3);
        System.out.println(arrays);

        //모든요소 제거
        //arrays.clear();
        //System.out.println(arrays);

        //배열 목록 크기
        System.out.println(arrays.size());

        //배열 목록을 통한 루프
        //ArrayList와 함께 for루프 사용하지 size() 루프를 몇번 실행햐야하는지 지정하는 방법
        for (int i=0; i< arrays.size();i++) {
            System.out.println(arrays.get(i));
        }
        //각 루프에 데해
        for (String i : arrays) {
            System.out.println(i);
        }
        //기타유형
        //ArrayList요소는 실제로 객체 입니다
        //String 유형의 요소를 만들었습니다
        //동등한 래퍼 클래스를 지정해야합니다
        //Integer 다른 원시 유형의 경우 Boolean 부울의 경우 Chracter char의 걍우 Double 더블 등을 위해
        //만들기 ArrayList 숫자를 저장하려면
        ArrayList<Integer> int_array = new ArrayList<Integer>();
        int_array.add(10);
        int_array.add(30);
        int_array.add(50);
        int_array.add(60);
        int_array.add(40);
        for (int i : int_array) {
            System.out.println(i);
        }
        //배열 목록 정렬
        //java.util패키지는 Collection클래스 다음에 포함됩니다
        //sort()목록은 알파벳순 또는 숫자순으로 정렬
        Collections.sort(arrays);
        for (String i : arrays) {
            System.out.println(i);
        }
        //정부 배열 목록 정렬
        Collections.sort(int_array);
        for (int i : int_array) {
            System.out.println(i);
        }
    }
}
