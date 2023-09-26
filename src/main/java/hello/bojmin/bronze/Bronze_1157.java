package hello.bojmin.bronze;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Bronze_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputWord = br.readLine().toUpperCase();
        Map<Character, Integer> charF = new HashMap<>();
        char most = '?';
        int max = 0;



        for (char c : inputWord.toCharArray()) {
            charF.put(c, charF.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charF.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
                most = entry.getKey();
            } else if (max == entry.getValue()) {
                most = '?';
            }
        }

        bw.write(most);

        bw.flush();
        bw.close();
        br.close();
    }
}
