import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateExample {
    public static void main(String[] args) {
        // Get the current date time
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        // Create time object using of()
        LocalDate dateOf = LocalDate.of(2024, 07, 01);
        LocalTime timeOf = LocalTime.of(7, 30, 30);
        LocalDateTime dateTimeOf = LocalDateTime.of(2000, 12, 2, 2, 30, 30);
        // using parse
        LocalDateTime dateTimeParse = LocalDateTime.parse("2024-07-01T15:30");

        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.of(17, 30, 20);
        LocalDateTime ldt = LocalDateTime.of(ld, lt);

        DateTimeFormatter fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println("Formatter Default Locale: " + fmt.getLocale());
        System.out.println("Short Date: " + fmt.format(ld));

        fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println("Medium Date: " + fmt.format(ld));

        fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println("Long Date: " + fmt.format(ld));

        fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println("Full Date: " + fmt.format(ld));

        fmt = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println("Short Time: " + fmt.format(lt));

        fmt = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        System.out.println("Medium Time: " + fmt.format(lt));

        fmt = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println("Short Datetime: " + fmt.format(ldt));

        fmt = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println("Medium Datetime: " + fmt.format(ldt));

        fmt = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.GERMAN);
        System.out.println(fmt.format(ldt));

        fmt = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(new Locale("en", "IN"));
        System.out.println(fmt.format(ldt));
    }
}
