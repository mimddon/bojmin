package hello.bojmin.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        StringBuilder reverse;
        String reversed;

        while (true) {
            input = br.readLine();
            if (input.equals("0")) {
                break;
            }
            reverse = new StringBuilder(input).reverse();
            reversed = reverse.toString();
            if (input.equals(reversed)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }
}
