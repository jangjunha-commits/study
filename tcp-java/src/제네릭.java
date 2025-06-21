import java.util.*;
class LandAnimal {public void crying() {
    System.out.println("육지동물");
}}

class Cat7 extends LandAnimal {public void crying() {
    System.out.println("냐옹냐옹");
}}

class Dog7 extends LandAnimal {
   public void crying() {
       System.out.println("멍멍");
   }
}

class Sparrow {public void crying() {
    System.out.println("짹짹");
}}

class ArrayList<T> {
    ArrayList<T> al = new ArrayList<T>();
    void add(T animal) {al.add(animal);}
    //T get(int index) {return al.remove(animal);}
    int size() {return al.size();}
}

class LandAnimal2 {public void crying() {
    System.out.println("육지동물");
}}

class Cat8 extends LandAnimal2 {
    public void crying() {
        System.out.println("냐옹냐옹");
    }
}

class Dog8 extends LandAnimal2 {
    public void crying() {
        System.out.println("멍멍");
    }
}

class Sparrow2 {public void crying() {
    System.out.println("짹짹");
}}
/*
class AnimalList2<T extends LandAnimal2> {
    ArrayList<T> al2 = new ArrayList<T>();

    landAnimal2.add(new LandAnimal2());
    landAnimal2.add(new Cat8());
    landAnimal2.add(new Dog8());

    for (int i=0; i<landAnimal.size(); i++) {
        landAnimal.get(i).crying();
    }
}
public static void cryingAnimal
*/
public class 제네릭 {
    public static void main(String[] args) {
        /*
        데이터 타입을 일반화한다 제네릭은 클래스나 메소드에서 사용할 내부데이터 타입을 컴파일시에 미리지정하는 방법입니다
        미리타입검사를 수행하면 다음과 같은 장점을 가집니다
        미리 타입 검사 수행하면
        클래스 메소드나 사용되는 객체 타입 안정성
        제네릭의 선언 및 생성
        클래스와 메소드에만 선언
        class MyArray<T> {
            T element;
            void setElement(T element) { this.element = element; }
            T getElement() { return element; }
        }
        사용된 T를 타입변수라고 하며 임의의 참초형 타입을 의미합니다
        꼭 T뿐만아니라 어떠한 문자를 사용해도 상관없으며 여러개의 타입변수는 쉼표를 구분하여 명시할수 있습니다
        제네릭 클래스 생성할때 타입 변수 차리에 사용할 실제 타입
        제네릭 클래스를 생성할때에는 타입변수자리에 사용할 실제 타입을 명시해야합니다
        MyArray<Integer> myArr = new MyArray<Integer>();
        MyArray클래스에 사용용 타입변수로 Integer 타입을 사용하는 예제
        MyArray<Integer> = new MyArray<>();
         */
        //AnimalList<LandAnimal> landAnimal = new AnimalList<>();
        /*landAnimal.add(new LandAnimal());
        landAnimal.add(new Cat7());
        landAnimal.add(new Dog7());

        for (int i=0; i<landAnimal.size(); i++) {
            landAnimal.get(i).crying();
        }
        다양한 제네릭의 표현
        제네릭은 T와 같은 타입변수를 사용하여 타입을 제한합니다
        extends 키워드를 사용하면 타입변수에 특정타입만을 사용하도록 제한할수 있다
        class AnimalList<T extends LandAnimal> {...}
        클래스의 타입변수에 제한을 걸어 놓으면 클래스내부에 사용된 모든 타입변수에 제한이 걸립니다
        클래스가 아닌 인터페이스를 구현할 경우 implements키워드 아닌 extends 키워드 사용
        interface method{...}
        class AnimalList<T extends method> {...} //implements키워드 사용해서는 안됨
        클래스와 인터페이스를 동시에 상속받고 구현해야 한다면 & 기호 사용
        class AnimalList<T extends Land & method> {...}
        와일드 카드 사용
        이름에 제한 두지 않음을 의미합니다
        제네릭에 물음표(?) 사용하여 이러한 와일드 카드 사용
        <?> 타입변수에 모든 타입을 사용할수 잇음
        <? extends T> T타입과 T타입을 상속받는 자손클래스 타입만 사용할수 있음
        <? super T> T타입과 T타입이 상속받은 조상클래스 타입만을 사용할수 있음
        public static void cryinganimalList(AnimalList<? extends LandAnimal> al1) {
          landAnimal la = al2.get(0);
          la.crying();
         }
         void add(T animal) {al.get(index);}
         boolean remove(T animal) {return al.remove(animal);}
         int size() {return al.size();}
        }

        AnimalList<Cat> catList = new AnimalLIst<Cat>;
        catList.add(new Cat());
        dogList.add(new 
         */

    }
}
