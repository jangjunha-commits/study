package bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class YangjojangoftheYear {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=0; t<T; t++) {
            int n = Integer.parseInt(br.readLine());
            int max = -1;
            String max_name = "";
            StringTokenizer st;
            for(int i=0; i<n; i++) {
                st = new StringTokenizer(br.readLine());
                String temp = st.nextToken();
                int temp_value = Integer.parseInt(st.nextToken());
                if(max < temp_value) {
                    max = temp_value;
                    max_name = temp;
                }
            }
            System.out.println(max_name);
        }
    }
}
