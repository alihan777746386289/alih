import java.io.*;
import java.util.Arrays;

public class NumberProcessor {
    public static void programEntry() {
        try (BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"))) {
            int[] numbers = Arrays.stream(reader.readLine().split("\\s+"))
                                  .mapToInt(Integer::parseInt)
                                  .toArray();
            int sum = Arrays.stream(numbers).sum();
            double average = Arrays.stream(numbers).average().orElse(0);
            System.out.println("Сумма: " + sum + ", Среднее: " + average);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}