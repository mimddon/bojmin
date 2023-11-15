package hello.bojmin.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sliver_18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] field = new int[N][M];
        int min = 256;
        int max = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                field[i][j] = Integer.parseInt(st.nextToken());

                if (field[i][j] < min) {
                    min = field[i][j];
                }
                if (field[i][j] > max) {
                    max = field[i][j];
                }
            }
        }

        int time = Integer.MAX_VALUE;
        int height = 0;
        int h = min;

        while (h <= max) {
            int block = B;
            int timeCount = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (h < field[i][j]) {
                        timeCount += (field[i][j] - h) * 2;
                        block += field[i][j] - h;
                    } else {
                        timeCount += h - field[i][j];
                        block -= h - field[i][j];
                    }
                }
            }
            if (block < 0) {
                break;
            }
            if (time >= timeCount) {
                time = timeCount;
                height = h;
            }
            h++;
        }
        System.out.println(time + " " + height);
    }
}
