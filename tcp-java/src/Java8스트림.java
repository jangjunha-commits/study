import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.Random;
import java.util.Optional;
import java.util.OptionalInt;


public class Java8스트림 {
    public static void main(String[] args) {
        /*
        스트림 api
        많은 양의 데이터를 저장하기 위해서 배열이나 컬렉션을 사용한다
        저장된데이터 접근하기 위해서 반복문이나 반복자를사용하여 매번 새로운 코드를 작성한다
        데이터베이스와 쿼리와 같이 정형화된 처리 패턴을 가지지 못했기 때문에 데이터마다 다른 방법으로 접근한다
        문제점 극복하기 위해 java8 stream api도입
        배열 컬렉션 파일에 저장된 데이터 모두 같은 방법으로 다루기
        스트림 외부반복 -> 작업 컬렉션 달리 내부 반복 작업 수행
        스트림 재사용 가능한 컬렉션 달리 한번만 사용
        스트림은 원본데이터 변경하지 않는다
        필터-맵기반의 api사용하여 지연연산을 통해 성능을 최적화 합니다
        스트림은 parallStream()메소드 통한 손쉬운 병렬 처리 지원
        스트림 생성 -> 중개 연산 -> 최종연산
        생성
        컬랙션 배열 가변매개변수 지정된 범위의 연속정수
        특정 타입의 난수들 람다 표현식 파일 빈스트럼
        컬렉션
        Collection 인터페이스 구현한 모든 List와 Set컬렉션 클래스에도 stream()메소드로 스트림을 생성할수 있다
        또한 parallelStream9)메소드를 사용한 병렬처리 가징한 스트림
         */
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        //컬렉션에서 스트림 생성
        //Stream<Integer> stream = list.stream();
        //forEach() 메소드를 이용한 요소의 순차접근
        //stream.forEach(System.out::println);
        
        /*
        stream클래스의 ForEach()메소드는 해당 스트림의 요소를 하나씩 소모해가면 순차적으로 요소에 접근하는 메소드입니다
        같은 스트림으로는 forEach()메소드르 한번밖에 호출할수 밖에 없습니다
        원본데이터를 소모하는 것은 아니므로 같은 데이터에서 또 다른 스트림을 생성하여 forEach()메소드를 호출하는 것은 가능합니다
        
        배열 
        Arrays클래스에는 다양한 형태의 stream()메소드가 클래스 메소드로 정의되어 있습니다 
        기본타입인 int long double형을 저장할수 있는 배열에 관한 스트림이 별도로 정의되어 있다
        java.util.stream패키지의 IntStream LongStream Doublestream 인터페이스를 각각 제공됩니다
         */

        String[] arr = new String[]{"넷", "둘", "셋", "하나"};

        //배열에서 스트림 생성
        Stream<String> stream1 = Arrays.stream(arr, 1, 3);
        stream1.forEach(e -> System.out.println(e + " "));

        /*
        가변 매개변수
        Stream클래스의 of()메소드를 사용하면 가변매개변수를 전달받아 스트림을 생성할수 있다
         */
        //가변 매개변수에서 스트림 생성
        //Stream<Double> stream3 = Stream.of(4.2, 2.5, 3.1, 1.9);
        //Stream.forEach(System.out::println);
        /*
        지정된 범위의 연속된 정수
        스트림으로 생성하기 위해 IntStream과 LongStream인터페이스에는 range()와 rangeClosed()메소드가 정의되어 있다
        range()메소드는 명시된 시작 정수는 포함하지만 명시도니 마지막 정수는 포함하지 않는 스트림을 생성합니다
        reangeClosed()메소드는 명시도니 시작 정수 뿐만아니라 명시된 마지막 정숚자ㅣ도 포하하는 스트림을 생성합니다
         */
        //지정도니 범위의 연속된 정수에서 스트림 생성
        /*
        IntStream stream1 = IntStream.range(1,4);
        stream1.forEach(e -> System.out.println(e + " "));
        System.out.println();

        Instream stream2 = Instream.rangeClosed(1,4);
        stream2.forEach(e-> System.out.println(e + " "));
         */
        //특정타입 난수들
        //특정타입 난수로 이루어진 스트립 생성
        /*
        Instream stream4 = new Random().ints(4);
        stream4.forEach(System.out::println);
        */
        //파일
        //String<String> stream = Files.lines(Path path);
        //빈스트림
        //아무요소도 가지지 않는 빈 스트림은 Stream클래스의 empty()메소드를 사용하여 생성할수 있다
        //빈스트림 생성
        //Stream<Object> stream4 = Stream.empty();
        //System.out.println(stream4.count());
        /*
        스트림의 중개 연산
        스트림 api에 의해 생성된 초기 스트림은 중개연산을 통해 또다른 스트림으로 변환됩니다
        중개연산은 스트림을 전달받아 스트림을 반환하므로 중개연산은 연속으로 연결해서 사용할수 있다
        스트림의 중개연산은 필터-맵 기반의 api를 사용함으로써 지연연산을 통해 성능을 최적화
        스트림 필터링 : filter() distinct()
        변환 : map() flatMap()
        제한 : limit() skip()
        정렬 : sorted()
        연산결과 확인 : peek()
        filter() 메소드는 해당 스트림에서 주어지 조건에 맞는 요소만으로 구성된 새로운 스트림을 반환합니다
        distinct()메소도는 내부적으로 Object클래스의 equals()메소드를 사용하여 요소의 중복을 비교합니다
         */
        IntStream stream5 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        IntStream stream6 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);

