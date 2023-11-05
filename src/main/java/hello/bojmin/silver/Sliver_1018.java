package hello.bojmin.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sliver_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] board = new char[N][M];

        int minRepaint = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            String row = br.readLine();
            board[i] = row.toCharArray();
        }

        for (int l = 0; l <= N-8; l++) {
            for (int k = 0; k <= M - 8; k++) {
                int repaintW = countRepaint(board, l, k, 'W');
                int repaintB = countRepaint(board, l, k, 'B');
                minRepaint = Math.min(minRepaint, Math.min(repaintW, repaintB));
            }
        }
        System.out.println(minRepaint);

    }
    public static int countRepaint(char[][] board, int row, int col, char startChar) {
        int repaint = 0;
        char current = startChar;
        for (int i = row; i < row + 8; i++) {
            for (int l = col; l < col + 8; l++) {
                if (board[i][l] != current) {
                    repaint++;
                }
                current = (current == 'W') ? 'B' : 'W';
            }
            current = (current == 'W') ? 'B' : 'W';
        }

        return repaint;
    }
}
