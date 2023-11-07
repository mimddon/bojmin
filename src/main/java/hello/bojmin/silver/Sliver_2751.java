package hello.bojmin.silver;

import java.io.*;
import java.util.Arrays;

public class Sliver_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] input = new int[N];

        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(input);

        for (int i = 0; i < N; i++) {
            bw.write(String.valueOf(input[i]));
            bw.newLine();
        }
        bw.flush();
    }
}
