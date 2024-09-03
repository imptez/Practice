import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Test22 {

        public static void main(String[] args) {
            String originalTimestamp = "2024-09-30 00:00:00.00 ";

            System.out.println(isExpiryDateValid(originalTimestamp));
        }

    private static final DateTimeFormatter FORMATTER1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    private static final DateTimeFormatter FORMATTER2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S");
    private static final DateTimeFormatter FORMATTER3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private static boolean isExpiryDateValid( String expiryDate) {
        LocalDateTime expiryDateTime = parseExpiryDate(expiryDate);
        if (expiryDateTime == null) {
            return false;
        }

        LocalDateTime today = LocalDateTime.now();
        if (expiryDateTime.isAfter(today)) {
            return true;
        }

        return false;
    }

    private static LocalDateTime parseExpiryDate(String expiryDate) {
        DateTimeFormatter[] formatters = {FORMATTER1, FORMATTER2, FORMATTER3};
        for (DateTimeFormatter formatter : formatters) {
            try {
                return LocalDateTime.parse(expiryDate, formatter);
            } catch (DateTimeParseException e) {
                continue;
            }
        }
        return null; // If none of the formatters work, return null
    }

}

