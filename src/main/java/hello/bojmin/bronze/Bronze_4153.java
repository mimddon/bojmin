package hello.bojmin.bronze;

import java.io.*;

public class Bronze_4153 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while (true) {
            String[] test = br.readLine().split(" ");

            int a = Integer.parseInt(test[0]);
            int b = Integer.parseInt(test[1]);
            int c = Integer.parseInt(test[2]);

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            int max = Math.max(Math.max(a, b), c);
            int min = Math.min(Math.min(a, b), c);
            int mid = a + b + c - max - min;


            if ((min * min) + (mid * mid) == (max * max)) {
                bw.write("right\n");
            } else {
                bw.write("wrong\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();

    }
}
