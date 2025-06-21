import java.util.*;

class Animals1 {
    String species;
    String habits;

    Animals1 (String sepcies, String habits) {
        this.species = species;
        this.habits = habits;
    }

    public int hashCode() {
       return (species + habits).hashCode();
    }

    public boolean equals (Object obj) {
        if (obj instanceof Animals1) {
            Animals1 temp = (Animals1) obj;
            return species.equals(temp.species) && habits.equals(temp.habits);
        } else {
            return false;
        }
    }
    /*
    class Car9 implements Comparabel<Car9> {
    private String modelName;
    private int modelYear;
    private String color;

    Car9(String mn, int my, String c) {
        this.modelName = mn;
        this.modelYear = my;
        this.color = c;
    }

    public String getModel5() {
        this.modelYear + "식" + this.modelName + " " + this.color;
    }

    public int compareTo(Car obj) {
        if (this.modelYear == obj.modelYear) {
            return 0;
        } else if (this.modelYear < obj.modelYear) {
            return -1;
        } else {
            return 1;
        }
    }
}
    */
    /*
class DesendingOrder implements Comparator3<Integer> {
    public int compare(Integer o1, Integer o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Integer c1 = (Integer)o1;
            Integer c2 = (Integer)o2;
            return c2.compareTo(c1);
        }
        return -1;
    }
}
*/
}

