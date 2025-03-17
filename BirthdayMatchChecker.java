import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.MonthDay;

public class BirthdayMatchChecker {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Введите первую дату рождения (ММ-ДД): ");
            MonthDay bd1 = MonthDay.parse("--" + reader.readLine()); // Добавляем --, чтобы корректно обработать ввод
            
            System.out.print("Введите вторую дату рождения (ММ-ДД): ");
            MonthDay bd2 = MonthDay.parse("--" + reader.readLine());
            
            if (bd1.equals(bd2)) {
                System.out.println("Дни рождения совпадают!");
            } else {
                System.out.println("Дни рождения разные.");
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода!");
        } catch (Exception e) {
            System.out.println("Ошибка: введите дату в формате ММ-ДД.");
        }
    }
}