package hello.bojmin.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] input = br.readLine().toCharArray();

        for (int i = 0; i< input.length; i++) {
            int ascii = (int) input[i];
            if ((97 <= ascii && ascii <= 109) || (65 <= ascii && ascii <= 77)) {
                input[i] = (char) (ascii+13);
            } else if ((110 <= ascii && ascii <= 122) || (78 <= ascii && ascii <= 90)) {
                input[i] = (char) (ascii-13);
            }
        }

        System.out.println(String.valueOf(input));

    }
}
