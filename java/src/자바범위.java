public class 자바범위 {
    public static void main(String[] args) {
        //자바 범위
        //영역내에서만 접근할수 있다 -> 스코프
        //매서드 내에서 직접 선언한 변수는 선언된 코드 라인 다음에 메서드 내 어디에서나 사용할수 있다
        //방법범위
         //code here cannot use x
        int x = 200;
        //code here can use x
        System.out.println(x);
        //블록범위
        { //this is a block
          //code here cannot use x
            int x2 = 300;
            //code here can use x
            System.out.println(x2);
        }//the block ends here
    }
}
