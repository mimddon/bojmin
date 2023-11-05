package hello.bojmin.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sliver_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int k = 666;
        int result = 0;

        String numberStr;

        while (true) {
            numberStr = String.valueOf(k);

            if (numberStr.contains("666")) {
                count++;
                result = k;
            }

            if (count == N) {
                break;
            }

            k++;

        }
        System.out.println(result);


    }
}
