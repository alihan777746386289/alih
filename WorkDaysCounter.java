import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class WorkDaysCounter {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Введите начальную дату (ГГГГ-ММ-ДД): ");
            LocalDate startDate = LocalDate.parse(reader.readLine());
            
            System.out.print("Введите конечную дату (ГГГГ-ММ-ДД): ");
            LocalDate endDate = LocalDate.parse(reader.readLine());
            
            int workDays = 0;
            LocalDate date = startDate;

            while (!date.isAfter(endDate)) {
                if (date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek() != DayOfWeek.SUNDAY) {
                    workDays++;
                }
                date = date.plusDays(1);
            }

            System.out.println("Количество рабочих дней: " + workDays);
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода!");
        } catch (Exception e) {
            System.out.println("Ошибка: введите дату в формате ГГГГ-ММ-ДД.");
        }
    }
}