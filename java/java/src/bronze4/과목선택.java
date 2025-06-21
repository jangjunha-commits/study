package bronze4;

import java.util.Arrays;
import java.util.Scanner;

public class 과목선택 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] science = new int[4]; //과학
        int[] social = new int[2]; //사회

        // 과학 과목 입력
        for (int i = 0; i < 4; i++) {
            science[i] = sc.nextInt();
        }

        // 사회 과목 입력
        for (int i = 0; i < 2; i++) {
            social[i] = sc.nextInt();
        }

        // 과학 점수 정렬 (내림차순 X, 그냥 정렬해서 뒤에서 3개 선택)
        Arrays.sort(science);
        Arrays.sort(social);

        int scienceSum = science[1] + science[2] + science[3]; // 상위 3개
        int socialMax = social[1]; // 상위 1개

        System.out.println(scienceSum + socialMax);
    }
}
