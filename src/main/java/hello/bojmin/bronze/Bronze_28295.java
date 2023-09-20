package hello.bojmin.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_28295 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int student = 0;

        for (int i = 0; i < 10; i++) {
            int j = Integer.parseInt(br.readLine());
            if (j == 1) {
                student += 90;
            } else if (j == 2) {
                student += 180;
            } else {
                student -= 90;
            }
        }
        int degree = student % 360;

        if (degree == 0) {
            System.out.println("N");
        } else if (degree == 90 || degree == -90) {
            System.out.println("E");
        } else if (degree == 180 || degree == -180) {
            System.out.println("S");
        } else {
            System.out.println("W");
        }
    }
}
