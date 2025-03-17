import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class SundaysInMonthFinder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите год и месяц (ГГГГ-ММ): ");
        
        String input = reader.readLine(); // Читаем строку
        YearMonth ym = YearMonth.parse(input);
        
        List<LocalDate> sundays = new ArrayList<>();
        
        for (int i = 1; i <= ym.lengthOfMonth(); i++) {
            LocalDate date = ym.atDay(i);
            if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                sundays.add(date);
            }
        }
        
        System.out.println("Воскресенья в месяце: " + sundays);
    }
}