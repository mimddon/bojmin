package hello.bojmin.bronze;

import java.util.Scanner;

public class Bronze_2739 {
    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(N + " * " + i + " = " + (N*i));
        }
    }
}
