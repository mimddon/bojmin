package hello.bojmin.bronze;

import java.io.*;

public class Bronze_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] strs = br.readLine().split(" ");
            int l = Integer.parseInt(strs[0]);
            char[] chars = strs[1].toCharArray();

            for (int j = 0; j < chars.length; j++) {
                char a = chars[j];
                for (int k=0; k<l; k++) {
                    bw.write(a);
                }
            }
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();

    }
}
