import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.YearMonth;

public class LastDayOfMonthFinde {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите год и месяц (ГГГГ-ММ): ");
        
        String input = reader.readLine();  // Читаем строку
        YearMonth ym = YearMonth.parse(input);
        
        System.out.println("Последний день месяца: " + ym.atEndOfMonth());
    }
}