package hello.bojmin.bronze;

import java.io.*;

public class Bronze_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int k, n;

        for (int i = 0; i < T; i++) {
            k = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());

            bw.write(String.valueOf(getResult(k, n)));
            bw.newLine();
        }
        bw.flush();
    }

    public static int getResult(int k, int n) {
        int[][] department = new int[k+1][n+1];
        for (int i = 1; i <= n; i++) {
            department[0][i] = i;
        }
        for (int i = 1; i <= k; i++) {
            for (int l = 1; l <= n; l++) {
                department[i][l] = department[i][l-1] + department[i-1][l];
            }
        }
        return department[k][n];
    }
}
