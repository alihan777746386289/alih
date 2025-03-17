import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("example.txt"); // Укажи свой путь

        if (file.exists()) {
            System.out.println("Файл найден!");
            System.out.println("Имя файла: " + file.getName());
            System.out.println("Абсолютный путь: " + file.getAbsolutePath());
            System.out.println("Последнее изменение: " + file.lastModified());
        } else {
            System.out.println("Файл не существует.");
        }
    }
}