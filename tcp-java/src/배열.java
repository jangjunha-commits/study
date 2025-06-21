import java.util.Arrays;

public class 배열 {
    public static void main(String[] args) {
        /* 메모리 구조
       모든 자바프로그램은 자바 가상머신(JVM)을 통해 실행됩니다
       자바프로그램 실행되면, JVM은 운영체제로 부터 해당프로그램을 수행할수 있도록 필요한 메모리를 할당받습니다
       메소드 영역
       클래스에 대한 정보와 함께 클래스 변수가 저장되는 영역입니다
       JVM은 자바 프로그램에서 특정 클래스가 사용되면 클래스 파일을 읽어들이며 해당클래스에 대한 정보를 메소드 영역에 저장합니다
       힙 영역
       모든 인스턴스 변수가 저장되는 영역
       JVM은 자바 프로그램에서 new 키워드사용하여 인스턴스 생성하면 해당 인스턴스의 정보를 힙영역에 저장합니다
       메모리 낮은 주소에서 높은 주소의 방향으로 할당됩니다
       스택 영역
       자바프로그램에서 메소드가 호출될때 메소드의 스택프레밍이 저장되는 영역입니다
       JVM은 자바프로그램에서 메소드 호출 -> 메소드 호출과 관계되는 지역변수와 매개변수를 스택영역을 저장합니다
       스택 영역은 메소드 호출과 함께 할당되며 메소드의 호출이 완료되면 소멸합니다
       스텍영역에 저장되는 메소드의 호출정보를 스택프레임이라고 합니다
       1차원 배열
       배열 - 타입의 변수들로 이루어진 유한 집합으로 정의할수 있다
       배열 구성하는 요소 - 배열 요소
       배열에서 위치를 가리키는 숫자 - 인덱스
       같은 종류의 데이터를 많이 다뤄야하는 경우 -> 기본적인 자료 구조
       1차원 배열
       타입[] 배열이름
       타입 배열이름[];
       선언된 배열 new키워드를 사용하여 실제 배열 생성
       배열이름 = new 타입[배열길이];
       배열의 선언과 생성을 동시
       타입 배열이름[] = new 타입[배열길이];
        */
        //int형 데이터를 3개 저장할수 있는 배열을 선언과 동시에 생성하고 있다
        int[] grade1 = new int[3]; //길이가 3인 int형 배열의 선언 및 생성
        int[] grade2 = new int[3];

        grade1[0] = 85; //인덱스를 이용해 배열 초기화
        grade1[1] = 65;
        grade1[2] = 90;

        grade2[0] = 85;//배열길이보다 적은수의배열 초기화
        for (int i = 0; i < grade1.length; i++) {
            System.out.println(grade1[i] + ""); //인덱스로 이용한 배열 접근
        }
        for (int i = 0; i < grade2.length; i++) {
            System.out.println(grade2[i] + ""); //인덱스를 이용한 배열 접근
        }
        /*
        인덱스를 이용하면 각각의 배열요소를 따라 접근할수 있다
        grade2 배열길이보다 적은수의 배열 요소만 초기화 나머지 배열요소들은 배열 타입에 맞게 자동으로 초기화
        char ('\u0000')
        byte short int (0)
        long (0L)
        float (0.0F)
        double (0.0)
        boolean (false)
        배열 인스턴스(null)
         */
        int[] grade3 = new int[5]; //길이가 5인 int형 배열선언및 생성
        grade3[0] = 83;
        grade3[1] = 38;
        grade3[2] = 45;
        grade3[3] = 69;
        grade3[4] = 70;
        for (int i = 0; i < grade3.length; i++) {
            System.out.println(grade3[i] + ""); //인덱스를 이용한 배열 접근
        }
        //길이 초과하는 인덱스를 사용하면 ArrayIndexOutOfBounds
        //System.out.println(grade3[5]); ArrayIndexOutOfBounds 예외 발생

        //변수와 마찬가리고 배열도 선언과 동시에 초기화 할수 있다
        //타입[] 배열이름 = {배열요소1, 배열요소2, ...}
        //타입[] 배열이름 = new 타입[]{배열요소1, 배열요소2, ...};

        //배열 선언과 초기화를 따로 진행해야할 경우
        //메소드의 인수로 배열을 전달하면서 초기화해야 할 경우
        int[] grade4 = {70, 80, 90}; //배열의 선언과 동시에 초기화 할수 있음
        int[] grade5 = new int[]{70, 80, 90}; //배열 선언과 동시에 초기화 할수 있음
        int[] grade6;
        //grade6 = {70,80,90}; 이미 선언된 배열을 이방법으로 초기화하면 오류가 발생함
        int[] grade7;
        grade7 = new int[]{70, 80, 90}; //이미 선언된 배열은 이방법으로만 초기화 할수 있음

        for (int i = 0; i < grade4.length; i++) {
            System.out.println(grade4[i] + ""); //인덱스를 이용한 배열 접근
        }

        for (int i = 0; i < grade5.length; i++) {
            System.out.println(grade5[i] + ""); //인덱스를 이용한 배열 접근
        }

        int[] grade8 = new int[]{85, 65, 90};
        for (int i = 0; i < grade8.length; i++) {
            System.out.println(grade8[i] + "");
        }
        //배열 요소의 합과 평균을 구하는 예제
        int[] grade9 = new int[]{87, 63, 97};
        int sum = 0;

        for (int i = 0; i < grade9.length; i++) {
            sum += grade9[i];
        }
        System.out.println("모든과목에서 받은 점수의 합은" + sum + "입니다");
        System.out.println("이 학생의 평균은" + (sum / grade9.length) + "입니다");
        //다차원 배열
        //2차원 이상의 배열을 의미한다 배열 요소로 또다른 배열을 가지는 배열을 의미한다
        //2차원 배열은 배열 요소로 1차원 배열을 가지는 배열
        //3차원 배열은 배열 요소 2차원 배열을 가지는 배열
        //2차원 배열 배열의 요소로 1차원 배열을 가지는 배열입니다
        //타입
        //타입[][] 배열이름;
        //타입 배열이름[][];
        //타입[] 베열이름[];
        int[][] arr = new int[2][3];
        int k = 10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = k; //인덱스를 이용한 초기화
                k += 10;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
        //배열의 선언과 동시에 초기화하는 방법
        //1차원 배열과 마찬가지로 2차원 배열도 선언과 동시에 초기화 할수 있다
        //2차원 배열의 모든 요소를 좀더 직관적으로 초기화 할수 있다
        //타입 배열이름[행의길이][열의길이] = { 배열요소[0][0], 배열요소[0][1], ... }
        //2차원 배열의 초기화 형태로 초기화 하는 예제입ㄴ다
        int[][] arr2 = {
                {10, 20, 30},
                {40, 50, 60}
        };
        //가변 배열
        //2차원 배열 생성할때 열의 길이를 명시하지 않음으로써, 행마다 다른 길이의 배열을 요소로 저장할수 있다
        //행마다 다른길이의 배열을 저장할수 있는 배열을 가변 배열
        int[][] arr3 = new int[3][];
        arr3[0] = new int[2];
        arr3[1] = new int[4];
        arr3[2] = new int[1];
        //두번째 첨자 생략하면 가변 배열을 만들수 있다
        //가변배열도 초기화 블록을 사용하여 베열을 선언과 동시에 초기화 할수 있다

        //가변배열을 선언과 동시에 초기화 블록을 초기화하는 예제
        int[][] arr4 = {
                {10, 20},
                {10, 20, 30, 40},
                {10}
        };
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.println(arr4[i][j] + " ");
            }
            System.out.println();
        }
        //베열의 활용
        //배열의 복사
        //배열은 한번생성하면 그 길이를 변경할수 없다
        //더 많은 데이터를 저장하기 위해서 더욱 큰배열을 만들고, 이전 배열의 데이터를 새로 만든 배열로 복사해야합니다
        /*
        1.System클래스의 arraycopy()메소드
        2.Arrays클래스의 copyOf()메소드
        3.Object클래스의 clone()메소드
        4.for문과 인덱스를 이용한 복사
        araycopy() copyOf() 메소드와 for문 이용한 복사 배열의 길이 마음대로 늘리기
        clone() 메소드 이전배열과 같은 깉이의 배열밖에 만들수 없다
         */
        int[] arr5 = new int[]{10, 20, 30, 40, 50};
        int newLen = 10;

        //1.System클래스의 arraycopy메소드
        int[] arr6 = new int[newLen];
        System.arraycopy(arr5, 0, arr6, 0, arr5.length);
        for (int i = 0; i < arr6.length; i++) {
            System.out.println(arr6[i] + "");
        }
        System.out.println();

        //2.Array클래스의 copyOf()메소드
        int[] arr7 = Arrays.copyOf(arr5, 10);
        for (int i = 0; i < arr7.length; i++) {
            System.out.println(arr7[i] + "");
        }
        System.out.println();

        //3.Object클래스의 clone()메소드
        int[] arr8 = (int[]) arr6.clone();
        for (int i = 0; i < arr8.length; i++) {
            System.out.println(arr8[i] + "");
        }
        System.out.println();

        //4.for문과 인덱스 이용한 복사
        int[] arr9 = new int[newLen];
        for (int i = 0; i < arr5.length; i++) {
            arr9[i] = arr5[i];
        }
        for (int i = 0; i < arr9.length; i++) {
            System.out.println(arr9[i] + " ");
        }

        //enhanced for문은 명시한 배열이니 컬렉션의 길미만큼 반복되어 실행됩니다
        //루프마다 각 요소는 명시한 변수의 이름으로 저장되며 명령문에서는 이변수를 사용하여 각 요소를 참조할수 있다
        //enhancde for문 문법
        //for(타입변수이름 : 배열이나 컬렉션 이름) {
        // 배열의 길이 만큼 반복적으로 실행하고자 하는 명령문
        //}
        //Enhanced for문을 사용하여 각 배열 요소값을 출력하는 예제입니다
        int[] arr10 = new int[] {1,2,3,4,5};
        for (int e : arr10) {
            System.out.println(e + "");
        }
        //for문과 enhanced for문을 이용하여 모든 배열 요소에 10을 더하는 예제입니다
        int[] arr11 = new int[]{1,2,3,4,5};
        int[] arr12 = new int[]{10,20,30,40,50};

        for (int i =0; i<arr11.length; i++) {
            arr11[i] += 10; //각 배열요소에 10을 더함
        }

        for (int e: arr12) {
            e += 10; //각 배열요소에 10을 더합
        }
        for (int i=0; i<arr11.length; i++) {
            System.out.println(arr11[i] + "");
        }
        for (int i=0; i<arr12.length; i++) {
            System.out.println(arr12[i] + "");
        }
    }
}
