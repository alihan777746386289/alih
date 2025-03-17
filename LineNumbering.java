import java.io.*;

public class LineNumbering {
    public static void programEntry() {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {

            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                writer.write(lineNumber + ". " + line + "\n");
                lineNumber++;
            }

            System.out.println("Строки пронумерованы.");
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}