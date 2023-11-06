package hello.bojmin.silver;

import java.io.*;
import java.util.Arrays;

public class Sliver_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[][] xy = new int[N][2];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");

            xy[i][0] = Integer.parseInt(input[0]);
            xy[i][1] = Integer.parseInt(input[1]);
        }

        Arrays.sort(xy, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(a[1], b[1]);
            }
        });

        for (int i = 0; i < N; i++) {
            bw.write(xy[i][0] + " " + xy[i][1]);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

}
