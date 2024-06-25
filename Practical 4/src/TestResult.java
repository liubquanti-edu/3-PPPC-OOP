import java.time.LocalDate;

public class TestResult {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 2, 1);
        LocalDate endDate = LocalDate.of(2024, 2, 4);
        int workdays = Exercise.Calculate(startDate, endDate);
        System.out.println("Number of workdays between " + startDate + " and " + endDate + ": " + workdays);
    }
}
