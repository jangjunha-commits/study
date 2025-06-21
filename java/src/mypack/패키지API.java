package mypack;

import java.util.Scanner; //import the Scanner class

public class 패키지API {
    public static void main(String[] args) {
        /*
        자바 패키지 및 api
        클래스를 그룹화하는데 사용됩니다 파일 디렉토리및 폴더
        내장 패키지
        사용자 정의 패키지
        내장 패키지
        단일 클래스를 가져오거나 지정된 패키지에 속하는 모든 클래스를 포함하는 전체 패키지를 가져올수 있다
        라이브러리에서 클래스 또는 패키지를 사용하려면 import키워드
        import package.name.Class;
        import package.name.*;
        클래스 가져오기
        import java.util.Scanner;
        Scanner 사용자 입력값을 받는데 사용되는 클래스
        java.util는 패키지 입니다 Scanner의 한종류입니다 java.util패키지
        Scanner클래스 클래스의 객체를 생성하고 다음에서 찾을수 있는 모든 방법을 사용합니다 Scanner수입문서
        nextLine()전체 줄을 읽는데 사용되는 메서드
        Scanner 사용자 입력을 받기 위한 클래스
         */
        Scanner object3 = new Scanner(System.in);
        String userName;

        //Enter userName and press Enter
        System.out.println("Enter username");
        userName = object3.nextLine();

        System.out.println("UserName is : " + userName);

        //패키지 가져오기
        //java.util패키지
        //이패키지는 날짜 및 시간 시설 난수 생성기 및 기타 유틸리티 클래스도 포함되어 있다
        //전체 패키지 가져오려면 문장 별표 기호(*)
        //import java.util.*;
        //사용자 정의 패키지
        //java가 파일 시스템 디렉토리를 사용하여 지정한다
        //패키지를 만들려면 package키워드
        System.out.println("This is my package!");
        
    }
}
