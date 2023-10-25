package hello.bojmin.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] ints = new int[N];

        int max = -1000000;
        int min = 1000000;

        for (int i = 0; i < N; i++) {
            ints[i] = Integer.parseInt(input[i]);

            if (max < ints[i]) {
                max = ints[i];
            }
            if (min > ints[i]) {
                min = ints[i];
            }
        }
        System.out.println(min + " " + max);

    }
}
