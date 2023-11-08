package hello.bojmin.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sliver_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        boolean[] circle = new boolean[N+1];
        int count = 0;

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        for (int i = 1; i <= N; i++) {
            circle[i] = true;
        }
        while (containsTrue(circle)) {
            for (int i = 1; i <= N; i++) {
                if (circle[i]) {
                    count++;
                }
                if (count == K) {
                    circle[i] = false;
                    count = 0;
                    if (containsTrue(circle)) {
                        sb.append(i).append(", ");
                    } else {
                        sb.append(i);
                    }
                }
            }
        }
        sb.append(">");
        System.out.println(sb);
    }

    public static boolean containsTrue(boolean[] array) {
        for (boolean element : array) {
            if (element) {
                return true;
            }
        }
        return false;
    }

}
