import java.util.HashMap;

public class 해시맵 {
    public static void main(String[] args) {
     /*
     Arrays 정렬된 컬렉션으로 항목을 저장하며 인덱스 번호로 접근해야한다는 것이다
     HashMap은 키-값 쌍으로 저장하고 있다
     다양한 유현 저장 String키와 Integer값 또는 같은 유형 : String키와 String값
     HashMap저장할 capitalCity라는 객체 String 키와 String 값
     improt java.util.HashMap;
     HashMap<String, Integer> capitalCities = new HastMap<String, Integer>();
      */
     //항목 추가
     //HashMap 수업에는 유용한 방법이 있다 항목을 추가하려면 put()방법
     HashMap<String, String> USA_area = new HashMap<String, String>();
     //Add key values (USA_area, city);
     USA_area.put("캘리포니아", "LA");
     USA_area.put("뉴욕", "NYC");
     USA_area.put("일라노이", "Cicago");
     USA_area.put("플로리다", "Maiaimi");
     System.out.println(USA_area);

        //항목 멕세스
        System.out.println(USA_area.get("캘리포니아"));
        //항목 제거
        System.out.println(USA_area.remove("뉴욕"));
        //모든 항목 제거
        //System.out.println(USA_area.clear());
        //해시맵 크기
        System.out.println(USA_area.size());
        //해시맵 통한 로프 스루
        //key
        for (String i : USA_area.keySet()) {
            System.out.println(i);
        }
        //value
        for (String i : USA_area.values()) {
            System.out.println(i);
        }
        //key and values
        for (String i : USA_area.keySet()) {
            System.out.println("key" + i + "value" + USA_area.values());
        }
        //기타유형
        //해시맵의 키와 값은 실제로 객체 입니다
        //끈 유향의 객체를 사용합니다
        //java문자열은 원시아닌 객체라는 점
        //Integer 다른 원시 유형의 경어 Boolean 부울의 경우 Character cahr의 경우 Double 더블 등
        //HashMap 저장할 사람이라는 객체 String키와 Integer 값
        HashMap<String, Integer> Person = new HashMap<String, Integer>();
        Person.put("Johns", 24);
        Person.put("Angelina", 35);
        Person.put("Jamis", 27);

        for (String i : Person.keySet()) {
            System.out.println("key:" + i + "value:" + Person.get(i));
        }
    }
}
