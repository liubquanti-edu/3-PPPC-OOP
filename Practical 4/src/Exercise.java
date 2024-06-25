import java.time.DayOfWeek;
import java.time.LocalDate;

public class Exercise {
    private static int countWeekdays(LocalDate start, LocalDate end) {
        int weekdays = 0;
        LocalDate date = start;
        while (!date.isAfter(end)) {
            if (date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek() != DayOfWeek.SUNDAY) {
                weekdays++;
            }
            date = date.plusDays(1);
        }
        return weekdays;
    }

    public static int Calculate(LocalDate startDate, LocalDate endDate) {
        if (startDate == null || endDate == null || startDate.isAfter(endDate)) {
            return 0;
        }
        return countWeekdays(startDate, endDate);
    }
}
