package hello.bojmin.silver;

import java.io.*;
import java.util.Stack;

public class Sliver_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        boolean can = true;

        for (int j = 1; j <= N; j++) {
            int input = Integer.parseInt(br.readLine());

            while (count < input) {
                count++;
                stack.push(count);
                sb.append("+\n");
            }
            int num = stack.pop();
            if (num != input) {
                can = false;
                break;
            }
            sb.append("-\n");
        }

        if (can) {
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }
        // BufferdWriter 의 목적은 빠른출력이다 출력할 내용을 임시 저장할 용도로 적합하지않다
        // 버퍼가 일정량 이상 차면 비정기적으로 flush가 일어난다.
    }
}
