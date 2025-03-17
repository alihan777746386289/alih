import java.io.*;

public class FileMerger {
    public static void programEntry() {
        try (BufferedReader reader1 = new BufferedReader(new FileReader("file1.txt"));
             BufferedReader reader2 = new BufferedReader(new FileReader("file2.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt"))) {

            String line;
            while ((line = reader1.readLine()) != null) writer.write(line + "\n");
            while ((line = reader2.readLine()) != null) writer.write(line + "\n");

            System.out.println("Файлы успешно объединены.");
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}