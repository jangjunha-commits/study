public class 자바재귀 {
    public static void main(String[] args) {
        //자바 재귀
        //재귀는 함수자체를 호출하는 기법입니다
        //두 숫자 더하는 것은 쉽지만 다양한 숫자를 더하는 것은 복잡합니다
        //재귀를 사용하여 두 숫자를 더하는 간단한 작업으로 세분화하여 다양한 숫자를 더합니다
        int result = sum(20);

        System.out.println(result);

        int results = mul(30, 40);

        System.out.println(results);
    }
        public static int sum(int k) {
            if(k>0) {
                return k + sum(k-1);
            }else {
                return 0;
            }
        }
    //설명된 예시
    //sum()함소 호출하려면 매개변수를 초기화합니다 k 다음보다 작은 모든 숫자의 합으로 n k그리고 결과를반환합니다
    //k가 0이되면 함수는 그냥 0을 반환합니다
    //실행시 프로그램은 단계를 따릅니다
    //정지 조건n
    //루프가 무한 반복 문제에 부딪힐수 있는 것처럼, 재귀함수도 무한 반복 문제에 부딫힐수 있다
    //무한재귀는 함수가 스스로를 끊임없이 호출하는 것을 의미합니다
    //모든 재귀함수는 함수가 스스로 호출을 멈추는 조건이 정지조건을 가져와야합니다
    //정지조건은 매개변수가 다음과 같은 경우 k가 0됩니다
    //재귀를 사용하여 5에서 10사이의 모든 숫자를 더합니다
    public static int mul(int start, int end) {
        if (end > start) {
            return end + mul(start, end-1);
        } else {
            return end;
        }
    }

}
