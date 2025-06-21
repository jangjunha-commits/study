import java.util.ArrayList;
import java.util.Iterator;

public class 반복기 {
    public static void main(String[] args) {
        /*
        Iterator는 ArrayList및 HashSet과 같은 컬렉션을 반복하는데 사용할수 있는 객체 입니다
        반복 -> 반복 이라고 불린다
        반복기 사용 java.util 패키지
        반복기 구하기
        iterator()방법 Iterator모든 컬력션에 대해
         */
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Hundae");
        cars.add("KN");

        //get the iterator
        Iterator<String> iter = cars.iterator();

        //print the first item
        System.out.println(iter.next());

        //컬렉션을 반복하기
        //car속성에 next()값에 추가된 값 존재 여부 while문 반복 해서 KN쯤이면 종료
        //while()문에 iter.hasNext()
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        //컬랙샨에서 항목제거하기
        //remove()메서드는 루프하는 동안 컬렉션 에서 항목을 제거합니다
        //10보다 작은 작은 숫자를 제거하려면 반복기를 사용합니다
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(6);
        nums.add(5);
        nums.add(9);
        nums.add(25);
        Iterator<Integer> iters = nums.iterator();
        while(iters.hasNext()) {
            Integer i = iters.next();
            if (i < 10) {
                iters.remove();
            }
        }
        System.out.println(nums);
    }
}