public class 컬렉션프레임워크 {
    public static void main(String[] args) {
    /*
    다수의 데이터프레임워크 - 다수의 데이터르 쉽고 효과적으로 처치할수 있는 표준화된 방법 제공하는 클래스의 집합을의미한다
    데이터를 저장하는 자료구조와 데이터를 처리하는 알고리즘 구조화항 클래스로 구현해놓은것입니다
    주요인터페이스
    자바컬렉션프레임워크
    Iterable<E> <- collection<E> <- list<E> 순서사 있는 데이터집합 데이터 중복 허용함
     set<E> 순서가 없는 데이터 집합
     Qurue<E> 키와닶을 한쌍으로 이루어진 ㅔ이터 집하으로 순서가 없다
     컬렉션 클래스
     컬렉션프레임워크에 속하는 인터페이스 구현한 클래스를 컬력션클래스라고 합니다
     모든 컬렉션클래스를  List와 set, Map 인터페이스 중 하나의 인터페이스를 구현하고 있다
     클래스이름에도 구현한 인터페이스 이름을 포함되므로 바로 구분할수 있다
     */
        //ArrayList클래스를 이용하여 리스트를 생성하고 조작하는 예제입니다
        //리스트 생성
        ArrayList<String> arrList = new ArrayList<String>();

        //리스트 요소의 저장
        arrList.add("넷");
        arrList.add("둘");
        arrList.add("셋");
        arrList.add("하나");

        //리스트 요소의 출력
        //for (int i=0; i<arrList.size(); i++) {
        //    System.out.println(arrList.get(i));
        //}
     /*
     List컬렉션 클래스
     모든 List컬렉션 클래스
     요소의 저장순서가 유지됩니다
     같은 요소의 중복 저장을 허용합니다
     ArrayList<E>
     클래스는 배열을 이용하기 때문에 인덱스를 이용한 배열요소에 빠르게 접근할수 있습니다
     하지만 배열의 크기를 변경할수 없는 인스턴스이므로 크기를 늘리기 위해서는 새로운 배열을 생성하고 기존의 요소들을 옮겨야하는 복잡한
     과정을 거쳐야 합니다
     ArrayList 메소드를 이용하여 리스트를 생성하고 조작하는 예제입니다
      */
        ArrayList<Integer> arrList1 = new ArrayList<Integer>();

        //add() 메소드를 이용한 요소의 저장
        arrList1.add(40);
        arrList1.add(20);
        arrList1.add(10);
        arrList1.add(30);
     /*
     //for문과 get() 메소드를 이용한 요소의 출력
     for (int i=0; i<arrList1.size(); i++) {
         System.out.println(arrList1.get(i) + " ");
     }
        System.out.println();
    }

    //remove()메소드를 이용한 제거
    arrList1.remove(1);

    //Enhanced for 문과 get()메소드를 이용한 요소의 출력
    for (int e : arrList1) {
        System.out.println(e + " ");
    }

    //Collections.sort()메소드를 이용한 요소의 정렬
    Collections.sort(arrList1);

    //iterator()메소드와 get()메소드를 이용한 요소의 출력
    Iterator<integer> iter = arrList1.iterator();
    while(iter.hasNext()) {
        System.out.println(iter.next() + " ");
    }

    //set()메소드를 이용한 요소의 변경
    arrList1.set(0,20);

    for(int e: arrList1) {
        System.out.println(e + " ");
    }

    //size() 메소드를 이용한 요소의 총 개수
    System.out.println("리스트의 크기 : " + arrList1.size());

    LinkedList<E>클래스
    배열일 이용하여 요소를 지정함으로써 발생하는 단점을 극복하기 위해 고안되었다
    다음요소를 가리키는 참조만을 가지는 연결리스트를 단일 연결리스트라고 합니다
    단일 연결리스트
    저장과 삭제작업이 다음요소를 가리키는 참조만 변경하면 되므로 아주 빠르게 처리될수 있다
    이전요소를 가리키는 참조도 가지는 이중연결리스트를 좀더 많이 사용하게 됩니다
    */
        //여러 LinkedList메소드를 이용하여 리스트를 생성하고 조작하는 예제
    /*LilnkedLIst<String> linklist = new LinkedLIst<String>();

    linklist.add("넷");
    linklist.add("셋");
    linklist.add("둘");
    linklist.add("하나");

        //for문과 get() 메소드를 이용한 요소의 출력
        for (int i=0; i<LinkList.size(); i++) {
            System.out.println(linkList.get(i) + " ");
        }
        System.out.println();
    }

    //remove()메소드를 이용한 제거
    linkList.remove(1);

    //Enhanced for 문과 get()메소드를 이용한 요소의 출력
    for (int e : arrList1) {
        System.out.println(e + " ");
    }

    //set()메소드를 이용한 요소의 변경
    linkList.set(2, "둘");

    for (e : inklist) {
        System.out.println(e + " ");
    }
    //size() 메소드를 이용한 요소의 총 개수
    System.out.println("리스트의 크기 : " + linkList.size());
    */
        /*
        stack<E>클래스
        List컬렉션 클래스의 Vector클래스를 상속받아 전형적인 스텍 메모리구조의 클래스를 제공합니다
        스태겜로리구조는 선형메모리 공간에 데이터를 저장하면서 후입선출의 시멘특을 따르는 자료구조입니다
        Deque<Integer> st = new ArrayDeque<Integer>();
        Stactk 메소드를 이용하여 스택메로리 구조를 구현한 예제입니다
         */
        /*
        Stack<Integer> st = new Stack<Integer>(); //스택의 생성
        //Stack<Integer> st = new ArrayDeque<Integer>();

        //push()메소드 요소의 저장
        st.push(4);
        st.push(2);
        st.push(3);
        st.push(1);

        //peek()메소드를 이용한 요소의 변환
        st.peek(4);
        st.peek(2);
        st.peek(1);
        st.peek(3);

        //peek()메소드를 이용한 요소의 변환
        System.out.println(st.peek());
        System.out.println(st);

        //pop()메소드 이용한 요소의 반환및 제거
        System.out.println(st.pop());
        System.out.println(st);

        //search()메소드를 이용한 요소의 위치검색
        System.out.println(st.search(4));
        System.out.println(st.search(3));
        */
        //LinkedList<Integer> qu = new LinkedList<Integer>(); //큐의 생성
        //Stack<Integer> qu = new ArrayDeque<Integer>();

        //qu.add("넷");
        //qu.add("셋");
        //qu.add("둘");
        //qu.add("하나");

        //peek()메소드를 이용한 요소의 반환
        //System.out.println(qu.peek());
        //System.out.println(qu);

        //poll() 메소드를 이용한 요소의 반환 및 제거
        //System.out.println(qu.poll());
        //System.out.println(qu);

        //remove()메소드를 이용한 제거
        //qu.remove("하나");
        //System.out.prntln(qu);

        /*
        Set컬렉션 클래스
        요소의 저장순서를 유지하지 않습니다
        같은 요소의 중복저장을 허용하지 않습니다
        HashSet<E>클래스
        HashMap인스턴스를 이용하여 요소를 저장합니다
        HashSet클래스는 Set인터페이스를 구현하므로 요소를 순서에 상관없임 저장하고 중복된 값을 저장하지 않습니다
        HastSet메소드를 이용하여 집합을 생성하고 조작하는 예제입니다
         */
        HashSet<String> hs01 = new HashSet<String>();
        HashSet<String> hs02 = new HashSet<String>();

        //add()메소드 저장
        hs01.add("홍길동");
        hs01.add("이순신");
        System.out.println(hs01.add("임꺽정"));
        System.out.println(hs01.add("임꺽정")); //중요요소 저장

        //Enhanced for문과 get() 메소드를 이용한 요소의 출력
        for (String e : hs01) {
            System.out.println(e + " ");
        }
        System.out.println();

        //add() 메소드 요소 저장
        hs02.add("임꺽정");
        hs02.add("홍길동3");
        hs02.add("이순신");

        //iterator() 메소드를 이용한 요소 출력
        Iterator<String> iter02 = hs02.iterator();
        while (iter02.hasNext()) {
            System.out.println(iter02.next() + " ");
        }
        System.out.println();
        //size()메소드 이용한 요소의 총개수
        System.out.println("집합의 크기 : " + hs02.size());
        /*
        해시알고리즘 - 해시함수를사용하여 데이터를 헤시 테이블에 저장하고 다시 그것을 검색하는 알고리즘
        해시알고리즘을 이용한 자료구조는 위의 그림과 같이 배열과 연결리스트로 구현됩니다
        해당인덱스에 저장된 연결리스트에 데이터를 저장하게 됩니다
        TreeSet<E>클래스
        TreeSet클래스 데이터가 정렬된 상태로 저장되는 이진 검색트리의 형태로 요소를 저장합니다
        이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기본동작시간이 매우 빠릅니다
        예제 TreeSet메소드 이ㅛㅇ하여 집합을 생성하고 조작하는 예제입니다

         */
        TreeSet<Integer> ts = new TreeSet<Integer>();

        ts.add(30);
        ts.add(40);
        ts.add(10);
        ts.add(20);

        for (int e : ts) {
            System.out.println(e + " ");
        }
        System.out.println();
    }
    /*
    //ts.remove(40);
    Iterator<Integer> iter = ts.iterator();
    while(iter.hasNext())  {
        System.out.println(iter.next() + "");
    }
    System.out.println();
    System.out.println("이진검색트리의 크기 : " + ts.size());

    //부분집합의 출력
    System.out.println(ts.subSet(10,20));
    System.out.println(ts.subSet(10, true, 20, true));

    Map 컬렉션 클래스
    Map 인터페이스는 Collection 인터페이스와 다른 저장방식을 가져옵니다
    Map 인터페이스를 구현한 Map컬렉션 클래스들은 키와 값을 하나의 쌍으로 저장하는 방식을 사용합니다
    키란 실직적인 값을 찾기 위한 이름의 역할을 합니다

    요소의 저장 순서를 유지하지 않습니다
    키는 중복을 허용하지 않지만 값을 중복은 허용합니다
    HashMap<K,V> 클래스
    가장 많이 사용되는 클래스 중 하나입니다
    HastMap클래스는 Map인터페이스를 구현하므로 중복된 키로는 값을 저장할수 없다
    다른 키로 저장하는 것은 가능합니다
    HashMap 메소드를 이용하여 맵을 생성하고 조작하는 예제
    */
    /*
    HashMap<String, Integer> hm = new HashMap<String, Integer>();

    hm.put("삼십", 30);
    hm.put("십", 10);
    hm.put("사십", 40);
    hm.put("이십", 20);

    System.out.println("맵에 저장된 키들의 집합 : " + hm.keySet());
    for (String key : hm.keySet()) {
        System.out.println(String.format("키: %s, 값 : %s", key, hm.get(key)));
    }
    */
    /*
    키와 값을 값 한쌍으로 대이터를 이진 검색 트리의 형태로 저장합니다
    이진검색트리는 데이터를 추가하거나 제거하는 등의 기본동작시간이 매우 빠릅니다
    TreeMap클래스는 Map인터페이스구햔하므로 중복된 키로는 값을 지정핳수 없습니다
    하지만 같은 값을 다른키로 저장하는 가능합니다
    TreeMap 메소드를 이용하여 맵을 생성하는 조작하는 예제
     */
    /*
    TreeMap<Integer, String> tm2 = new TreeMap<Integer, String>();

    tm2.put(30, "삼십");
    tm2.put(10, "십");
    tm2.put(20, "이십");
    tm2.put(40, "사십");

    tm2.replace(20, "tevently");
    for (Integer key : tm2.keySet()) {
        System.out.println(String.format("키 : %s, 값 : %s", key, tm2.get(key)));
    }
    System.out.println();

    System.out.println("앱의 크기 : " + tm2.size());
     */
    /*
    Iterator<E>인터페이스
    클래스의 인스턴스를 반환하는 iterator()메소드를 정의하여 각 요소를 접근하도록 있습니다
    연결리스트를 반복자를 사용하여 순회하는 예제
     */
    /*
    LinkedList2<Integer> linkList3 = new LinkedList2<Integer>();

    LinkedLIst2.add(4);
    LinkedLIst2.add(3);
    LinkedLIst2.add(2);

    Interger<Integer> iter = LinkedLIst2.iterator();
    while(iter.haxNext()) {
        System.out.println(iter.next() + " ");
    }
    */
    /*
    LinkedList3<Integer> Linked3 = new LikedList3<Integer>();

    LinkedList3.add(4);
    LinkedList3.add(3);
    LinkedList3.add(2);
    LinkedList3.add(1);

    Iterator<Integer> iter = new Iterator<Integer>();
    while(iter.hasNext()) {
        System.out.println(iter.next() + " ");
    }
    */
    //리스트 반복자를 사용하여 리스트의 모든 요소를 각각 순방향과 역방향을 출력하는 예제입니다
    /*
    LinkedList4<Integer> link = new LinkedList<Integer>();

    link.add(3);
    link.add(4);
    link.add(2);
    link.add(1);

    ListInterator<Interger> iters = link.listIterator();
    while(iter.hasNext()) {
        System.out.println(iter.next() + " ");
    }
    System.out.println();

    while(iter.hasPrevious()) {
        System.out.println(iter.previous() + " ");
    }
    */
    /*
    comparable<T>인터페이스
    객체를 정렬하는데 사용되는 메소드인 compareTo()메소드를 정의하고 있다
    같은 타입의 인스턴스를 서로 비교해야만 클래스모두 Comparable인터페이스를 구현하고 있다
    기존 졍렬 순서는 작은 값에서 큰값으로 정렬되는 오름차순입니다
    인스턴스의비교를 위해 사용자 정의 클래스인 Car클래스가 Comparable 인터페이스를 구현하는 예제
     */
    /*
    Car9 car10 = new Car9("아반테", 2017, "노란색");
    Car9 car11 = new Car9("소나타", 2019, "흰색");
    System.out.println(car10.compareTo(car11));
     */
    /*
    내림차순으로 정렬해서 저장하는 TreeSet인스턴스를 생성하기 위해 Comparator인터페이스 구현하는 예제
     */
    /*
    TreeSet<Integer> tss = new TreeSet<Integer>(new DescendingOrder());

    tss.add(30);
    tss.add(20);
    tss.add(40);
    tss.add(10);

    Iterator<Integer> iter = tss.iterator();
    while(iter.hasNext()) {
        System.out.println(iter.next());
    }
    */

}
