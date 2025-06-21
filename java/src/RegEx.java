import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegEx {
    public static void main(String[] args) {
        /*
        정규표현식
        검색패턴을 형성하는 일련의 문자입니다 텍스트에서 데이터를 검색할때 이 검색패턴을 사용하여 검색 하는 내용을 설명할수 있다
        텍스트 검색 및 텍스트 대체 작업을 수행하는데 사용할수 있다
        java.util.regex 정규표현식과 함께 작동하는 패킺
        Pattern 클래스 - 검색할때 사용자 패턴을 정의합니다
        Matcher 클래스 - 패턴을 검색하는데 사용됩니다
        PatternSyntaxException 클래스 - 정규표현식 패턴에서 구문오류를 나타냅니다
        문자에서 w3schools라는 단어가 있는지 알아보세요
         */
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("vistion W3schools!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        }else {
            System.out.println("Match not found");
        }
        /*
        w3school라는 단어가 검색되고 있다
        Pattern.compile() 방법
        첫번재 매개변수는 검색중에 패턴을 나타내며 두번째 매개변수는 선택사항입니다
        matcher()메서드는 문자열에서 패턴을 검색하는 데 사용됩니다 수행된 검색에 대장 정보가 포함된 Matcher객체를 반환합니다
        find()메서드는 문자열에서 패턴이 발견되면 true를 반환하고 밝뎐되지 않으면 false를 반환하빈다
        깃발
        compile()메서드 검색 수행방식을 변경합니다
        Pattern.CASE_INSENSITIVE - 검색을 수핼항 때 문자의 경우는 무시됩니다
        Pattern.LITERAL - 패턴의 특수문자는 특별한 의미가 없으며 검색을 수핼할때 일반문자로 취급됩니다
        Pattern.UNICODE_CASE - 함께 사용하기 CASE_INSENTITIVE 영어 알파벳 이외의 문자도 무시하는 플래그
        정규표현 패턴
        Pattern.compile()
        [abc] [^abc] [0-9]
        메타문자
        | . ^ $ \d \s \b
        uxxxx
        정량 화자
        n+ n* n? n{x} n{x,y} n{x,}
         */
    }
}
