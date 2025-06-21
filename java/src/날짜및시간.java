import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class 날짜및시간 {
    public static void main(String[] args) {
        /*
        LocalDate
        LocalTime
        LocalDateTime
        DateTimeFormatter
         */
        //현재 날짜 표시
        //java.time.LocalDate 클래스 사용 now()방법
        LocalDate object = LocalDate.now();
        System.out.println(object);
        //현재 시간 표시
        LocalTime object2 = LocalTime.now();
        System.out.println(object2);
        //현재 날짜 및 시간 표시
        //java.time.LocalDateTime 클래스 now()방법
        LocalDateTime object3 = LocalDateTime.now();
        System.out.println(object3);
        //날짜 및 시간 형식 지정
        //DateTimeFormatter 와의 수업 ofPattern() 날짜-시간 객체를 형식화하거나 구문분석하는 동일한 패키지의 메서드입니다
        //T와 나노초 모두 제거합니다
        LocalDateTime object4 = LocalDateTime.now();
        System.out.println("Before formatting : " + object4);
        DateTimeFormatter object5 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String object6 = object4.format(object5);
        System.out.println("After formatting : " + object6);
    }
}
