package hello.bojmin.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String input = br.readLine();

        long hashValue;
        long result = 0;
        long r = 31;
        long M = 1234567891;
        long rPow = 1;

        for (int i = 0; i < L; i++) {
            hashValue = input.charAt(i) - 96;
            hashValue = hashValue * rPow % M;
            rPow = (rPow * r) % M;
            result += hashValue % M;
        }
        System.out.println(result % M);
    }
}
