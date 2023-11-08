package hello.bojmin.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sliver_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[][] members = new String[N][];

        for (int i = 0; i < N; i++) {
            members[i] = br.readLine().split(" ");
        }

        Arrays.sort(members, (a,b) -> {
            return Integer.compare(Integer.parseInt(a[0]), Integer.parseInt(b[0]) );
        });

        for (String[] member : members) {
            System.out.println(member[0] + " " + member[1]);
        }

    }
}
