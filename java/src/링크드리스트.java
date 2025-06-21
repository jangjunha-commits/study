import java.util.LinkedList;

public class 링크드리스트 {
    public static void main(String[] args) {
        /*
        ArrayList와 동일
         */
        LinkedList<String> apps = new LinkedList<String>();
        apps.add("store");
        apps.add("apples");
        apps.add("googles");
        System.out.println(apps);
        /*
        LinkedList클래스는 유영의 객체를 만이 포함 컬렉션
        List 인터페이스 즉 항목 추가, 항목 변경 항목 제거 동일한 방식으로 목록을 지울수 있다
        ArrayList (데이터 저장) 작동방식 - 내부에 규칙적인 배열 가짐 요소에 추가되면 배열에 배치됩니다 새로운 더큰 배열이 생성되도 이전배열이 제거됩니다
        LinkedList - 컨테이너에 보관됩니다 목록에서 첫번재 컨테이너에 대한 힝크가 있고 각 컨테이너는 목록의 다음 컨테이너에 대한 링크가 있다
        요소 목록 추가 새컨데이터 넣고 해당 목록에 다른 컨테이너 연결 (데이터 조작)
        LinkedList 메서드
        addFirst()
        addLast()
        removeFirst()
        removeLast()
        getFirst()
        getLast()

         */
    }
}
