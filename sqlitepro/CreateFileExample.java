import java.io.File;

public class CreateFileExample {
    public static void main(String[] args) {
        File file = new File("example.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("Файл сәтті құрылды: " + file.getAbsolutePath());
            } else {
                System.out.println("Файл бұрыннан бар.");
            }
        } catch (Exception e) {
            System.out.println("Қате: " + e.getMessage());
        }
    }
}