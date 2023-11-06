package hello.bojmin.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sliver_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        long[] kLength = new long[K];
        long result = 0;
        long mid, count;

        for (int i = 0; i < K; i++) {
            kLength[i] = Integer.parseInt(br.readLine());
        }

        long left = 1;
        long right = Integer.MAX_VALUE;

        while (left <= right) {
            count = 0;
            mid = (left+right) / 2;
            for (int i = 0; i < K; i++) {
                count += kLength[i]/mid;
            }
            if (count >= N) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        System.out.println(result);
    }
}
