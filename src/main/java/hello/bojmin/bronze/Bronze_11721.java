package hello.bojmin.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();

        if (a.length() > 10) {
            for (int i = 0; i < a.length(); i+=10) {
                String bi = a.substring(i, Math.min(i + 10, a.length()));
                System.out.println(bi);
            }
        }else {
            System.out.println(a);
        }
    }
}
