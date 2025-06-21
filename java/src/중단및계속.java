public class 중단및계속 {
    public static void main(String[] args) {
        /*
        브레이크
        break 튜토리얼이 이전에 사요된 문장 뛰어내는데 사용
        switch진술
        break문장은 루프에서 뛰어내리는 데에도 사용할수 있다
        i가 4일때 루프를 멈춥니다
         */
        for (int i=0; i<10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        //게속
        //continue문 지정된 조건이 발생하면 반복을 깨고 다음반복으로 이어집니다
        //4의 값을 건너 뛰는 예제
        for (int i = 0; i<10; i++) {
            if(i == 4) {
                continue;
            }
            System.out.println(i);
        }
        //루프 중 침입및 계속
        //break그리고 continue 루프중에
        //브레이크 예제
        int i = 0;
        while (i < 20) {
            System.out.println(i);
            i++;
            if (i == 10) {
                break;
            }
        }
        //예제 계속하기
        /*
        int i2 = 0;
        while (i2 < 20) {
            if (i2 == 10 || i2 % 3 == 0) {
                continue;
            }
            System.out.println(i2);
            i++;
        }
         */
    }
}
