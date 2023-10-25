package hello.bojmin.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Bronze_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while (!Objects.equals(input = br.readLine(), "0 0")) {
            int A = Integer.parseInt(String.valueOf(input.charAt(0)));
            int B = Integer.parseInt(String.valueOf(input.charAt(2)));

            System.out.println(A + B);
        }
        br.close();
    }
}
