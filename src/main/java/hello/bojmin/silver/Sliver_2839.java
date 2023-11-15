package hello.bojmin.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sliver_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        if (N == 4 || N == 7) {
            System.out.println(-1);
        } else {
            switch (N % 5) {
                case 1:
                    N -= 6;
                    count += 2;
                    count += N/5;
                    break;
                case 2:
                    N -= 12;
                    count += 4;
                    count += N/5;
                    break;
                case 3:
                    N -= 3;
                    count += 1;
                    count += N/5;
                    break;
                case 4:
                    N -= 9;
                    count += 3;
                    count += N/5;
                    break;
                case 0:
                    count = N/5;
                    break;

            }
            System.out.println(count);
        }
    }
}
