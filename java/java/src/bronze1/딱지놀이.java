package bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 딱지놀이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int t=0; t<n; t++) {
            StringTokenizer sta = new StringTokenizer(br.readLine());
            int asize = Integer.parseInt(sta.nextToken());
            int a[] = new int[asize];
            for(int i=0; i<asize; i++) {
                a[i] = Integer.parseInt(sta.nextToken());
            }

            StringTokenizer stb = new StringTokenizer(br.readLine());
            int bsize = Integer.parseInt(stb.nextToken());
            int b[] = new int[bsize];
            for(int i=0; i<bsize; i++) {
                  b[i] = Integer.parseInt(stb.nextToken());
            }
            Arrays.sort(a);
            Arrays.sort(b);

            boolean check = false;
            for(int i=0; asize-i>0 && bsize-i > 0; i++) {
                if (a[asize - i] > b[bsize - i]) {
                    System.out.println("A");
                    check = true;
                } else  if(a[asize-i]<b[bsize-i]){
                    System.out.println("B");
                    check = true;
                    break;
                }
            }
            if(!check) {
                if(asize>bsize) {
                    System.out.println("A");
                }else if(asize<bsize) {
                    System.out.println("B");
                }else {
                    System.out.println("D");
                }
            }
        }
    }
}
