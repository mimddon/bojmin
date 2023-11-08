package hello.bojmin.silver;

import java.io.*;

public class Sliver_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String input = br.readLine();

            if (isVps(input)) {
                bw.write("YES" + "\n");
            } else {
                bw.write("NO" + "\n");
            }
        }
        bw.flush();
    }
    public static boolean isVps(String test) {
        int open = 0;
        int close = 0;

        for (int i = 0; i < test.length(); i++) {
            if (test.charAt(i) == '(') {
                open++;
            } else if (test.charAt(i) == ')') {
                close++;
            }

            if (open < close) {
                return false;
            }
        }
        return open == close;
    }



}
