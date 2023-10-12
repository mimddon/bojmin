package hello.bojmin.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int subjects = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        double[] score = new double[subjects];

        double max = 0;

        double total = 0;

        for (int i = 0; i < subjects; i++) {
            score[i] = Integer.parseInt(input[i]);

            if (max <= score[i]) {
                max = score[i];
            }
        }

        for (int l = 0; l < subjects; l++) {
            score[l] = ((score[l]/max) * 100);

            total += score[l];
        }

        double avg = (double) total /subjects;

        System.out.println(avg);

    }
}
