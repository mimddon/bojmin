package hello.bojmin.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sliver_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] input = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            input[i][0] = Integer.parseInt(st.nextToken());
            input[i][1] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int l = 0; l < N; l++) {
            sb.append(getRank(input, input[l][0], input[l][1])).append(" ");
        }
        System.out.println(sb);
    }
    public static int getRank(int[][] array, int weight, int height) {
        int rank = 1;
        for (int[] ints : array) {
            if (ints[0] > weight && ints[1] > height) {
                rank++;
            }
        }
        return rank;
    }
}
