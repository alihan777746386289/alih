import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (String s : input) {
            int num = Integer.parseInt(s);
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}