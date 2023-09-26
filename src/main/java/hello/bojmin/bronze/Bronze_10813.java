package hello.bojmin.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Bronze_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());


        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int save;

        int[] box = new int[N];

        for (int j = 0; j < N; j++) {
            box[j] = j+1;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1 ;
            int b = Integer.parseInt(st.nextToken()) - 1 ;

            save = box[a];

            box[a] = box[b];

            box[b] = save;

        }
        for (int k = 0; k < N; k++) {
            bw.write(Integer.toString(box[k]) + " ");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
