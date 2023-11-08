package hello.bojmin.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int a = (N - 1);
        int b = 0;
        int count = 1;

        while (a > 0) {
            b+=6;
            a -= b;
            count++;
        }
        System.out.println(count);
    }
}
