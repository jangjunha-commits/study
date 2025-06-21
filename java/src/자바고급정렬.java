
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Car {
    public String brand;
    public String model;
    public int year;

    public Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }
}

class SortByYear implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Car a = (Car) obj1;
        Car b = (Car) obj2;

        if(a.year < b.year) return -1;
        if(a.year > b.year) return 1;
        return 0;
    }
}

class SortEvenFirst implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Integer a = (Integer) obj1;
        Integer b = (Integer) obj2;

        boolean aIsEven = (a%2) == 0;
        boolean bIsEven = (b%2) == 0;

        if (aIsEven == bIsEven) {
            if(a<b) return -1;
            if(a>b) return 1;
            return 0;
        } else {
            if (aIsEven) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}

public class 자바고급정렬 {
    public static void main(String[] args) {
        /*
        알파벳순과 숫자순으로 목록을 정렬하는 방법 목록에 객체가 있는 경우 어떻게 해야하나요?
        객체를 정렬 -> 결정하는 규칙 지정
        연도별 지정 자동차 목록 -> 규칙적으로 얀도가 빠른 자동차 우선
        Comparator그리고 Comparable 인터페이스 사용하면 객체를 정렬하는데 규칙을 지정할수 있다
        정렬 규칙을 지정 -> 문자열과 숫자의 정렬 방식도 변경
        비교기
        객체 Comparator 인터페이스를 비교기라고 합니다
        그 Comparator 인터페이스 사용하면 다음과 같은 클래스를 만들수 있다
        compare() 두객체를 비교합니다
        목록에서 어떤 객체를 먼저 선택할지 결정하는 기법
        compare()메서드 숫자를 반환해야합니다
        목록에서 첫번째 객체가 먼저 있어야하는 경우 음수입니다
        두번째 순서 목록에서 먼저 있어야한다면 양수입니다
        순서가 중여하지 않다면 0입니다
        클래스 Comparator 인터페이스
        class SortByYear implements Comparator {
          public int compare(Object obj1, Object obj2) {
            Car a = (Car) obj1;
            Car b = (Car) obj2;

            if (a.year < b.year) return -1;
            if (a.year > b.year) return 1;
            return 0;
          }
        }
        Comparator myComparator = new SortByYear();
        collections.sort(myCars, myComparator);
        비교기를 사용하여 연도별 자동차 목록을 정렬하는 완전하 예입니다
         */
        ArrayList<Car> myCars = new ArrayList<Car>();
        myCars.add(new Car("BMW", "XS", 1930));
        myCars.add(new Car("Honda", "Accord", 1985));
        myCars.add(new Car("Ford", "Musting", 1990));

        Comparator myComparator = new SortByYear();
        Collections.sort(myCars, myComparator);

        for (Car c : myCars) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }

        //람다표현식 사용
        //compare()방법
        Collections.sort(myCars, (obj1, obj2) -> {
            Car a = (Car) obj1;
            Car b = (Car) obj2;
            if(a.year < b.year) return -1;
            if(a.year > b.year) return 1;
            return 0;
        });

        //특별 분류 규칙
        //비교기는 문자열과 숫자에 대한 특별한 정렬 규칙을 만드는데에도 사용할수 있다
        //비교기를 사용하여 홀수 앞에 모든 짝수를 나열합니다
        ArrayList<Integer> Numbers = new ArrayList<Integer>();
        Numbers.add(30);
        Numbers.add(15);
        Numbers.add(20);
        Numbers.add(34);
        Numbers.add(8);
        Numbers.add(12);
        /*
        Comparator myComparator = new SortEvenFirst();
        Collections.sort(Numbers, myComparator);

        for (int i : myComparator) {
            System.out.println(i);
        }
        */
    }
}

