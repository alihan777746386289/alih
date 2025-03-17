import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class NextFridayFinder {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate nextFriday = today.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("Следующая пятница: " + nextFriday);
    }
}