package hello.bojmin.bronze;

import java.util.Scanner;

public class Bronze_2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();  // B진법 수
        int base = sc.nextInt();   // B진법 (진법의 기수)

        /*int decimal = 0;  // 10진법으로 변환한 결과

        // 입력된 B진법 수를 거꾸로 뒤집기
        input = new StringBuilder(input).reverse().toString();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int digit;

            if (Character.isDigit(c)) {
                digit = c - '0';  // 숫자인 경우
            } else {
                digit = c - 'A' + 10;  // 알파벳인 경우 (A: 10, B: 11, ..., Z: 35)
            }

            decimal += digit * Math.pow(base, i);
        }*/

        System.out.println(Integer.parseUnsignedInt(input,base));
    }

}

