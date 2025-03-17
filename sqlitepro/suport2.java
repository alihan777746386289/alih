import java.io.File;

public class suport2 {
    public static void main(String[] args) {
        File file = new File("example.txt"); // Укажите правильный путь к файлу
        
        if (file.exists()) {
            System.out.println("Имя файла: " + file.getName());
        } else {
            System.out.println("Файл не найден.");
        }
    }
}