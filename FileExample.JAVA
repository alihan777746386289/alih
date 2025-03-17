import java.io.File;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("example.txt");

        if (file.exists()) {
            System.out.println("Файл бар.");
            System.out.println("Аты: " + file.getName());
            System.out.println("Абсолютті жолы: " + file.getAbsolutePath());
            System.out.println("Соңғы өзгертілген уақыты: " + new Date(file.lastModified()));
        } else {
            System.out.println("Файл жоқ.");
        }
    }
}