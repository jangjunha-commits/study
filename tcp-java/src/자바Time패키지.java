import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.*;

public class 자바Time패키지 {
    public static void main(String[] args) {
        /*
        java time패키지
        자바에서 날짜및 시간 처리
        Calendar인스턴스 불변객체가 아니라서 값을 수정할수 있다
        윤초같은 특별한 상황 고려하지 않는다
        월 나타낼때 0-11까지
        java.time.chrono - ISO-8601정의된 표준달력
        java.time.format - 날짜와 시간 데이터를 구문분석하고 형식화 사용 클래스
        java.time.temporal - 날짜와 시간에 대한 데이터를 연산하는 사용하는 보조 클래스
        java.time.zone - 타임존

        날짜와 시각 객체 생성
        localdate와 localtime클래스 객체를 생성하기 위해서 now()와 of()메소드 라는 클래스 메소드 제공합니다
        now()메소드는 현재의 날짜와 시간을 이용하여 새로운 객체를 생성하여 반환합니다
        of()메소드는 전달딘 인수를 가지고 특정날짜와 시간을 표현하는 새로운 객체를 생성하여 반환합니다
         */
        /*
        localDate today = LocalDate.now();
        LocalTime present = LocalTime.now();
        System.out.println(today + " " + present);

        LocalDate bithday = LocalDate.of(1982, 02, 19);
        LocalTime birthTime = LocalTime.of(02, 02, 00, 100000000);
        System.out.println(bithday + " " + birthTime);
         */
        /*
        localDate today1 = LocalDate.now();

        System.out.println("올해는" + today.getYear() + "년입니다");
        System.out.println("이번달은" + today.getMonth() + "월입니다");
        System.out.println("오늘은" + today.getDayOfWeek() + "입니다.");
        System.out.println("오늘은 1년 중 " + today.get(ChronoField.DAY_OF_YEAR)+"일째 날입니다.");
        System.out.println("현재 시간은 " + present.getHour() + "시" + present.getMinute() + "분입니다.");
        */
        /*
        LocalTime present = LocalTime.now();
        String ampm;

        if(present.get(ChronoField.AMPM_OF_DAY) == 0) {
            ampm = "오전";
        } else {
            ampm = "오후";
        }
        System.out.println("지금은" + ampm + " " + present.get(ChroneField.HOUR_OF_AMPM) + "시입니다.");
        */
        /*
        LocalDate today2 = LocalDate.now();
        System.out.println("올해는" + today2.getYear() + "년입니다.");

        LocalDate otehrDay = today2.withYear(1982);
        System.out.println("올해는" + otehrDay.getYear() + "년입니다.");

        LocalTime present2 = LocalTime.now();
        System.out.println("현재시간은" + present2.getHour() + "시입니다.");

        LocalTime otehrTime = present2.withYear(1982);
        System.out.println("올해는" + otehrTime.getHour() + "시입니다.");
        */
        /*
        LocalTime present3 = LocalTime.now();
        System.out.println("현재시각은" + present3.get(ChronoField.HOUR_OF_DAY) + "시입니다.");

        LocalTime otherTime = LocalTime.now();
        System.out.println("현재시각은" + otherTime.get(ChronoUnit.HOURS) + "시입니다.");

        LocalTime anotherTime = LocalTime.now();
        System.out.println("현재시각은" + anotherTime.get(ChronoUnit.HOURS) + "시입니다.");
        */
        //날짜와 시각 객체 비교
        //LocalDate와 LocalTime클래스에도 객체를 비교할수 있는 compareTo()메소드가 오버라이딩 되어 있습니다 하지만 더욱 편리하게
        //날짜와 시간 객체를 서로 비교할수 있도록 다음같은 메소드를 제공합니다
        /*
        날짜와 시간 객체 비교
        isEqual()메소드 - equals()메소드와는 달리 오직 날짜만을 비교함
        isBefore()메소드 - 두개의 날짜와 시간 객체를 비교하여 현재 객체가 명시된 객체보다 앞선 시간인지를 비교함
        isAfter()메소드 - 두개의 날짜와 시간객체를 비교하여 현재 객체가 명시된 객체보다 늦은 시간인지를 비교함
         */
        /*
        LocalDate todays = LocalDate.now();
        LocalDate otherdays = LocalDate.of(1982, 02,19);

        System.out.println(todays.compareTo(otherdays));
        System.out.println(todays.isBefore(otherdays));
        System.out.println(todays.isEqual(otherdays));
        */

    }
}
