package hello.bojmin.silver;

import java.io.*;
import java.util.Stack;

public class Sliver_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String input = br.readLine();
            if (input.equals(".")) {
                break;
            }
            bw.write(solve(input) + "\n");
        }
        bw.flush();

    }

    private static String solve(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(')
                    return "no";
                else
                    stack.pop();
            } else if (c == ']') {
                if (stack.isEmpty() || stack.peek() != '[')
                    return "no";
                else
                    stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return "yes";
        } else {
            return "no";
        }
    }

}
