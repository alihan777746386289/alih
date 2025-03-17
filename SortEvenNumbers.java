import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class SortEvenNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[n];
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
            if (arr[i] % 2 == 0) {
                evenNumbers.add(arr[i]);
            }
        }

        Collections.sort(evenNumbers);
        int evenIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = evenNumbers.get(evenIndex++);
            }
            System.out.print(arr[i] + " ");
        }
    }
}