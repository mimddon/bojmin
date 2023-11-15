package hello.bojmin.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sliver_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int temp = 1;
        int x = 1;
        int y = 1;


        while (count < N) {
            temp++;
            count += temp;
        }

        if (count == N) {
            if (temp % 2 == 0) {
                x = temp;
            } else {
                y = temp;
            }
            System.out.println(x + "/" + y);

        } else {
            if (temp % 2 == 0) {
                x = temp;
                while (count != N) {
                    x--;
                    y++;
                    count--;
                }
            } else {
                y = temp;
                while (count != N) {
                    x++;
                    y--;
                    count--;
                }
            }
            System.out.println(x + "/" + y);
        }


    }
}
