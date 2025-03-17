import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class DayOfYearFinder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите дату (ГГГГ-ММ-ДД): ");
        
        String inputDate = reader.readLine();  // Читаем строку
        LocalDate date = LocalDate.parse(inputDate);
        
        System.out.println("Это " + date.getDayOfYear() + "-й день года.");
    }
}