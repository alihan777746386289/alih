import java.io.File;

public class CheckFileOrDirectory {
    public static void main(String[] args) {
        File file = new File("example.txt"); // Замени на нужный путь

        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("Объект является файлом.");
            } else if (file.isDirectory()) {
                System.out.println("Объект является каталогом.");
            }
        } else {
            System.out.println("Файл или каталог не существует.");
        }
    }
}