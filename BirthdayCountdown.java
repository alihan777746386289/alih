import java.time.LocalDate;
import java.time.Period;

public class BirthdayCountdown {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1995, 5, 20); // Пример даты рождения
        LocalDate today = LocalDate.now();
        LocalDate nextBirthday = birthDate.withYear(today.getYear());

        if (nextBirthday.isBefore(today) || nextBirthday.isEqual(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }

        Period period = Period.between(today, nextBirthday);
        System.out.println("До вашего следующего дня рождения осталось " + period.getMonths() + " месяцев и " + period.getDays() + " дней.");
    }
}