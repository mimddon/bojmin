package hello.bojmin.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().trim().split(" ");

        int count = input.length;

        if (input[0].isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(count);
        }
    }
}
