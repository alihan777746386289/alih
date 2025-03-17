import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneDifferenceFinder {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Введите первый часовой пояс (например, Europe/Moscow): ");
            ZoneId zone1 = ZoneId.of(reader.readLine());

            System.out.print("Введите второй часовой пояс (например, America/New_York): ");
            ZoneId zone2 = ZoneId.of(reader.readLine());

            ZonedDateTime now1 = ZonedDateTime.now(zone1);
            ZonedDateTime now2 = ZonedDateTime.now(zone2);

            int difference = now1.getOffset().getTotalSeconds() - now2.getOffset().getTotalSeconds();
            System.out.println("Разница во времени: " + (difference / 3600) + " часов");
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода!");
        } catch (Exception e) {
            System.out.println("Ошибка: введите корректные названия часовых поясов (например, Europe/Moscow).");
        }
    }
}