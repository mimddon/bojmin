package hello.bojmin.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());

        for(int j=0; j < i; j++) {
            for(int t=0; t < i-j; t++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
