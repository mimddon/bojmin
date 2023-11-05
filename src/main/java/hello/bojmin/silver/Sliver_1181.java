package hello.bojmin.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Sliver_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = new String[N];

        for (int i = 0; i < N; i++) {
            input[i] = br.readLine();
        }

        HashSet<String> uniqueSet = new HashSet<>(Arrays.asList(input)); // HashSet을 이용하여 중복제거
        String[] uniqueArray = uniqueSet.toArray(new String[0]); // 메모리절약을 위해 크기가0인 배열을 생성

        Arrays.sort(uniqueArray, Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())); //길이순으로 정렬 후 사전순정렬

        for (String s : uniqueArray) {
            System.out.println(s);
        }
    }
}
