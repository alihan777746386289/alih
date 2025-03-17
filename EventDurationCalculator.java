import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EventDurationCalculator {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        LocalDateTime start = LocalDateTime.parse("10.03.2025 14:00", formatter);
        LocalDateTime end = LocalDateTime.parse("10.03.2025 16:45", formatter);

        Duration duration = Duration.between(start, end);
        long hours = duration.toHours();
        long minutes = duration.toMinutesPart();

        System.out.println("Продолжительность события: " + hours + " часов " + minutes + " минут");
    }
}