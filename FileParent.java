import java.io.File;

public class FileParent {
    public static void main(String[] args) {
        File file = new File("example.txt");

        if (file.exists()) {
            System.out.println("Родительский каталог: " + file.getParent());
        } else {
            System.out.println("Файл не существует.");
        }
    }
}