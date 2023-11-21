package hello.bojmin.silver;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Sliver_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        Queue<Integer> prime = new LinkedList<>();
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                prime.add(i);
            }
        }
        while (!prime.isEmpty()) {
            bw.write(prime.poll() + "\n");
        }
        bw.flush();
    }
    public static boolean isPrime(int a) {
        if (a == 1) {
            return false;
        }
        if (a <= 3) {
            return true;
        }
        for (int i = 2; i <= (int)Math.sqrt(a); i++) { //소수 판별 시 a/2 이 아닌 루트a 까지만 검사하면됨.
            if ((a % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
