public class 캡슐화 {
    public static void main(String[] args) {
        /*
        캡슐화
        민감한 데이터가 사용자에게 숨겨져 있는지 확인하는 것입니다
        클래스 변수/attributes를 다음과 같이 선언합니다 private
        엑세스 및 업데이트 할수 있는 공개 가져오기 및 설정 방법 제공 private변수
        가져오기 설정
        private변수는 동일한 클래스 내에서만 접근할수 있다
        공개적으로 접근하고 설정하는 방법을 제공하면 접근이 가능합니다
        get매서드 변수값을 반환하며 set메서드가 값을 설정합니다
        둘다의 구문은 다음중 하나로 시작하는 것입니다 get또는 set변수 이름 뒤에 첫글자가 대문자로 표시됩니디
        public class Person {
           private String name;
        }
        //getter
        public String getName() {
          return name;
        }
        //setter
        public String setName(String newName) {
          this.name = newName;
        }

        설명된 예시
        get메서드는 변수값을 반환합니다 name
        set메서드는 매개변수를 사용합니다 그리고 그것을 할당합니다 name변수 this키워드는 현재객체를 지정합니다
        private 이클래스는 외부에서 엑세스 할수 없다
        Person obj = new Person();
        obj.name = "John";
        System.out.println(obj.name); //error
        우리는 getname과 setname을 업데이트 하는 방법
        클래스 속성 및 메서드의 더 나은 제어
        클래스 속성은 읽기 전용(get)으로 만들수 있다 또는 쓰기 전용(set)
        유연성 : 코드의 한부분 변경
        데이터 보안 강화
         */
         캡슐화2 obj = new 캡슐화2();
         obj.setName("Johs");
        System.out.println(obj.getName());
    }
}
