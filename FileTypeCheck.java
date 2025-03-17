import java.io.File;

public class FileTypeCheck {
    public static void main(String[] args) {
        File file = new File("example.txt");

        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("Это обычный файл.");
            } else if (file.isDirectory()) {
                System.out.println("Это каталог.");
            }
        } else {
            System.out.println("Файл или каталог не существует.");
        }
    }
}