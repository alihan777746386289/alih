import java.io.File;

public class suport4 {
    public static void main(String[] args) {
        File file = new File("example.txt"); // Проверьте путь к файлу

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("Файл успешно удалён.");
            } else {
                System.out.println("Ошибка: Не удалось удалить файл. Возможно, он используется другой программой.");
            }
        } else {
            System.out.println("Ошибка: Файл не найден.");
        }
    }
}