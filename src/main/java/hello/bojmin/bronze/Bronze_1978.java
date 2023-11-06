package hello.bojmin.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;


        String[] input = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            if (isPrime(Integer.parseInt(input[i]))) {
                count++;
            }
        }
        System.out.println(count);

    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        } else if (num <= 3) {
            return true;
        }

        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
