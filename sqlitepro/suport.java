import java.io.File;
import java.util.Date;

public class suport {
    public static void main(String[] args) {
        File file = new File("example.txt"); // Укажите путь к файлу

        if (file.exists()) {
            System.out.println("Имя файла: " + file.getName());
            System.out.println("Абсолютный путь: " + file.getAbsolutePath());
            System.out.println("Дата последнего изменения: " + new Date(file.lastModified()));
        } else {
            System.out.println("Файл не найден.");
        }
    }
}