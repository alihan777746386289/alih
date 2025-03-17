import java.io.File;

public class suport3 {
    public static void main(String[] args) {
        File file = new File("example.txt"); // Проверьте путь к файлу

        if (file.exists()) {
            String parent = file.getParent();
            if (parent != null) {
                System.out.println("Родительский каталог: " + parent);
            } else {
                System.out.println("Файл находится в корневой директории.");
            }
        } else {
            System.out.println("Ошибка: Файл не найден.");
        }
    }
}