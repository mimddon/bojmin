package hello.bojmin.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class Sliver_18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        LinkedList<Integer> deque = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            deque.push(Integer.parseInt(br.readLine()));
        }

        Collections.sort(deque);

        int a = Math.round(N * ((float) 3 /20));

        for (int j = 0; j < a; j++) {
            deque.pollLast();
            deque.pollFirst();
        }
        N = N - 2 * a;
        int result = 0;
        while (!deque.isEmpty()) {
            result += deque.poll();
        }
        result = Math.round((float) result / N);
        System.out.println(result);
    }
}
