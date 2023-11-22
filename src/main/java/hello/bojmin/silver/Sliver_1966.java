package hello.bojmin.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Sliver_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int loc = Integer.parseInt(st.nextToken());
            int count = 1;

            Queue<Integer> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                queue.add(Integer.parseInt(st.nextToken()));
            }
            while (!queue.isEmpty()) {
                int temp = queue.poll();
                Queue<Integer> copy = new LinkedList<>(queue);

                if (isBig(temp, copy)) {
                    if (loc == 0) {
                        System.out.println(count);
                        break;
                    } else {
                        count++;
                        loc--;
                    }
                } else {
                    if (loc == 0) {
                        loc = queue.size();
                        queue.add(temp);
                    } else {
                        loc--;
                        queue.add(temp);
                    }
                }
            }
        }
    }

    public static boolean isBig(int a, Queue<Integer> queue) {
        while (!queue.isEmpty()) {
            if (a < queue.poll()) {
                return false;
            }
        }
        return true;
    }
}
