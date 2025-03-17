import java.io.File;

public class DeleteFileExample {
    public static void main(String[] args) {
        File file = new File("example.txt");

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("Файл жойылды.");
            } else {
                System.out.println("Файлды жою мүмкін емес.");
            }
        } else {
            System.out.println("Файл жоқ.");
        }
    }
}