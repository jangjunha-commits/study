package bronze4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.Buffer;

public class 녹색거탑 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());     // 탑의 높이 입력 (1 ≤ N ≤ 5)

        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= 2;                              // 각 층마다 경우의 수가 2배씩 증가
        }

        System.out.println(result);
    }
}

