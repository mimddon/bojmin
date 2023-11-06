package hello.bojmin.silver;

import java.math.BigInteger;
import java.util.Scanner;

public class Sliver_1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        /*BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= N; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        while (factorial.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            count++;
            factorial = factorial.divide(BigInteger.TEN);
        }*/
        //BigInteger 을 이용해서 factorial을 직접구해서 풀 수 있다.

        /*int k = N/5 + N/25 + N/125;
        System.out.println(k);*/
        // N의 5의 배수를 세면 되므로 이렇게 풀 수 있다.


        int t;
        for (int i = 1; i <= N; i++) {
            t = i;
            while (t % 5 == 0) {
                count++;
                t /= 5;
            }
        }

        System.out.println(count);

    }
}
