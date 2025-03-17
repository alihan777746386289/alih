import java.io.File;

public class ParentDirectoryExample {
    public static void main(String[] args) {
        File file = new File("example.txt");

        if (file.exists()) {
            System.out.println("Ата-аналық каталог: " + file.getParent());
        } else {
            System.out.println("Файл жоқ.");
        }
    }
}