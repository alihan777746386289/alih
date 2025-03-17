import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class Event {
    private final LocalDate date;
    private final LocalTime time;
    private final String description;

    public Event(LocalDate date, LocalTime time, String description) {
        this.date = date;
        this.time = time;
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return time + " - " + description;
    }
}

public class EventCalendar {
    public static void main(String[] args) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate searchDate = LocalDate.of(2025, 3, 14); // Дата для поиска событий

        List<Event> events = new ArrayList<>();
        events.add(new Event(LocalDate.of(2025, 3, 14), LocalTime.of(10, 0), "Совещание"));
        events.add(new Event(LocalDate.of(2025, 3, 14), LocalTime.of(14, 30), "Встреча с клиентом"));
        events.add(new Event(LocalDate.of(2025, 3, 15), LocalTime.of(9, 0), "Спортивное мероприятие"));

        System.out.println("События на " + searchDate.format(dateFormatter) + ":");
        events.stream()
              .filter(event -> event.getDate().equals(searchDate))
              .forEach(System.out::println);
    }
}