package hello.bojmin.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze_1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int point = 0;
        int sum = 0;
        int[] test = new int[b];

        for (int i = 1; i <= b; i++) {
            for (int l = 0; l < i; l++) {
                if (point >= b) {
                    break;
                }
                test[point] = i;
                point++;
            }
        }
        for (int k = a; k <= b; k++) {
            sum = sum + test[k-1];
        }
        System.out.println(sum);
    }
}

        /*int n = 1;
        int sum = 0;
        int idx = 0;

        loop:
        while (true) {

            for(int i = 0; i<n; i++){
                idx++;
                sum += n;

                if (idx == A) {
                    sum = n;
                }

                if(idx == B){
                    break loop;
                }

            }

            n++;
        }

        System.out.println(sum);*/



