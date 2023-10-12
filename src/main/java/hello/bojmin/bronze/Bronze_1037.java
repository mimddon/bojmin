package hello.bojmin.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze_1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] divisor = new int[count];
        int max = 0;
        int min = 1000000;

        for (int i = 0; i < count; i++) {
            divisor[i] = Integer.parseInt(st.nextToken());

            if (max <= divisor[i]) {
                max = divisor[i];
            }
            if (min >= divisor[i]) {
                min = divisor[i];
            }

        }

        System.out.println(max*min);


    }
}
