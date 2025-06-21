public class 불리언즈 {
    public static void main(String[] args) {
        /*
        true 또는 false 가치
        부울값
        boolean 키워드 값만 취할수 있다
        true 또는 false
         */
        boolean isJava = true;
        boolean isbool = false;
        System.out.println(isJava);
        System.out.println(isbool);

        //부울 표현식
        int xs = 30;
        int ys = 78;
        System.out.println(xs > ys);
        System.out.println(30 < 78);

        int x = 50;
        System.out.println(x == 50);

        System.out.println(50 == 500);
        //실제 사례
        //투표할수 있는 나이가 되는지 알아내는 실제 사례 생각 해보자
        //>= 나이를 알아보기 위한 비교연산자는 (25)는 OR보다 크며 다음과 같이 투표연령제한과 같다 18
        int myage = 25;
        int votingage = 18;
        System.out.println(myage >= votingage);

        //if-else문 사용
        int myages = 25;
        int voteages = 18;

        if (myages >= voteages) {
            System.out.println("Possible vote");
        } else {
            System.out.println("ImPossible vote");
        }
    }
}
