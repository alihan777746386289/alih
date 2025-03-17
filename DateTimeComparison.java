import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeComparison {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime dt1 = LocalDateTime.parse("2025-03-14 12:30:00", formatter);
        LocalDateTime dt2 = LocalDateTime.parse("2025-03-14 14:00:00", formatter);

        if (dt1.isBefore(dt2)) {
            System.out.println("Первая дата раньше второй.");
        } else if (dt1.isAfter(dt2)) {
            System.out.println("Первая дата позже второй.");
        } else {
            System.out.println("Даты одинаковые.");
        }
    }
}