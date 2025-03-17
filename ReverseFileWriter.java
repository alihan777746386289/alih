import java.io.*;
import java.util.*;

public class ReverseFileWriter {
    public static void programEntry() {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {

            List<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) lines.add(line);

            Collections.reverse(lines);
            for (String reversedLine : lines) writer.write(reversedLine + "\n");

            System.out.println("Файл записан в обратном порядке.");
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}