        //스트림에서 중복된 요소를 제거
        stream5.distinct().forEach(e -> System.out.print(e + " "));
        System.out.println();

        //스트림에서 홀수만 콜라냄
        stream6.filter(n -> n % 2 != 0).forEach(e -> System.out.println(e + " "));

        //스트럼 변환
        //Stream<String> stream7 = Stream7.of("HTML", "CSS", "JAVA");
        //stream7.map(s -> s.length()).forEach(System.out::println);
        //Stringp[] arr2 = {"I study hard", "You studyJAVA", "I am hungry"};

        //Stream<String> stream = Arrays.stream7(arr2);
        //sttream7.flatMap(s -> System.out.println(s.split("+"))).forEach(System.out::println);
        //스트림 제한
        //limit()메소드 해당 스트림의 첫번째 요소부터 전달된 개수만큼의 요소만트로 이루어진 새로운 스트림 반환
        //skip메소드()는 해당 스트림의 첫번째 요소부터 전달된 개수만큼의 요소만으로 이루어진 새로운 스트림을 반환한다
        /*
        IntStream stream8 = IntStream.range(0,10);
        IntStream stream9 = IntStream.range(0,10);
        IntStream stream10 = IntStream.range(0,10);

        stream8.skip(4).forEach(n-> System.out.println(n + " "));
        stream9.skip(5).forEach(n-> System.out.println(n + " "));
        stream10.skip(3).forEach(n-> System.out.println(n + " "));
        //스트림 정렬
        Stream<String> stream11 = Stream11.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        Stream<String> stream12 = Stream12.of("HTML", "CSS", "JAVA", "JAVASCRIPT");

        stream11.sorted().forEach(s -> System.out.println(s + " "));
        System.out.println();
        stream12.sorted().forEach(Comparator.reverseOrder()).forEach(s -> System.out.println(s + " "));

        //스트림 연산 결과 확인
        IntStream stream13 = IntStream.of(7,5,5,2,12,3,5,4,6);

        stream13.peek(s -> System.out.println("원본스트림 : " + s)).skip(2)
                .peek(s -> System.out.println("원본스트림 : " + s)).limit(5)
                .peek(s -> System.out.println("원본스트림 : " + s)).sorted()
                .peek(s -> System.out.println("원본스트림 : " + s)).forEach(n-> System.out.println(n));
     }
     */
        /*
        스트림의 최종연산
        중개연산을 통해 스트림은 마지막으로 최종 연산을 통해 각 요소를 소모하여 결과를 표시합니다
        출력 forEach()
        소모 reduce()
        검색 findFirst() findAny()
        검사 anyMatch() allMatch() noneMatch()
        통계 count() min() max()
        연산 sum() average()
        수집 collect()
         */
        /*
        //요소의 출력
        Stream<String> stream15 = Stream15.of("넷", "둘", "셋", "하나");
        stream15.forEach(System.out::println);

        //요소의 소모
        //스트림의 각요소를 소모하여 연산을 수항하게 됩니다
        //reduce()메소드 첫번째 두번째 요소를 가지고 연산을 수행한뒤 그 결과와 세번째 요소를 가지고 또다시 연사을 수행합니다
        //해당스트림의 모든 요소를 소모하여 연산을 수행하고 그 결과를 반호나하게 됩니다
        //이수로 초깃값을 전달하면 초깃값과 해당 스트림의 첫번째 요소와 연산을 시작하여 그 결과와
        //두번째 요소를 가지고 계속해서 연산을 수행하게 됩니다
        //각문자열 요소를 ++ 기로호 연결하여 출력하는 예제입니다
        Stream<String> stream16 = Stream.of("넷", "둘", "하나", "셋");
        Stream<String> stream17 = Stream.of("넷", "둘", "하나", "셋");

        Optional<String> result1 = stream16.reduce((s1, s2) -> s1 + "++" + s2);
        result1.ifPresent(System.out::println);

        String result2 = stream17.reduce("시작", (s1, s2) -> s1 + "++" +s2);
        System.out.println(result2);

        요소의 검색
        해당스트림에서 첫번째 요소를 참조하는 Optional객체를 반환합니다
        두메소드는 모두 비어 있는 스트림에서 비어 있는 Optional객체를 반환합니다
         */
        /*
        IntStream stream18 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        IntStream stream19 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);

        OptionalInt result3 = stream17.sorted().findfirst();
        System.out.println(result3.getAsInt());

        OptionalInt result4 = stream17.sorted().findAny();
        System.out.println(result4.getAsInt());

        /*
        anyMatch() : 해당스트림의 일부요소가 특정조건을 만족한경우 ture반환
        allMatch() : 해당 스트림의 모든 요소가 만족 경우 true
        noneMatch() : 모든 요소가 특정 조건 만족하지 않는 경우 true
         */
        //스트림의 모든 요소를 검사하여 80보다 큰값을 가지는 요소는 하나라도 존재하는지 검사하는 예제
        /*
        IntStream stream20 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        IntStream stream21 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);

        System.out.println(Stream20.anyMatch(n -> n > 80));
        System.out.println(Stream21.allMatch(n -> n > 80));

        //count메소드는 해당 스트림의 요소의 총개수를 long타입의값으로 반환합니다
        //max min메소드 사용하면 해당 스트림의 요소중에서 가장 큰값과 가장 작은 값을 가지는 요소를 참조하는 Optional객체를 얻을수 있다
        IntStream stream22 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        IntStream stream23 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);

        System.out.println(stream22.count());
        System.out.println(stream23.max.getAsInt());

        //요소의 연산
        Doublestream stream24 = DoubleStream.of(30.3,90.9,70.7,10.1);
        System.out.println(stream22.sum());
        System.out.println(stream24.average().getAsDouble());

        //요소의 수집
        //collect메소드는 인수로 전달되는 Collectors객체에 구현된 방법대로 스트림의 요소를 수집합니다
        //Colelctors크랠스는 미리 정의된 다양한 방법의 클래스 메소드롤 정의 되어 있습니다
        //스트림을 배욜이나 컬렉션으로 변환 -> toArray() toCollection() toList() toSet() toMap()
        //연산 counting() maxby() minby() sym minglnt() averagingInt()
        //요소의 소모와 같은동작 수행 - reducing() joining()
        //요소의 그룹화와 분할 : groupingBy() partitioningBy()
        //collect메소드() 이용하여 해당 스트림을 리스트로 변환하는 예제
        Stream<String> stream25 = Stream.of("넷", "둘", "셋", "하나");

        List<String> list2 = stream25.collect(Collectors.toList());
        Iterator<String> iters = list2.iterator();
        while(iters.hasNext()) {
            System.out.println(iters.next() + " ");
        }
        /*
        //Collector클래스의 partitioningBy()메소드를 이용하여 해당스트림의 각 요소별 글자 수에 따라홀수와 짝수로 나누어 저장하는 예제
        Stream<String> stream26 = stream26.("HTML", "CSS", "JAVA", "PHP");

        Map<Boolean, List<String>> patition = stream26.collect(Collectors.partitioningBy(s -> (s.length() % 2 == 0)));

        List<String> oddLengthList = partition.get(false);
        System.out.println(oddLengthList);

        List<String> evenLengthList = partition.get(true);
        System.out.println(evenLengthList);
        */
        /*
        Optional클래스
        Optional<T>클래스는 Integer나 Double클래스처럼 T타입의 객체를 포장해주는 래퍼클래스
        객체의 생성
        of()메소드나 ofNullable()메소드를 사용하여 Optional객체를 생성할수 있다
        null아 아닌 명시된 값을 가지는 Optional객체를 반환합니다
        of()메소드 통해 생성된 Optional객체에 null 저장되면 NullPointerException예외가 발생합니다
         */
        Optional<String> opt = Optional.ofNullable("자바 OPtional 객체");
        System.out.println(opt.get());
        //Optional객체에 접근
        Optional<String> opt2 = Optional.ofNullable("자바 Optional 객체");
        if(opt.isPresent()) {
            System.out.println(opt2.get());
        }
        /*
        orElse()메소드 - 저장된 값이 존재하면 그 값을 반환하고 값이 존재하지 않으면 인수로 전달된 값을 반환함
        orElseGet()메소드 - 저장된 값이 존재하면 그 값을 반환하고 값이 존재하지 않으면 인수로 전달된 람다 표현식의 결괏값을 반환함
        orElseThroow()메소드 - 저장된 값이 존재하면 그 값을 반환하고 값이 존재하지 않으면 인수로 전달된 예외를 발생시킴
         */
        /*
        Optional<Steing> opt3 = Optional.empty(); // Optionl를 null로 초기화함

        System.out.println(opt3.orElse("빈 Optional 객체"));
        System.out.println(opt3.orElseGet(String::new));
        //Optional객체에서 get()메소드를 사용하여 저장된 값에 접근할수 있는 것처럼 클래스별로 저장된 값에 접근할수 있는 다음과 메소드 제공
        IntStream stream27 = IntStream.of(4,2,1,3);
        OptionalInt result4 = stream27.findFirst();
        System.out.println(result4.getAsInt());
        */

    }
}
