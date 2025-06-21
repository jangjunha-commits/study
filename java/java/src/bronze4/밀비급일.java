package bronze4;

import java.util.Scanner;

public class 밀비급일 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String line = sc.nextLine();

            if (line.equals("END")) {
                break;
            }

            String reversed = new StringBuilder(line).reverse().toString();
            //new StringBuilder()문자열을 수정하거나 조정할수 있습니다
            //reverse() 문자열을 뒤집어 줍니다
            //toString()하려면 StringBuilder출력할때 String비슷하지만 toString()해줘야합니다
            //그래서 일반 String으로 변환해줘야 합니다
            System.out.println(reversed);
        }
    }
}
