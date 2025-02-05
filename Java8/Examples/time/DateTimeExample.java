import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        // LocalDate: Represents a date without time
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today); // Output: Today's Date: 2024-07-31 (or current date)

        // LocalTime: Represents a time without date
        LocalTime now = LocalTime.now();
        System.out.println("Current Time: " + now); // Output: Current Time: 14:30:00 (or current time)

        // LocalDateTime: Represents a date and time without timezone
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + dateTime); // Output: Current Date and Time: 2024-07-31T14:30:00 (or current date and time)

        // ZonedDateTime: Represents a date and time with timezone
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current Date and Time in New York: " + zonedDateTime); // Output: Current Date and Time in New York: 2024-07-31T14:30:00-04:00[America/New_York]

        // Formatting Date and Time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime); // Output: Formatted Date and Time: 31-07-2024 14:30:00

        // Parsing a Date from a String
        String dateString = "31-07-2024 14:30:00";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateString, formatter);
        System.out.println("Parsed Date and Time: " + parsedDateTime); // Output: Parsed Date and Time: 2024-07-31T14:30:00
    }
}
