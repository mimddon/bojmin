package hello.bojmin.silver;

import java.io.*;
import java.util.LinkedList;

public class Sliver_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            String order = input[0];

            if ("push".equals(order)) {
                linkedList.offer(Integer.parseInt(input[1]));
            } else if ("pop".equals(order)) {
                if (linkedList.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(linkedList.poll() + "\n");
                }
            } else if ("size".equals(order)) {
                bw.write(linkedList.size() + "\n");
            } else if ("empty".equals(order)) {
                if (linkedList.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if ("front".equals(order)) {
                if (linkedList.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(linkedList.peek() + "\n");
                }
            } else if ("back".equals(order)) {
                if (linkedList.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(linkedList.peekLast() + "\n");
                }
            }

            bw.flush();
        }
    }
}
