package hello.bojmin.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] ints = new int[9];

        int max = 0;
        int loc = 0;

        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(br.readLine());

            if (max < ints[i]) {
                max = ints[i];
                loc = i+1;
            }
        }
        System.out.println(max);
        System.out.println(loc);
    }
}
