import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("example.txt");

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("Файл успешно удален.");
            } else {
                System.out.println("Ошибка при удалении файла.");
            }
        } else {
            System.out.println("Файл не найден.");
        }
    }
}