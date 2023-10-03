package hello.bojmin.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Bronze_1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        double result = (double) a / b;

        bw.write(String.valueOf(result));

        bw.flush();
    }

}
