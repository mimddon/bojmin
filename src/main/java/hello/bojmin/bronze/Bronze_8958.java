package hello.bojmin.bronze;

import java.io.*;

public class Bronze_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            char[] chars = br.readLine().toCharArray();
            int sum = 0;

            for (int a = 0; a<chars.length; a++) {

                for (int b = a; b < chars.length; b++) {
                    if(chars[b] == 'O') {
                        sum++;
                    } else {
                        break;
                    }
                }

            }
            bw.write(Integer.toString(sum));

            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
