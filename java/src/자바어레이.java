public class 자바어레이 {
    public static void main(String[] args) {
        /*
        자바 선언하면 대괄호
        String[] cars;
        배열을 선언하려면 대괄호로 변수 유형을 정의한다
        String[] cars = {"Volvo", "BMW", "Ford"};
        int[] num = {10,20,30};
        배열 요소에 엑세스 하기
         */
        String[] str_arr = {"Dubai", "Istanbul", "Antenea", "Riyard"};
        System.out.println(str_arr[0]);
        //배열 요소 변경
        str_arr[2] = "Bagdard";
        System.out.println(str_arr[2]);
        //배열 길이
        System.out.println(str_arr.length);
        //배열을 통한 스루
        //for루프 그리고 length루프 실행해야 하는 횟수를 지정하는 속성
        //자동차 배열의 모든 요소를 출력합니다
        String[] Usa_Area = {"일라노이", "플로리다", "텍사스", "캘리포니아", "버지니아"};
        for (int i = 0; i< Usa_Area.length; i++) {
            System.out.println(Usa_Area[i]);
        }
        /*
        for-each 있는 배열 통한 스루
        각자를 위한 루프들이 있다
        for (type variableName : arrayName) {
        }
        각자를 위한 루프를 사용하여 배열의 모든 요소를 출력합니다
         */
        for (String i : Usa_Area) {
            System.out.println(i);
        }
        //실제사례
        //다양한 연령대의 평균을 계산하는 프로그램
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        float avg, sum = 0;
        int length = ages.length;
        for (int age : ages) {
            sum += age;
        }

        avg = sum / length;
        System.out.println("The average age is : " + avg);

        //예
        int ages1[] = {20, 40, 50, 38, 12, 29, 24, 89};
        int lengths = ages1.length;
        int lowestAge = ages1[0];
        for (int age1 : ages1) {
            if(lowestAge > age1) {
                lowestAge = age1;
            }
        }
        System.out.println("The lowest age in the array is :" + lowestAge);

        //다차원 배열
        //베얄의 배열입니다
        //다차원 배열은 행과 열이있는 표처럼 데이터 표형식
        int[][] myNum = {{10,20,30,40}, {50,60,70}};
        System.out.println(myNum);

        //엑세스 요소
        //myNum배열의 요소에 엑세스 하려면 배열에 대한 인덱스 배열 내부 요소에 대한 인덱스 두개 지정
        int[][] myNums = {{11, 22, 33, 44}, {55,66,77}};
        System.out.println(myNums);

        //요소값 변경
        //요소의 값을 변경할수 있다
        int[][] myNumss = {{100,200,300,400}, {500,600,700}};
        ;myNumss[1][2] = 900;
        System.out.println(myNumss[1][2]);

        //다차원 배열을 통한 루프
        //for loop다른안에 for loop이차원 배열의 요소를 얻으러면
        /*
        int[][] myNum1 = {{110, 220, 330, 440}, {550, 660, 770}};
        for (int i=0; i<myNum1.length; i++) {
            for (int j=0; i<myNum1.length; j++) {
                System.out.println(myNum1[i][j]);
            }
        }
        */
        //또는 읽고 쓰기가 더 쉽다고 여겨지는 각 루프를 사용할수도 있다
        int[][] myNums2 = {{4,6,9,10}, {5,9,10}};
        for (int[] row : myNums2) {
            for (int i : row) {
                System.out.println(i);
            }
        }

    }
}
