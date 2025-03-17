import java.io.*;
import java.util.Scanner;

public class WordCounter {
    public static void programEntry() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String content = reader.lines().reduce("", (a, b) -> a + " " + b);
            int wordCount = content.split("\\s+").length;
            System.out.println("Слов в файле: " + wordCount);
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}