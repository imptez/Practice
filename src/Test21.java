import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Test21 {
    // Formatters for the date patterns
    private static final DateTimeFormatter FORMATTER1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    private static final DateTimeFormatter FORMATTER2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S");

    public static void main(String[] args) {
        String dateStr1 = "2024-08-07 14:30:45.123";
        String dateStr2 = "2024-08-07 14:30:45.1";

        if (isValidDate(dateStr1)) {
            System.out.println("Date string 1 is valid.");
            // Proceed with the valid date
        } else {
            System.out.println("Date string 1 is invalid.");
        }

        if (isValidDate(dateStr2)) {
            System.out.println("Date string 2 is valid.");
            // Proceed with the valid date
        } else {
            System.out.println("Date string 2 is invalid.");
        }
    }

    public static boolean isValidDate(String dateStr) {
        return isValidFormat(dateStr, FORMATTER1) || isValidFormat(dateStr, FORMATTER2);
    }

    private static boolean isValidFormat(String dateStr, DateTimeFormatter formatter) {
        try {
            LocalDateTime.parse(dateStr, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}

