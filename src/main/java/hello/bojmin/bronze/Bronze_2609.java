package hello.bojmin.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int low = Math.min(N, M);
        int G = 1;
        for (int i = 2; i <= low; i++) {
            if (N % i == 0 && M % i == 0) {
                G = i;
            }
        }
        System.out.println(G);
        System.out.println((N*M)/G);
    }
}
