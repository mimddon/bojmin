package hello.bojmin.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Sliver_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double sum = 0;

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
            sum += arr[i];
        }
        int result = (int) Math.round(sum/N);
        System.out.println(result); //산술평균

        Arrays.sort(arr); //배열 오름차순 정렬

        System.out.println(arr[N/2]); // 중앙값

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(findMode(map));//최빈값

        System.out.println(max-min);//범위

    }
    private static int findMode(Map<Integer, Integer> frequencyMap) {
        int maxFrequency = 0;
        int result = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            if (frequency == maxFrequency) {
                set.add(entry.getKey());
            }
        }
        List<Integer> arrayList = new ArrayList<>(set);

        // 정렬
        Collections.sort(arrayList);

        if (arrayList.size() >= 2) {
            result = arrayList.get(1);
        } else {
            result = arrayList.get(0);
        }
        return result;
    }
}
