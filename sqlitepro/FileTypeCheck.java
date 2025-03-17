import java.io.File;

public class FileTypeCheck {
    public static void main(String[] args) {
        File file = new File("example.txt");

        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("Бұл файл.");
            } else if (file.isDirectory()) {
                System.out.println("Бұл каталог.");
            }
        } else {
            System.out.println("Файл жоқ.");
        }
    }
}